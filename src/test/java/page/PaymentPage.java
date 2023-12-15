package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class PaymentPage extends Base {

	public void clickOnCartButton() {

		WebElement clickOnCartButton = driver.findElement(By.cssSelector("[fill='currentColor']"));
		clickOnElement(clickOnCartButton);
	}

	public void clickCheckout() {

		WebElement clickCheckout = driver.findElement(By.cssSelector("a.btn_action.checkout_button"));
		clickOnElement(clickCheckout);
	}

	public void enterDetails(String a, String b, String c) {

		WebElement firstName = driver.findElement(By.cssSelector("input#first-name"));
		firstName.sendKeys(a);

		WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
		lastName.sendKeys(b);

		WebElement zipCode = driver.findElement(By.cssSelector("input#postal-code"));
		zipCode.sendKeys(c);

	}

	public void user_click_on_continue_button() {

		WebElement continueBtn = driver.findElement(By.cssSelector("input.btn_primary.cart_button"));
		clickOnElement(continueBtn);
	}

	public void user_click_on_Finish_button() {

		WebElement finishBtn = driver.findElement(By.cssSelector("a.btn_action.cart_button"));
		clickOnElement(finishBtn);

	}

	public void validate_successful_message() {

		WebElement thankYouHeading = driver.findElement(By.cssSelector("h2.complete-header"));
		validateText(thankYouHeading, "THANK YOU FOR YOUR ORDER");
	}

}
