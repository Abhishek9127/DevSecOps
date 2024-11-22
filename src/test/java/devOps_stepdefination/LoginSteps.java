package devOps_stepdefination;

import devOps_pages.LoginPagefile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPagefile b = new LoginPagefile();

	@Given("Click on the homepage login button")
	public void click_on_the_homepage_login_button() {
		b.click_on_the_homepage_login_button();
	}

	@When("Enter the email and password")
	public void enter_the_email_and_password() {
		b.enter_the_email_and_password();
	}

	@When("Click on login")
	public void click_on_login() {
		b.click_on_login();
	}

	@Then("Validate the login")
	public void validate_the_login() {
		b.validate_the_login();
	}
}
