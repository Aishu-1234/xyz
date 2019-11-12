package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class testcase_login 
{ 
	WebDriver driver;
	@Given("user launches iedriver And navigate to application url")
	public void user_launches_iedriver_And_navigate_to_application_url() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	    System.out.println("open application");
	   
	}

	@When("user enter user name as {string} in user field")
	public void user_enter_user_name_as_in_user_field(String un) {
		 driver.findElement(By.name("userName")).sendKeys(un);
	   
	}

	@When("user enter password as {string} in password field")
	public void user_enter_password_as_in_password_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	   
	}

	@When("Click Signin")
	public void click_Signin() {
		driver.findElement(By.name("login")).click();
	}

	@Then("validate login success")
	public void validate_login_success() {
		Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
		driver.close();
	   
	}
	@Given("user login with valid data")
	public void user_login_with_valid_data() {
		 System.out.println("login");
	}

	@Given("user searches for a product")
	public void user_searches_for_a_product() {
		 System.out.println("search");
	}

	@Given("user add product to cart")
	public void user_add_product_to_cart() {
		 System.out.println("add to cart");
	}

	@Given("user does payment")
	public void user_does_payment() {
		 System.out.println("payment");
	}

	@Given("user logs out of application")
	public void user_logs_out_of_application() {
	    System.out.println("logout");
	}
	

}
