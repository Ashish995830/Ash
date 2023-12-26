package stepDefination;

import io.cucumber.java.en.And;
import page.EmptyCartPage;

public class EmptyCartSteps {
	
	EmptyCartPage removeBtn = new EmptyCartPage();

	@And("click on remove button")
	public void click_on_remove_button() {
		
		removeBtn.click_on_remove_button();

		
		
	}

}
