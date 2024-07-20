package stepdefinition;

import org.openqa.selenium.WebDriver;

import base.BrowserLaunch;
import io.cucumber.java.en.*;
import objectRepo.RadioButtonObjects;

public class RadioButtonSteps extends BrowserLaunch {
	
	RadioButtonObjects obj  =new RadioButtonObjects(BrowserLaunch.driver); 
	
	@Given("i open browser")
	public void i_open_browser() {
	    super.initializeBrowser();
	}

	@And("i launch url")
	public void i_launch_url() {
	   super.launchApp();
	}

	@When("I select radio button")
	public void i_select_radio_button() {
		//obj = new RadioButtonObjects(driver);
		obj.selectRadioBtn();
	    
	}

	@Then("my radio button is selected")
	public void my_radio_button_is_selected() {
	    System.out.println("radio selected");
	}

	@Given("i input some text")
	public void i_input_some_text() {
	    obj.inputText();
	}

	@And("it will give suggestion")
	public void it_will_give_suggestion() {
	    obj.giveSuggestion();
	}

	@When("i select data from suggestion")
	public void i_select_data_from_suggestion() {
	    obj.suggestionBoxSelect();
	}

	@Then("my selected data is entered in text box")
	public void my_selected_data_is_entered_in_text_box() {
	   System.out.println("pass");
	}



}
