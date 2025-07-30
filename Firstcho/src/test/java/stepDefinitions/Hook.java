package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hook {
	
	@Given("Thanos has infinty thones")
	public void thanos_has_infinty_thones() {
	   System.out.println("Thanos has infinty thones");
	}

	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
	    System.out.println("Thanos snaps his finger");
	}

	@Then("half of the living things died")
	public void half_of_the_living_things_died() {
	    System.out.println("half of the living things died");
	}
	

}
