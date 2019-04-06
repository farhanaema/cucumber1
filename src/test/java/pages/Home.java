package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	
	WebDriver driver;
	
	
	//Page object Model framework - webelements
	
//	WebElement registerlink=By.linkText("REGISTER");
//	WebElement signonlink= By.linkText("SIGN-ON");
//	WebElement usernametextfiled= By.name("userName")
	
	//Page factory framework
	
	@FindBy(linkText="SIGN-ON")
	private WebElement signonlink;
	@FindBy(linkText="REGISTER")
	private WebElement registerlink;
	@FindBy(name="userName")
	private WebElement usernametextfiled;
	
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public Home(WebDriver driver){
	///	this.driver = driver;
		//This initElements method will create  all WebElements
	//	PageFactory.initElements(driver, this);
	//}
	
			
	
	//Operations 
	public void clickonregisterlink() throws InterruptedException
	{
	//	driver.findElement(registerlink).click();
		
		registerlink.click();
		
		Thread.sleep(2000);
	}
	
	public void clickonsignonlink() throws InterruptedException
	{
		//driver.findElement(signonlink).click();
		signonlink.click();
		Thread.sleep(2000);
	}
	
}
