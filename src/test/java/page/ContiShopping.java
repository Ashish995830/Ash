package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class ContiShopping extends Base {

	public void click_on_contiune_shopping_button() {

		WebElement contiBtn = driver.findElement(By.cssSelector("a.btn_secondary"));
		clickOnElement(contiBtn);

	}

	public void validate_the_cart_page() {

		WebElement prductHeading = driver.findElement(By.cssSelector("div.product_label"));
		validateText(prductHeading, "Products");
	}
}
