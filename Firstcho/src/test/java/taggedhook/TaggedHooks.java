package taggedhook;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks {
	
	@Given("i want to learn hook first")
	public void i_want_to_learn_hook_first() {
	    System.out.println("i want to learn hook first");
	}

	@When("i want to access hook first")
	public void i_want_to_access_hook_first() {
	    System.out.println("i want to access hook first");
	}

	@Then("i want to close this hook first")
	public void i_want_to_close_this_hook_first() {
	   System.out.println("i want to close this hook first");
	}

}
