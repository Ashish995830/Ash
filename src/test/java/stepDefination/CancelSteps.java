package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.Cancel;

public class CancelSteps {

	Cancel cancelBtn = new Cancel();
	
	@And("click on cancel button")
	public void click_on_cancel_button() {
		cancelBtn.click_on_cancel_button();

	}

	@Then("validate the product page")
	public void validate_the_product_page() {
		cancelBtn.validate_the_product_page();

	}

}
