package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {

	WebDriver driver=null;
	 public static List<HashMap<String,String>> datamap = null;
	    public stepDefinitions()
	    {
	    	driver = Hooks.driver;
	    	
	    	datamap = new ArrayList<HashMap<String,String>>();
	    	HashMap<String,String> googltestData = new HashMap<String,String>();
	    	googltestData.put("GoogleTest","testgoog");
	    	System.out.println("Current data1" +googltestData);
	    	datamap.add(googltestData);
	    }
@Given("^I navigate to Google\\.com website$")
public void navigateToGoogleSite() throws Throwable {
	System.out.println("navigated to Google website");
	driver=new FirefoxDriver();
	driver.navigate().to("http://www.google.com");
	
}

@When("^I enter search keyword$")
public void enterSearchKeyword() throws Throwable {
	System.out.println("Entered Search Keyword");
	driver.findElement(By.id("lst-ib")).click();
	HashMap<String, String> x=datamap.get(0);
	driver.findElement(By.id("lst-ib")).sendKeys(x.get("GoogleTest"));
}

@When("^I click Enter button$")
public void clickEnterButton() throws Throwable {
	System.out.println("click Enter button");
	driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
}

@SuppressWarnings("deprecation")
@Then("^Search results page is displayed$")
public void checkSearchResults() throws Throwable {
	System.out.println("see if search results page is displayed:"+driver.getTitle());	
	//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

	//WebDriverWait wait = new WebDriverWait(driver, 10);
	Thread.sleep(10000);
	
	System.out.println("see if search results page is displayed:"+driver.getTitle());	
	Assert.assertTrue("Failed to navigate/load Google search page", driver.getTitle().contains("Google Search"));

/*	if(	driver.getTitle().contains("Google Search")){
		
	}*/
driver.quit();
}



}
