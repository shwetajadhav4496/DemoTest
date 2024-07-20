package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static WebDriver driver;
	
	public void initializeBrowser() {
		String projPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	}

	public void launchApp() {
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
}
