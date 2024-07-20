package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import objectRepo.HRMLogin;
import objectRepo.HomePage;

public class ContactDetails {
	
	WebDriver driver = null;
	HomePage  hp;
	HRMLogin b;

	@Given("I want to update my info")
	public void i_want_to_update_my_info() throws InterruptedException {
		String projPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		b = new HRMLogin(driver);
		b.enterUsername("admin");
		b.enterPassword("admin123");
		b.clickLogin();
	    hp = new HomePage(driver);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    hp.clickMyInfo();
	}

	@Given("i change my details")
	public void i_change_my_details() {
	    //hp.selectRadioBtn();
		System.out.println("pass");
	}

	@When("I update my country")
	public void i_update_my_country() {
	    hp.clickContactDetails();
	    hp.selectCountry();
	}

	@When("click on save")
	public void click_on_save() {
	   hp.saveData();
	}

	@Then("my details are saved")
	public void my_details_are_saved() {
	 //   hp.validateSuccessfulDataSaved();
		System.out.println("end");
	}


	
}
