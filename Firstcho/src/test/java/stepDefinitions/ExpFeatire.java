package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpFeatire {
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	   System.out.println("Laptop count = "+int1);
	}

	@Given("i have {double} cgpa")
	public void i_have_cgpa(Double double1) {
		System.out.println("My cgpa is =" +double1);
	   
	}

	@Given("{string} is elder to {string} and {string}")
	public void is_elder_to_and(String name, String name1, String name2) {
	   System.out.println(name+ "is elder to "+ name1 + name2);
	}

}
