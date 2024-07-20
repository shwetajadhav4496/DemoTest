package objectRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BrowserLaunch;

public class RadioButtonObjects extends BrowserLaunch{

	@FindBy(how = How.XPATH, using = "//input[@value='radio1']")
	public WebElement radioBtn;
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement suggestioBox;
	
	@FindBy(id = "dropdown-class-example")
	public WebElement dorpdown;
	
	@FindBy(id="checkBoxOption1")
	public WebElement check1;
	
	@FindBy(id="checkBoxOption2")
	public WebElement check2;
	
//	@FindBy(xpath = "//li[@class='ui-menu-item']/child::div[1]")
//	public String suggestionList;
	
	public RadioButtonObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectCheckBox() {
		check1.click();
		check2.click();
		
	}
	
	public void selectRadioBtn() {
		//driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement((By) radioBtn).click();
	}
	
	public void inputText() {
		suggestioBox.sendKeys("ind");
	}
	
	
	public List<WebElement> giveSuggestion() {
		List<WebElement> options = driver.findElements((By.xpath("//li[@class='ui-menu-item']/child::div[1]")));
		return options;
	}
	
	public void suggestionBoxSelect() {
		
		for (WebElement p : this.giveSuggestion()) {
			if(p.getText()=="India") {
				p.click();
			}
		}
		
	}
	
}
