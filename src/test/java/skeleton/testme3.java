package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testme3 
{
	WebDriver driver;
	
	@Given("User open TestMe app")
	public void user_open_TestMe_app()
	{
	   System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://localhost:8083/TestMeApp");
	   System.out.println("application opened");
	}

	@When("user Signs in")
	public void user_Signs_in() 
	{
	   WebElement s=driver.findElement(By.linkText("SignIn"));
	   s.click();
	   WebElement u=driver.findElement(By.name("userName"));
	   u.sendKeys("Aishu19");
	   WebElement p=driver.findElement(By.name("password"));
	   p.sendKeys("Aishu123");
	   WebElement l=driver.findElement(By.name("Login"));
	   l.click();
	}

	@And("user search for product")
	public void user_search_for_product() 
	{
	   driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
	
	   
	 
			   driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();

	   
	
			  driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
	   
	   
			   driver.findElement(By.id("pname")).sendKeys("Head",Keys.ENTER);

	   
	  
	  
	   driver.findElement(By.linkText("Add to cart")).click();
	  
	   
	 
			   driver.findElement(By.partialLinkText("Cart")).click();
	  
	   
	
			   driver.findElement(By.linkText(" Checkout")).click();
	
	  

			   driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
			   driver.close();
	
	}

	@Then("user validate search successfully")
	public void user_validate_search_successfully() 
	{
	  System.out.println("search successfull");
	}
}
