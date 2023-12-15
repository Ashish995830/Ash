package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.ContiShopping;

public class ContiShoppingSteps {

	ContiShopping contiBtn = new ContiShopping();

	@And("click on contiune shopping button")
	public void click_on_contiune_shopping_button() {

		contiBtn.click_on_contiune_shopping_button();

	}

	@Then("validate the cart page")
	public void validate_the_cart_page() {

		contiBtn.validate_the_cart_page();
	}
}
