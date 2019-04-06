package step_definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Home;
import pages.Register;
import cucumber.api.java.en.Then;

public class UserregistrationDatadrivenTest {
	public WebDriver driver; 
	
	 
	 public UserregistrationDatadrivenTest()
	    {
	        driver = Hooks.driver;
	       
	    }
	 
	 @And("^Enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	 public void populatevalues(String username, String password, String cpassword)
//	 public void entervalues(String value1,String value2,String value3)
	 {

			driver.findElement(By.name("email")).sendKeys(username);
	 	    driver.findElement(By.name("password")).sendKeys(password);
	 	    driver.findElement(By.name("confirmPassword")).sendKeys(cpassword);
	 	   
	 }
	 @And("^click on submit$")
	 public void clickonsubmit() throws InterruptedException
	 {
		 driver.findElement(By.name("register")).click();
	 	    Thread.sleep(2000);
	 } 
	 
	 @Then("^I verify the \"(.*?)\" creation$")
	 public void usernameverification(String username)
	 {
		 String  sActualValue=driver.findElement(By.tagName("Body")).getText();
		 System.out.println( "check the actual value:"+sActualValue);
		 String expected = "Your user name is "+username; 
		 Assert.assertTrue(sActualValue.contains(expected));
	 }
	    
	    
	}
