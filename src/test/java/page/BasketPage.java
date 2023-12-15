package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void addProduct() {

		WebElement productadd = driver.findElement(By.cssSelector("button.btn_primary.btn_inventory"));
		clickOnElement(productadd);
	}

	public void validate_add_cart() {

		WebElement addCart = driver.findElement(By.cssSelector("span.fa-layers-counter.shopping_cart_badge"));
		validateText(addCart, "1");

	}
}