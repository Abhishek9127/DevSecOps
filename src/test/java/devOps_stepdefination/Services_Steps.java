package devOps_stepdefination;

import devOps_pages.Services_Pagefile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class Services_Steps {
	
	Services_Pagefile a = new Services_Pagefile();

	@Given("click on the services icon")
	public void click_on_the_services_icon() {
	a.click_on_the_services_icon();
	}

	@Then("Validate with text on the page")
	public void validate_with_text_on_the_page() {
	 a.validate_with_text_on_the_page();
	}

	
}
