package stepdefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "C:/Users/aaditya.a/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@When("^title of login Page is free crm$")
	public void title_of_login_Page_is_free_crm()  {
		Assert.assertEquals(driver.getTitle(), "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentials) {
		for(Map<String, String> data:credentials.asMaps(String.class, String.class)){
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.cssSelector(".btn.btn-small"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user is on the home page$")
	public void user_is_on_the_home_page(){
		driver.switchTo().frame("mainpanel");
	   Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='topnavlink']/font/i)[3]")).isDisplayed());
	   driver.quit();
	}
	
	
}
