package com.naveenautomationlabs.AutomationFramework.Pages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStore extends TestBase {
	WebDriverWait wait;
	Actions action;

	public YourStore() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#search > input")
	private WebElement searchInput;

	@FindBy(css = "#search > span > button")
	private WebElement searchButton;

	@FindBy(css = "button.btn-default.btn-lg")
	private WebElement searchButton1;

	@FindBy(css = "ul.list-inline>li:nth-of-type(2) a")
	private WebElement myAccountBtn;

	@FindBy(css = "ul.dropdown-menu li:nth-of-type(2) a")
	private WebElement loginBtn;

	@FindBy(css = "#content > div.carousel.swiper-viewport > div.swiper-pagination.carousel0.swiper-pagination-clickable.swiper-pagination-bullets")
	private WebElement movingDots;

	@FindBy(css = "div#carousel0")
	private WebElement elementToHover;

	@FindBy(css = "#content > div.slideshow.swiper-viewport > div.swiper-pager > div.swiper-button-next")
	private WebElement nextButtonSwiper;

	@FindBy(css = ".product-layout")
	private WebElement searchResults;

	@FindBy(css = ".product-layout .product-thumb h4 a")
	private WebElement productName1;

	@FindBy(css = "button[onclick *='cart.add']")
	private WebElement addToCartButton;

	@FindBy(css = "button[onclick *='wishlist.add']")
	private WebElement addToWishListButton;

	@FindBy(css = "div.alert-success")
	private WebElement successMessage;

	@FindBy(css = ".product-layout .product-thumb p.price")
	private WebElement productPrice1;

	@FindBy(css = "#top-links > ul > li:nth-child(4) > a")
	private WebElement shoppingCartButton;

	@FindBy(css = "div.product-layout")
	private List<WebElement> productElements;

	@FindBy(css = "#wishlist-total")
	private WebElement wishlistTotal;
	


	public void clickNextButton() {
		nextButtonSwiper.click();

	}

	public void addToCartFunction() {
		addToCartButton.click();
		wait = new WebDriverWait(wd, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
		// Assert.assertTrue(successMessage.isDisplayed(), "Add to cart message not
		// displayed");
		System.out.println(successMessage.getText());
		shoppingCartButton.click();

//		wait.until(
//				ExpectedConditions.urlToBe("/cart"));
		String currentPageUrl = wd.getCurrentUrl();
		// Assert.assertTrue(currentPageUrl.contains("/cart"), "The product was not
		// successfully added to the cart");
	}

	public void searchForItem(String itemName) {
		searchInput.sendKeys(itemName);
		searchButton1.click();
	}

	public void navigateToHomePage() {
		wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}

	public WebElement getMovingDots() {
		return movingDots;
	}

	public void searchAnyProductDetails(String productName) {
		searchInput.clear();
		searchInput.sendKeys(productName);
		searchButton1.click();
//	Assert.assertTrue(searchResults.isDisplayed(), "search results not displayed");
		// Assert.assertNotNull(productName1.getText(), "Product name is not
		// available");
//		Assert.assertNotNull(productPrice1.getText(), "Product price is not available");

	}

	public boolean issearchResultDisplayed() {
		return searchResults.isDisplayed();
	}

	public String getProductName() {
		return productName1.getText();
	}

	public String getProductPrice() {
		return productPrice1.getText();
	}


	public void searchProductAndValidate() {
		searchInput.clear();
		searchInput.sendKeys("iPhone");

		searchButton.click();

	}

	public void testMovingDots() {
		action = new Actions(wd);
		// actions.moveToElement(countryOption).click().perform();
		wait = new WebDriverWait(wd, 10);
		// verify if the element is present
		Assert.assertNotNull(movingDots, "Element is not present on the page");
		action.moveToElement(elementToHover).perform();
//		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.cssSelector("#content > div.carousel.swiper-viewport > div.swiper-pager >	 div.swiper-button-next")));
		// nextButtonSwiper.click();
		// get the initial number of dots
		int initialDotCount = movingDots.findElements(By.tagName("span")).size();

		System.out.println("The initial location is" + initialDotCount);
		action.moveToElement(elementToHover).perform();

		// action.moveToElement(nextButtonSwiper).click().perform();

		// get a new dots of the element
		int newDotCount = movingDots.findElements(By.tagName("span")).size();
		System.out.println("The new location is" + newDotCount);

		// verify if the element has moved
		Assert.assertNotEquals(initialDotCount, newDotCount, "Element did not move");

	}

	public YourStore clickMyAccountBtn() {
		myAccountBtn.click();
		return new YourStore();
	}

	public AccountLogin clickloginbtn() {
		loginBtn.click();
		return new AccountLogin();

	}
	

	public ProductItem getProductByName1(String productName) {
		for (WebElement productElement : productElements) {
			String name = productElement.findElement(By.cssSelector(" div.caption > h4")).getText();
			if (name.equals(productName)) {
				return new ProductItem(productElement);
			}
		}

		return null;
	}

	public boolean isSuccessMessageDisplayed() {
		return successMessage.isDisplayed();
	}

	public void clickWishListTotal() {
		wishlistTotal.click();
	}





}
