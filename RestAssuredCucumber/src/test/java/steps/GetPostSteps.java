package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class GetPostSteps {

	@Given("^I perform GET operation for \"([^\"]*)\"$")
	public void i_perform_GET_operation_for(String arg1) throws Throwable {
	  
		System.out.println("Test1 !!!");
	}

	@And("^I perform GET for the post numebr \"([^\"]*)\"$")
	public void i_perform_GET_for_the_post_numebr(String arg1) throws Throwable {
		
		System.out.println("Test 2 !!!");
	}

	@Then("^I should see the author name as \"([^\"]*)\"$")
	public void i_should_see_the_author_name_as(String arg1) throws Throwable {

		System.out.println("Test 3 !!!");
		System.out.println("Just ot check Jenkins auto job trigger after Git push");
	}

	
	
}
