package com.sucharita.JiraApi;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JiraAPICloudTest1 {

	private String issueId;

	@Test

	@BeforeMethod
	public void setup() {
		RestAssured.baseURI = RestAssured.baseURI = JiraConfig.BASE_URL;
		// String token = "Basic
		// c2Vuc3VjaGFyaXRhMTVAZ21haWwuY29tOkFUQVRUM3hGZkdGMFRSV1FOWGxQQm53anhIc1M3bnZIVTlYd0dhTkN0YmNGYlFJS0t5bmV2aDlvSlo5Y2V3VFBiS0pnZG0wODJOcXVOM3VhU1hKa3Q1WDc3QlFLUzNVOGxKNGJmWV9qNWFXaFNPa0hhZnZZOWNvdmwxZ1lYUl9JOWk3VE4xcVBsei10eWIxUE80bV93X0lMN2tyZTBycnQwdWNTOS1ZdkJvVzJaMnc0dXlZRGZfMD0xQ0Q1MjcwMw==";
	}

	@Test(priority = 1)
	// @Ignore

	public void testGetProjects() {
		// RestAssured.baseURI = "https://sucharitas.atlassian.net/rest/api/3";
		given().header("Authorization",
				JiraConfig.TOKEN)
				.when().get("project").then().assertThat().statusCode(200).log().all();
	}

	@Test(priority = 2)
	// @Ignore
	public void testGetIssueUsingID() {
		given().header("Authorization",
				JiraConfig.TOKEN)
				.when().get("/issue/JIR-3").then().assertThat().statusCode(200).log().all();
	}

	@Test(priority = 3)
	// @Ignore
	public void testCreateIssue() {
		Response response = given().header("Authorization",
				JiraConfig.TOKEN)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"fields\": {\r\n" + "    \"summary\": \"Main order flow broken 2\",\r\n"
						+ "    \"project\":\r\n" + "    {\r\n" + "      \"id\": \"10000\"\r\n" + "    },\r\n"
						+ "   \r\n" + "    \"description\":{\r\n" + "        \"type\": \"doc\",\r\n"
						+ "      \"version\": 1,\r\n" + "      \"content\": [\r\n" + "        {\r\n"
						+ "          \"type\": \"paragraph\",\r\n" + "          \"content\": [\r\n"
						+ "            {\r\n"
						+ "              \"text\": \"Order entry fails when selecting supplier.\",\r\n"
						+ "              \"type\": \"text\"\r\n" + "            }\r\n" + "          ]\r\n"
						+ "        }\r\n" + "      ]}\r\n" + "    ,\r\n" + "    \"issuetype\": {\r\n"
						+ "      \"id\": \"10001\"\r\n" + "    }\r\n" + "  }\r\n" + "}")
				.when().post("/issue");
		response.then().assertThat().statusCode(201).log().all();

		issueId = response.jsonPath().getString("id");
		System.out.println("Issue ID: " + issueId);
	}
	
	@Test(priority = 4)
	public void testEditIssue()
	{
		String dynamicDescription = RandomUtils.generateRandomString(20);

		given().header("Authorization",
				JiraConfig.TOKEN)
				.header("Content-Type", "application/json")
				.body("{\r\n" + "  \"fields\": {\r\n" + "    \"summary\": \"UPDATED----Main order flow broken 2\",\r\n"
						+ "    \"project\":\r\n" + "    {\r\n" + "      \"id\": \"10000\"\r\n" + "    },\r\n"
						+ "   \r\n" + "    \"description\":{\r\n"
						+ "      \"type\": \"doc\",\r\n"
						+ "      \"version\": 1,\r\n" + "      \"content\": [\r\n" + "        {\r\n"
						+ "          \"type\": \"paragraph\",\r\n" + "          \"content\": [\r\n"
						+ "            {\r\n"
						+ "              \"text\":\" " + dynamicDescription + "\",\r\n"
						+ "              \"type\": \"text\"\r\n" + "            }\r\n" + "          ]\r\n"
						+ "        }\r\n" + "      ]}\r\n" + "    ,\r\n" + "    \"issuetype\": {\r\n"
						+ "      \"id\": \"10001\"\r\n" + "    }\r\n" + "  }\r\n" + "}")
				.when().put("/issue/" + issueId).then().assertThat().statusCode(204).log().all();
	}

	@Test(priority = 5)
//	@Ignore

	public void testDeleteIssueUsingID() {
		given().header("Authorization",
				JiraConfig.TOKEN)
				.when().delete("/issue/" + issueId).then().assertThat().statusCode(204).log().all();
	}
	}


