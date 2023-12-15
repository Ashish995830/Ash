package page;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class SortList extends Base {

	public void click_on_sort_list() {

		WebElement dropDown = driver.findElement(By.cssSelector("select.product_sort_container"));
		clickOnElement(dropDown);

	}

	public void validate_element_of_list() {

		List<WebElement> list = driver.findElements(By.cssSelector("select.product_sort_container"));
		List<String> list2 = new ArrayList<String>();
		list2.add("Name (A to Z)");
		list2.add("Name (Z to A)");
		list2.add("Price (low to high)");
		list2.add("Price (high to low)");
		for (int i = 0; i < list.size(); i++) {

			assertEquals(list.get(i).getText(), list2.get(i));

		}

	}
}
