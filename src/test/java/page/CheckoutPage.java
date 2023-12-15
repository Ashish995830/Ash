package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {

	public void validate_error_message() {

		WebElement errorButton = driver.findElement(By.cssSelector("button.error-button"));
		errorButton.isDisplayed();

	}
}
