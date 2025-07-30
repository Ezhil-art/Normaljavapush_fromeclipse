package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithoutFeature {
	WebDriver driver;
	@Given("the user should launch the browser")
	public void the_user_should_launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
	}

	@When("Let me update test both fields")
	public void let_me_update_test_both_fields(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		List<List<String>> cred1 = dataTable.asLists();
		String username1 = cred1.get(0).get(0);  // row 0, column 0 → hello
	    String password1 = cred1.get(0).get(1);  // row 0, column 1 → hello@123
	    
	    String username2 = cred1.get(1).get(0);  // row 1, column 0 → testuser
	    String password2 = cred1.get(1).get(1);  // row 1, column 1 → test@456
		
	    String username3 = cred1.get(2).get(0);  // row 1, column 0 → testuser
	    String password3 = cred1.get(2).get(1);  // row 1, column 1 → test@456
		
	   driver.findElement(By.id("email")).sendKeys(username1);
	   driver.findElement(By.id("pass")).sendKeys(password1);
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).clear();
	   driver.findElement(By.id("pass")).clear();
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).sendKeys(username2);
	   driver.findElement(By.id("pass")).sendKeys(password2);
	   
	   driver.findElement(By.id("email")).clear();
	   driver.findElement(By.id("pass")).clear();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).sendKeys(username3);
	   driver.findElement(By.id("pass")).sendKeys(password3);
	}

	   

	@When("let me click the login button")
	public void let_me_click_the_login_button() {
		WebElement lgnbtn = driver.findElement(By.name("login"));
		lgnbtn.click();
	}

	/*@Then("once update and checked i will quit the webdriver")
	public void once_update_and_checked_i_will_quit_the_webdriver() {
		driver.quit();*/
	}



