package stepDefination;

import io.cucumber.java.en.And;
import page.CheckoutPage;

public class CheckoutPageSteps {

	CheckoutPage error = new CheckoutPage();

	@And("validate error message")
	public void validate_error_message() {

		error.validate_error_message();
	}

}
