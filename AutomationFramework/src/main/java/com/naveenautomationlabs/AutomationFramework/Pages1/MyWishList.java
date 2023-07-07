package com.naveenautomationlabs.AutomationFramework.Pages1;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyWishList extends TestBase {

	public MyWishList() {
		PageFactory.initElements(wd, this);
	}



	@FindBy(css = "div.table-responsive")
	private WebElement productDetails;

	// @FindBy(css = "ul.list-inline>li:nth-of-type(3) a")
	// private WebElement clickWishListButton;

	@FindBy(css = "table.table-bordered tr")
	private List<WebElement> wishlistItems;

//	public WishList clickWishListButton()
//	{
//		clickWishListButton.click();
//		return new WishList();

//	}

	public WebElement getCellElementFromTable(MyWishListTable column, String modelname) {
		int columnindex = getIndexOfColumn(column);
		if (columnindex < 0) {
			throw new NoSuchElementException();
		}

		List<WebElement> rowsElement = wd.findElements(By.cssSelector("div.table-responsive table.table tbody tr"));
		for (int i = 0; i < rowsElement.size(); i++) {
			List<WebElement> cells = rowsElement.get(i).findElements(By.cssSelector("td"));
			if (cells.get(2).getText().equals(modelname)) {
				return cells.get(columnindex);
			}

		}
		return null;
	}

	private WishListItem getProductByName(String productName) {
		for (WebElement wishlistItem : wishlistItems) {
			String name = wishlistItem.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[2]/a"))
					.getText();
			if (name.equals(productName)) {
				return new WishListItem(wishlistItem);
			}
		}
		return null;
	}

	// create a structure of the table

	public enum MyWishListTable {

		IMAGE("Image"), PRODUCT_NAME("Product Name"), MODEL("Model"), STOCK("Stock"), UNIT_PRICE("Unit Price"),
		ACTIONS("Action");


		String value;

		private MyWishListTable(String value) {
			this.value = value;
		}

		public String getTableHeaderValue() {
			return value;
		}

	}

	public int getIndexOfColumn(MyWishListTable columnName) {
		List<WebElement> headers = wd.findElements(By.cssSelector("table.table thead tr td"));
		for (WebElement headerElement : headers) {
			if (headerElement.getText().equals(columnName.value))
			{
				return headers.indexOf(headerElement);
			}
		}
		return -1;
	}

}
