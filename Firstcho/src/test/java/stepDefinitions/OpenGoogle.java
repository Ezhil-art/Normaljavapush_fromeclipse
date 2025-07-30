package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	
	WebDriver driver;
	
	@Given("user is entering facebook.com")
	public void user_is_entering_google_co_in() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    
	}

	@When("user is typing username and password and validate")
	public void user_is_typing_the_search_term_ezhilan() {
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("Ezhilan");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Ezhilan@123");
	    
	}

	@When("click the login button")
	public void click_the_login_button() {
	    
	WebElement lgnbtn = driver.findElement(By.name("login"));
		lgnbtn.click();
	   
	}

	@Then("the user should quit the browser")
	public void the_user_should_quit_the_browser() {
	    
		driver.quit();
		
	  
	}

}
