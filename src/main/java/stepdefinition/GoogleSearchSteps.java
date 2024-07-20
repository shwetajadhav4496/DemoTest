package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("given");
	    String projPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
		System.out.println("and");
		driver.get("https://google.com"); 
		
	}

	@When("user enters text")
	public void user_enters_text() {
		System.out.println("wen");
		driver.findElement(By.name("q")).sendKeys("selenium java");
		
		
	}

	@And("user hit search button")
	public void user_hit_search_button() {
		System.out.println("and1");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("then");
		driver.getPageSource().contains("Selenium");
		driver.close();
	}

}
