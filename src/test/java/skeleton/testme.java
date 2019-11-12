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

public class testme 
{
	WebDriver driver;
	
	@Given("User opens TestMe application")
	public void user_opens_TestMe_application() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\NexGen Testing Stream\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		System.out.println("application opened");
		
}

	@When("user clicks on sign up button")
	public void user_clicks_on_sign_up_button() 
	{
	   driver.findElement(By.linkText("SignUp")).click();
	   System.out.println("clicks on Sign Up");
	}

	@And("user enters user name")
	public void user_enters_user_name() 
	{
		WebElement un=driver.findElement(By.name("userName"));
		un.sendKeys("Aishu19");
		System.out.println("Enter user name");
	}
	
	    
	    
	@And("user enters firstname")
	public void user_enters_firstname()
	{
		WebElement fn=driver.findElement(By.name("firstName"));
		fn.sendKeys("Aishwarya");
		System.out.println("Enter first name");
	}

	@And("user enters lastname")
	public void user_enters_lastname() 
	{
	   WebElement ln=driver.findElement(By.name("lastName"));
	   ln.sendKeys("Chauhan");
	   System.out.println("Enter last name");
	}

	@And("user enters password")
	public void user_enters_password() 
	{
	   WebElement pd=driver.findElement(By.name("password"));
	   pd.sendKeys("Aishu123");
	   System.out.println("Enter password");
	}

	@And("user enters confirm password")
	public void user_enters_confirm_password() 
	{
	    WebElement pwd=driver.findElement(By.name("confirmPassword"));
	    pwd.sendKeys("Aishu123");
	    System.out.println("Confirm password");
	}

	@And("user selects gender")
	public void user_selects_gender() 
	{
	    WebElement g=driver.findElement(By.xpath("//input[@value='Female']"));
	    g.click();
	    System.out.println("Select gender");
	}

	@And("user enters email")
	public void user_enters_email() 
	{
	    WebElement e=driver.findElement(By.name("emailAddress"));
	    e.sendKeys("aishu123@gmail.com");
	    System.out.println("Enter email");
	}

	@And("user enters mobile number")
	public void user_enters_mobile_number() 
	{
	   WebElement m=driver.findElement(By.name("mobileNumber"));
	   m.sendKeys("9782001896");
	   System.out.println("Enter mobile number");
	}

	@And("user selects DOB")
	public void user_selects_DOB() 
	{
	  WebElement d=driver.findElement(By.name("dob"));
	  d.sendKeys("10/23/1996");
	  System.out.println("Select DOB");
	}

	@And("user enters address")
	public void user_enters_address() 
	{
	   WebElement a=driver.findElement(By.name("address"));
	   a.sendKeys("C-502,Orchid Towers Baner Pune");
	   System.out.println("Enter address");
	}

	@And("user selects security question")
	public void user_selects_security_question() 
	{
	    WebElement sq=driver.findElement(By.name("securityQuestion"));
	    sq.sendKeys("What is your Birth Place?");
	    System.out.println("Select security question");
	}

	@And("user enters answer")
	public void user_enters_answer() 
	{
	  WebElement an=driver.findElement(By.name("answer"));
	  an.sendKeys("Delhi");
	  System.out.println("Enter answer");
	}

	@And("user clicks on register button")
	public void user_clicks_on_register_button() 
	{
	   WebElement r=driver.findElement(By.name("Submit"));
	   r.click();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Then("user validates registration page successfully")
	public void user_validates_registration_page_successfully()
	{
	   System.out.println("registration successfull");
	}

}
