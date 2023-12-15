package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;


public class Cancel extends Base {

	public void click_on_cancel_button() {
		
		WebElement cancelBtn = driver.findElement(By.cssSelector("a.btn_secondary"));
		clickOnElement(cancelBtn);

	}

	public void validate_the_product_page() {
		
		WebElement prductHeading = driver.findElement(By.cssSelector("div.product_label"));
		validateText(prductHeading, "Products");

	}
}
