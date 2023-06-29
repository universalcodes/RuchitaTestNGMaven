package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayedSelenium {
	
	static String appurl ="https://www.amazon.in/";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;

	
	public static void main(String[] args) throws InterruptedException {
	
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(30000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		browser_driver.switchTo().newWindow(WindowType.TAB);

	
		WebElement signclk = browser_driver.findElement(By.xpath("//*[text()='Hello, sign in']"));


		if ( signclk.isDisplayed()) 
			
		{
			System.out.println("checking the element");
			System.out.println(signclk.isDisplayed());
			
		}
		else
		{
			System.out.println("no elment is displayed");
		}
		
		
	
		
		

		
				//for elements // gettag , gettext and getattribute
		
		//is selected
		//is enabled
		//is displayed
		browser_driver.switchTo().newWindow(WindowType.TAB);


		

	}
	}


	
