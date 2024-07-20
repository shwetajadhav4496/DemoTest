package stepdefinition;

import org.openqa.selenium.support.ui.Select;

import base.BrowserLaunch;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import objectRepo.RadioButtonObjects;

public class DropDownStep extends BrowserLaunch {
	
	RadioButtonObjects obj1  =new RadioButtonObjects(BrowserLaunch.driver);

	@When("I select from dropdown")
	public void i_select_from_dropdown() {
	    super.initializeBrowser();
	    super.launchApp();
	    Select select = new Select(obj1.dorpdown);
	    select.selectByIndex(1);
	}

	@Then("i see value in textbox")
	public void i_see_value_in_textbox() {
	    String s = obj1.dorpdown.getText();
	    Assert.assertEquals(s, "Option1");
	}

	@Given("I am on home page")
	public void i_am_on_home_page() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}

	@When("I check box")
	public void i_check_box() {
	    obj1.selectCheckBox();
	}

	@Then("it is selected")
	public void it_is_selected() {

		System.out.println("checkbox selected");
	}



	
}
