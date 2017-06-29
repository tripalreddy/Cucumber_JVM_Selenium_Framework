package step_definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class stepDefinitions3 {
	WebDriver driver=null;
	@When("^enter test Data table keywords$")
	public void enter_test_Data_table_keywords(DataTable keys) throws Throwable {
		List<List<String>> testdata=keys.raw();
		System.out.println(testdata.get(1).get(0));
		driver.findElement(By.id("lst-ib")).click();
		driver.findElement(By.id("lst-ib")).sendKeys(testdata.get(1).get(0));

	}
	
}
