package objectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Info']")
	public WebElement txt_myInfo;
	
	@FindBy(how = How.XPATH, using = "//input[@type='radio']")
	public WebElement radio;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Contact Details']")
	public WebElement contactDetails;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-select-text-input']")
	public WebElement countryDropDown;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement save;
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickMyInfo() {
		txt_myInfo.click();
	}
	
	public void selectRadioBtn() {
		Select select = new Select(radio);
		select.selectByValue("Female");
	}
	
	public void clickContactDetails() {
		contactDetails.click();
	}
	
	public void selectCountry() {
		countryDropDown.sendKeys("Canada");
//		Select select = new Select(countryDropDown);
//		select.selectByIndex(3);
	}
	
	public void saveData() {
		save.click();
	}
	
	public void validateSuccessfulDataSaved() {
	//	Alert alert = driver.switchTo().alert();
	//	alert.accept();
	}
}
