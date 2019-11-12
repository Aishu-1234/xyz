package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class testme4 
{
	 WebDriver driver;
	 
	@Given("User opens the TestMe application")
	public void user_opens_the_TestMe_application()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		System.out.println("application opened");
	}

	@When("User logs into it")
	public void user_logs_into_it() 
	{
	    WebElement e=driver.findElement(By.linkText("SignIn"));
	    e.click();
	       WebElement u=driver.findElement(By.name("userName"));
		   u.sendKeys("Aishu19");
		   WebElement p=driver.findElement(By.name("password"));
		   p.sendKeys("Aishu123");
		   WebElement l=driver.findElement(By.name("Login"));
		   l.click();
	}

	@And("User searches for product")
	public void user_searches_for_product()
	{
		   driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
           driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
           driver.findElement(By.id("pname")).sendKeys("Head",Keys.ENTER);
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("User goes to cart")
	public void user_goes_to_cart() 
	{
	  Assert.assertTrue(driver.equals("Cart"));
	  driver.close();
	}

	

}
