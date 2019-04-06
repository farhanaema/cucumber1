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


public class MerucryFlightTest {

	 public  WebDriver driver;
	 String url = "http://newtours.demoaut.com/";
	 Home hp;
	 Register rp;
	 
	

	    public MerucryFlightTest()
	    {
	        driver = Hooks.driver;
	       
	    }
	 
	 
@Given("^Navigate to the Mercury flight application$")
public void navigate_to_the_Mercury_flight_application() throws InterruptedException {
  
	
	driver.get(url);	
	Thread.sleep(2000);
 
     
    
    
}

@When("^Click on Register Link$")
public void click_on_Register_Link() throws InterruptedException {
   
	 hp= new Home(driver);
	hp.clickonregisterlink();

  //  throw new cucumber.api.PendingException();
    
    
}

@Then("^Register Page displayed$")
public void register_Page_displayed() {
   
	String ExpectedValue = "Register: Mercury Tours";
	//String ActualValue= driver.getTitle();
	 rp= new Register(driver);
	String ActualValue= rp.getTitle();
	System.out.println( "expected"+ExpectedValue);
	System.out.println( "actual"+ActualValue);
	Assert.assertEquals(ExpectedValue, ActualValue);
	
   // throw new cucumber.api.PendingException();
    
}

@Then("^Close the appliaction$")
public void close_the_appliaction() {
    driver.close();
    driver.quit();
  // throw new cucumber.api.PendingException();
}

@When("^Enter Valid details and submit$")
public void enter_Valid_details_and_submit() throws InterruptedException {
  
	 rp= new Register(driver);
	rp.createUserRegistration();
	
  //  throw new cucumber.api.PendingException();
}

@Then("^User should create$")
public void user_should_create() {
   
	 //String  sActualValue=driver.findElement(By.tagName("Body")).getText();
	 rp= new Register(driver);
	String  sActualValue=rp.gettext();
	 System.out.println( "check the actual value:"+sActualValue);
	 String expected = "Your user name is Test@test.com"; 
	 Assert.assertTrue(sActualValue.contains(expected));
	 
 //   throw new cucumber.api.PendingException();
}



}
