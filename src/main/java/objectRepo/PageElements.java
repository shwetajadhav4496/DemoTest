package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BrowserLaunch;

public class PageElements extends BrowserLaunch{
	
	By switch_btn = By.id("openwindow");

	@FindBy(id="name")
	public WebElement txt_name;
	
	@FindBy(id="confirmbtn")
	public WebElement btn_confirm;
	
	@FindBy(id="displayed-text")
	public WebElement txt_display;
	
	@FindBy(id="show-textbox")
	public WebElement btn_show;
	
	@FindBy(id="hide-textbox")
	public WebElement btn_hide;
	
	public PageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSwitchWindow() {
		driver.findElement(switch_btn).click();
	}
	
	public void inputText() {
		txt_name.sendKeys("James");
	}
	
}
