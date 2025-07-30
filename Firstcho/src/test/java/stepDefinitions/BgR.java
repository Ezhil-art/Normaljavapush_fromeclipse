package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BgR {
	public static WebDriver driver;
	
	@Given("I try col")
	public void i_try_col() {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("I send data col")
	public void i_send_data_col(DataTable data) {
		List<Map<String, String>> alldata = data.asMaps();
		
		WebElement Username = driver.findElement(By.id("email"));
		
		WebElement pass = driver.findElement(By.id("pass"));
		
		Username.sendKeys(alldata.get(0).get("aaaaaa"));
		pass.sendKeys(alldata.get(0).get("kkkkkkk"));
	}

	@Then("I checked col")
	public void i_checked_col() {
	    driver.quit();
	}

}
