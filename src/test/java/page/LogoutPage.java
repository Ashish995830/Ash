package page;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LogoutPage extends Base {

	public void click_on_ham_burger_button() {

		WebElement hamburger = driver.findElement(By.cssSelector("div.bm-burger-button"));
		clickOnElement(hamburger);
	}

	public void validate_presence_of_element() {

		List<WebElement> list = driver.findElements(By.cssSelector("a.bm-item.menu-item"));
		List<String> list2 = new ArrayList<String>();
		list2.add("All Items");
		list2.add("About");
		list2.add("Logout");
		list2.add("Reset App State");

		for (int i = 0; i < list.size(); i++) {
			assertEquals(list.get(i).getText(), list2.get(i));

		}
	}

	public void click_on_the_logout_button() {

		WebElement logOutBTn = driver.findElement(By.cssSelector("a#logout_sidebar_link"));
		clickOnElement(logOutBTn);

	}

	public void validate_the_logout() {
		WebElement BotLogo = driver.findElement(By.cssSelector("img.bot_column"));
		assertEquals(true, BotLogo.isDisplayed());

	}

}
