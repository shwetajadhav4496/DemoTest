package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import base.BrowserLaunch;
import io.cucumber.java.en.*;
import objectRepo.PageElements;
import objectRepo.RadioButtonObjects;

public class SwitchWindowSteps extends BrowserLaunch {
	
	PageElements s1  = new PageElements(BrowserLaunch.driver);
	
	@When("i click button")
	public void i_click_button() {
	    super.launchApp();
	    s1.clickSwitchWindow();
	}

	@Then("new window will open")
	public void new_window_will_open() {
	    Set<String> windows = driver.getWindowHandles();
	    Iterator<String> i1 = windows.iterator();
	    String pw = i1.next();
	    String w = i1.next();
	    driver.switchTo().window(w);
	    
	    System.out.println(driver.getTitle());
	}

	@And("i validate data")
	public void i_validate_data() {
		
		System.out.println("------");
		driver.getTitle();
		driver.close();
	    
	}

}
