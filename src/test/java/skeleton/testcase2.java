package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class testcase2 
{
	WebDriver driver;
	
	@Given("user open application newtours.demoaut.com")
	public void user_open_application_newtours_demoaut_com() {
	
	   System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	    System.out.println("open application");
	}

	@When("user clicks on registration")
	public void user_clicks_on_registration() {
		driver.findElement(By.linkText("REGISTER")).click();
		
	    System.out.println("clicks on registration");
	    
	}

	@Then("user validates registration page")
	public void user_validates_registration_page() {
		Assert.assertTrue(driver.getTitle().contains("Register: Mercury Tours"));
	    System.out.println("validate registration page");
	}

	@When("user enter firstname")
	public void user_enter_firstname() {
		WebElement fn=driver.findElement(By.name("firstName"));
		fn.sendKeys("Aishwarya");
		System.out.println("enter first name");
	}

	@When("user enter lastname")
	public void user_enter_lastname() {
		WebElement ln=driver.findElement(By.name("lastName"));
		ln.sendKeys("Chauhan");
	    System.out.println("enter last name");
	}

	@When("user enter password")
	public void user_enter_password() {
		WebElement ps=driver.findElement(By.name("password"));
		ps.sendKeys("Aishu@123");
	    System.out.println("enter password");
	}
	@When("user enter confirm password")
	public void user_enter_confirm_password() {
		WebElement cps=driver.findElement(By.name("confirmPassword"));
		cps.sendKeys("Aishu@123");
	    System.out.println("confirm password");
	   
	}

	@When("user click on register button")
	public void user_click_on_register_button() {
		WebElement myImgBtn= driver.findElement(By.name("register"));
		  myImgBtn.click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	   
	}

	@Then("user validates registration page successed")
	public void user_validates_registration_page_successed()
	{
	   
	}
}
