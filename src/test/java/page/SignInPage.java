package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class SignInPage extends Base {

	public void user_enter_username_and_password(String u, String p) {
		WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		expcilitWait(10, username, "visible");
		username.sendKeys(u);

		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys(p);
	}

	public void user_click_on_login_button() {

		WebElement LoginBtn = driver.findElement(By.cssSelector("input#login-button"));
		clickOnElement(LoginBtn);

	}

	public void validate_successful_login() {
    WebElement productHeading = driver.findElement(By.cssSelector("div.product_label"));
    validateText(productHeading, "Products");
	}

}
