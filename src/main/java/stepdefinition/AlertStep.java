package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;

import base.BrowserLaunch;
import io.cucumber.java.en.*;
import objectRepo.PageElements;

public class AlertStep extends BrowserLaunch{
	
	PageElements p = new PageElements(BrowserLaunch.driver);
	
	public void testBranch() {
		System.out.println("test branch");
	}
	
	
	@Given("i enter my name")
	public void i_enter_my_name() {
		super.initializeBrowser();
		super.launchApp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //p.txt_name.sendKeys("Shweta");
		driver.findElement(By.id("name")).sendKeys("Shweta");
		//p.inputText();
	}

	@When("i click on confirm")
	public void i_click_on_confirm() {
	    p.btn_confirm.click();
		//driver.findElement(By.id("confirmbtn")).click();
	}

	@Then("alert will show")
	public void alert_will_show() {
	    driver.switchTo().alert().accept();
	}

	@Given("i click on show")
	public void i_click_on_show() {
	    p.btn_show.click();
	}

	@Given("elemnt is visible")
	public void elemnt_is_visible() {
	     p.txt_display.isEnabled();
	}

	@When("i enter data")
	public void i_enter_data() {
	    p.txt_display.sendKeys("test");
	}

	@When("i click on hide")
	public void i_click_on_hide() {
	    p.btn_hide.click();
	}

	@Then("element is disabled")
	public void element_is_disabled() {
	    p.txt_display.isEnabled();
	}


	
}
