package step_definitions;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions2 {
	WebDriver driver=null;

	@Given("^go to Google\\.com site$")
	public void go_to_Google_com_site() throws Throwable {
		driver=new FirefoxDriver();
		System.out.println("launched website site");
		driver.navigate().to("http://www.google.com");
	}

	@When("^enter test keyword \"(.*?)\"$")
	public void enter_test_keyword(String arg1) throws Throwable {
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys(arg1);
	}

	@When("^click Enter key$")
	public void click_Enter_key() throws Throwable {
		System.out.println("click Enter button");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
	}

	@Then("^Verify Search results page$")
	public void verify_Search_results_page() throws Throwable {
		Thread.sleep(10000);
		
		System.out.println("see if search results page is displayed:"+driver.getTitle());	
		Assert.assertTrue("Failed to navigate/load Google search page", driver.getTitle().contains("Google Search"));
	}

	@Then("^closebrowser$")
	public void closebrowser() throws Throwable {
		driver.quit();
	}
/*
	@When("^enter search keyword \"(.*?)\"$") 						// can also use: @When(“^User enters \”([^\”]*)\”$”)
	public void enterKeyword(String keyword) throws Throwable {
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys(keyword);
	}

	@When("^click Enter button$")
	public void clickEnter() throws Throwable {
		System.out.println("click Enter button");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	}

	@Then("^Displayed Search results page$")
	public void checkSearchPg() throws Throwable {
		Thread.sleep(10000);
		
		System.out.println("see if search results page is displayed:"+driver.getTitle());	
		Assert.assertTrue("Failed to navigate/load Google search page", driver.getTitle().contains("Google Search"));
	}*/
}
