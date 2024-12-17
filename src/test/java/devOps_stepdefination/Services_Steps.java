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

	@Given("click on the infra button")
	public void click_on_the_infra_button() {
	    a.click_on_the_infra_button();
	}

	@Then("Validate with the infra text")
	public void validate_with_the_infra_text() {
	   a.validate_with_the_infra_text();
	}

	@Given("click on the devops button")
	public void click_on_the_devops_button() {
	    a.click_on_the_devops_button();
	}

	@Then("Validate with the devops text")
	public void validate_with_the_devops_text() {
	  a.validate_with_the_devops_text();
	}

	@Given("click on the cloud button")
	public void click_on_the_cloud_button() {
	   a.click_on_the_cloud_button();
	}

	@Then("Validate with the cloud text")
	public void validate_with_the_cloud_text() {
	    a.validate_with_the_cloud_text();
	}

}
