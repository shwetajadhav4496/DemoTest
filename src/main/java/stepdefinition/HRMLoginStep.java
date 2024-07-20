package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import objectRepo.HRMLogin;

public class HRMLoginStep {
	
	WebDriver driver = null;
	HRMLogin obj;
	
	
	@Given("my browser is open")
	public void my_browser_is_open() {
		String projPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	@And("I open orange hrm login page")
	public void i_open_orange_hrm_login_page() {
		
		
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	@When("I enter (.*) and (.*)$")
	public void i_enter_username_and_password(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj = new HRMLogin(driver);
		obj.enterUsername(username);
		obj.enterPassword(password);
		
		obj.clickLogin();
		Thread.sleep(20000);
		
	}

	@SuppressWarnings("deprecation")
	@Then("I am logged in to my account")
	public void i_am_logged_in_to_my_account() throws InterruptedException {
	    System.out.println("success");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    obj.validateHomePage();
	    
	    obj.closeDriver();
	}

}
