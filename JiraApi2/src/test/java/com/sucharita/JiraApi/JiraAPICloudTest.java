package com.sucharita.JiraApi;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JiraAPICloudTest {

	static String projectId;
	static String storyId;
	static String issueId;

	@BeforeClass

	public void setup() {
		RestAssured.baseURI = JiraConfig.BASE_URL;
		// String token = "Basic
		// c2Vuc3VjaGFyaXRhMTVAZ21haWwuY29tOkFUQVRUM3hGZkdGMFRSV1FOWGxQQm53anhIc1M3bnZIVTlYd0dhTkN0YmNGYlFJS0t5bmV2aDlvSlo5Y2V3VFBiS0pnZG0wODJOcXVOM3VhU1hKa3Q1WDc3QlFLUzNVOGxKNGJmWV9qNWFXaFNPa0hhZnZZOWNvdmwxZ1lYUl9JOWk3VE4xcVBsei10eWIxUE80bV93X0lMN2tyZTBycnQwdWNTOS1ZdkJvVzJaMnc0dXlZRGZfMD0xQ0Q1MjcwMw==";
	}

	@Test(priority = 1)
		public void testMetadataApiCall() {
			// Utils.print();
			// RestAssured.baseURI = "https://katep.atlassian.net";
			Response response = given().header("Authorization", JiraConfig.TOKEN).when().log().all()
					.get("/rest/api/3/issue/createmeta")
					.then().log().all().statusCode(200)
					.extract().response();

			// Print the response body for debugging
			String responseBody = response.getBody().asString();
			System.out.println("Response Body: " + responseBody);

			// Convert the response to a JsonPath object
			JsonPath jsonPath = response.jsonPath();

			// Extract the project ID
			projectId = jsonPath.getString("projects[0].id");
			System.out.println("Project ID: " + projectId);

			// Extract the story ID (assuming the issue type is "story" in Jira)
			storyId = jsonPath.getString("projects[0].issuetypes.find { it.name == 'Story' }.id");
			System.out.println("Story ID: " + storyId);
		}
			

	//Implement call to CreateIssueMetadata and extract the project id and story id in context.

		
	@Test(priority = 2)
		public void testCreateIssueApi() {
			
			
			//Create requestBody
			
			JsonObject createIssueRequest = new JsonObject();

			JsonObject fields = new JsonObject();

			fields.addProperty("summary", "Test Summary as shown in class");

			JsonObject project = new JsonObject();

			project.addProperty("id", projectId);

			fields.add("project", project);

			JsonObject description = new JsonObject();

			description.addProperty("type", "doc");
			description.addProperty("version", 1);

			JsonArray content = new JsonArray();

			JsonObject contentObject = new JsonObject();

			contentObject.addProperty("type", "paragraph");

			JsonObject contentInternalObject = new JsonObject();
			contentInternalObject.addProperty("text", "Test description as shown in class");

			contentInternalObject.addProperty("type", "text");

			JsonArray contentInternalArray = new JsonArray();
			contentInternalArray.add(contentInternalObject);

			contentObject.add("content", contentInternalArray);

			content.add(contentObject);

			description.add("content", content);

			fields.add("description", description);

			JsonObject issuetype = new JsonObject();
			issuetype.addProperty("id", storyId);

			fields.add("issuetype", issuetype);

			createIssueRequest.add("fields", fields);
			
			System.out.println(createIssueRequest.toString());
			
			Response response = given().header("Authorization",
					JiraConfig.TOKEN)
					.header("Content-Type", "application/json").body(createIssueRequest).when().log().all()
					.post("/rest/api/3/issue");
			// response.then().assertThat().statusCode(201).log().all();


			Assert.assertEquals(response.statusCode(), 201);
			if (response.statusCode() == 400) {
				System.out.println("Error Response Body: " + response.getBody().asString());
			}

			// storyId = response.body().jsonPath().getString("id");
			issueId = response.body().jsonPath().getString(("id"));
			System.out.println("Issue ID: " + issueId);
			
		}

		@Test(priority = 3)
		public void testEditIssueSummaryApi() {
			// Assuming you already have the 'issueId' value for the issue you want to edit
			// String issueId = "ABC-123"; // Replace this with the actual issue ID

			// Create the request body for updating the summary
			JsonObject updateSummaryRequest = new JsonObject();

			JsonObject fields = new JsonObject();

			// Update the summary as needed
			fields.addProperty("summary", RandomUtils.generateRandomString(15));
			// fields.addProperty("summary", "UPDATED SUMMARY");

			updateSummaryRequest.add("fields", fields);

			// Print the update request body for debugging


			// Send the update request to the Jira API
			Response response = given().header("Authorization", JiraConfig.TOKEN)
					.header("Content-Type", "application/json").body(updateSummaryRequest).when().log().all()
					.put("/rest/api/3/issue/" + issueId);
			// Use PUT method and include the issueId in the URL

			// Check the response and perform assertions as needed
			response.then().log().all().statusCode(204);
			// Add more assertions if needed

			// Print the response body for debugging
			String responseBody = response.getBody().asString();
			System.out.println("Response Body: " + responseBody);
		}

		@Test(priority = 4)
//	@Ignore

		public void testDeleteIssueUsingID() {
			given().header("Authorization", JiraConfig.TOKEN).when().delete("/rest/api/3/issue/" + issueId).then()
					.assertThat().statusCode(204).log().all();
		}


}


