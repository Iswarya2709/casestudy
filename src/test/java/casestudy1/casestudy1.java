package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy1 {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\ChromeDriver\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();
	@Given("The endUser is on home page of TestMeApp")
	public void the_endUser_is_on_home_page_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		WebElement register=driver.findElement(By.linkText("SignUp"));
		register.click();
	}

	@When("The endUser should enter valid credentials and click register button")
	public void the_endUser_should_enter_valid_credentials_and_click_register_button() {
		  WebElement name=driver.findElement(By.name("userName"));
		  name.sendKeys("ishwarya");
		  WebElement firstName=driver.findElement(By.name("firstName"));
		  firstName.sendKeys("sandhiya");
		  WebElement lastName=driver.findElement(By.name("lastName"));
		  lastName.sendKeys("ishu");
		  WebElement pa=driver.findElement(By.name("password"));
		  pa.sendKeys("Lalitha123");
		  WebElement cpd=driver.findElement(By.name("confirmPassword"));
		  cpd.sendKeys("Lalitha123");
		  WebElement female=driver.findElement(By.xpath("//label[contains(@class,'form-control')]/input[2]"));
		  female.click();
		  WebElement email=driver.findElement(By.name("emailAddress"));
		  email.sendKeys("abc@gmail.com");
		  WebElement mobile=driver.findElement(By.name("mobileNumber"));
		  mobile.sendKeys("9877665432");
		  WebElement dob=driver.findElement(By.name("dob"));
		  dob.sendKeys("01/15/1997");
		  WebElement address=driver.findElement(By.name("address"));
		  address.sendKeys("kiljhga,jhjhg");
		  WebElement secques=driver.findElement(By.name("securityQuestion"));
		  secques.sendKeys("What is your Birth Place");
		  WebElement ans=driver.findElement(By.name("answer"));
		  ans.sendKeys("salem");
		  driver.get("http://10.232.237.143:443/TestMeApp/register.htm?userName=LalithaKumar&firstName=Lalitha&lastName=Kumar&password=Password123&confirmPassword=Password123&gender=Female&emailAddress=lalitha%40gmail.com&mobileNumber=9998887765&dob=01%2F12%2F1995&address=+90+south+car+st%2C+Delhi&securityQuestion=411010&answer=TamilNadu&Submit=Register");
	}

	@Then("The endUser able to login successfully")
	public void the_endUser_able_to_login_successfully() {
		 WebElement user=driver.findElement(By.name("userName"));
		  user.sendKeys("Lalitha");
		  WebElement pass=driver.findElement(By.name("password"));
		  pass.sendKeys("Password123");
		  WebElement login=driver.findElement(By.name("Login"));
		  login.click();
	}

}
