package stepDefination;

import io.cucumber.java.en.And;
import page.BasketPage;

public class BasketPageSteps {

	BasketPage basket = new BasketPage();

	@And("add product from the product list")
	public void add_cart() {

		basket.addProduct();  // products added to basket
	}

	@And("validate the cart add number")
	public void validate_cart() {

		basket.validate_add_cart();
	}
}
