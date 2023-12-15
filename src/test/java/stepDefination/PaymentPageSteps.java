package stepDefination;

import io.cucumber.java.en.And;
import page.PaymentPage;

public class PaymentPageSteps {

	PaymentPage payment = new PaymentPage();

	@And("click on cart button")
	public void click_on_cart_button() {

		payment.clickOnCartButton();
	}

	@And("click on the checkout button")
	public void click_on_the_checkout_button() {

		payment.clickCheckout();
	}

	@And("user enter firstname {string} and lastname {string} and zipCode {string}")
	public void enter_checkout_details(String x, String y, String z) {
		payment.enterDetails(x, y, z);

	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {

		payment.user_click_on_continue_button();

	}

	@And("user click on Finish button")
	public void user_click_on_Finish_button() {

		payment.user_click_on_Finish_button();

	}

	@And("validate successful message")
	public void validate_successful_message() {

		payment.validate_successful_message();
	}
}
