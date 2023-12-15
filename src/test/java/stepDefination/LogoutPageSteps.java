package stepDefination;

import io.cucumber.java.en.And;
import page.LogoutPage;

public class LogoutPageSteps {

	LogoutPage logout = new LogoutPage();

	@And("click on ham burger button")
	public void click_on_ham_burger_button() {
		logout.click_on_ham_burger_button();

	}

	@And("validate presence of element")
	public void validate_presence_of_element() {
		

	}

	@And("click on the logout button")
	public void click_on_the_logout_button() {
		logout.click_on_the_logout_button();

	}

	@And("validate the logout")
	public void validate_the_logout() {
		logout.validate_the_logout();

	}
}
