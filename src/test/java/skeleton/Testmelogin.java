package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testmelogin 
{
	WebDriver driver;
	
	@Given("User logs in to TestMe app")
	public void user_logs_in_to_TestMe_app() 
	{
	   System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:8083/TestMeApp");
	   System.out.println("application opened");
	   
	}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() 
	{
		 driver.findElement(By.linkText("SignIn")).click();
		   System.out.println("clicks on Sign In");
	}

	@And("user enters username")
	public void user_enters_username() 
	{
	  WebElement u=driver.findElement(By.name("userName"));
	  u.sendKeys("Aishu19");
	  System.out.println("enter username");
	}

	@And("user enters the password")
	public void user_enters_the_password()
	{
		WebElement p=driver.findElement(By.name("password"));
		  p.sendKeys("Aishu123");
		  System.out.println("enter password");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button()
	{
	  WebElement l=driver.findElement(By.name("Login"));
	  l.click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Then("user validates login successfull")
	public void user_validates_login_successfull() 
	{
	   System.out.println("Login successfull");
	}
}
