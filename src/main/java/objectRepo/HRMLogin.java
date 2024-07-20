package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HRMLogin {
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement txt_password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	WebElement btn_login;
	
	@FindBy(how = How.XPATH, using = "//h6[text()='Dashboard']")
	public WebElement txt_dashboard;
	
	
	////////const////
	
	WebDriver driver;
	
	public HRMLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	public void validateHomePage() {
		String actual = txt_dashboard.getText();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
	}
	
	public void closeDriver() {
		driver.close();
	}
}
