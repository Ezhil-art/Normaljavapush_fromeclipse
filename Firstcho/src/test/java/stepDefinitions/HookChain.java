package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookChain {
	@Before ("@Regression")
	public void superpower() {
		System.out.println("Thanos got initial super power");
	}
	@After ("@Regression")
	public void takerevenge() {
		
		System.out.println("Thonas started revenge");
		
	}
	@Before ("@Regression")
public void takerevenge1() {
		
		System.out.println("Thonas has to be born");

}
@After ("@Regression")	
public void takerevenge2() {
		
		System.out.println("Thonas is died");
}
}
