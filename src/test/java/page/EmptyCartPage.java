package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class EmptyCartPage extends Base {
	
	
	public void click_on_remove_button() {
		
		WebElement removeBtn = driver.findElement(By.cssSelector("button.btn_secondary.cart_button"));
		clickOnElement(removeBtn);
		
	}

}
