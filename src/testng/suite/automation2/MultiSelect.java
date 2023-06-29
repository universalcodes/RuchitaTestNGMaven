package testng.suite.automation2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static String appurl ="https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;

	
	public static void main(String[] args) throws InterruptedException
	{
	chromeOptions.addArguments("Incognito"); // This is used for google chrome

		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		WebDriver browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(30000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());


		
		
		List<WebElement> drpdwn_multi_values = browser_driver.findElements(By.xpath("//*[@id='multi-select']"));
	
		for (WebElement selectedvalue : drpdwn_multi_values) 
		{
			String getdropdown = selectedvalue.getText();
			System.out.println(getdropdown);
			
			
			Select selectdrpdown = new Select(selectedvalue);
			selectdrpdown.selectByIndex(1);
			Thread.sleep(5000);
			selectdrpdown.deselectByIndex(1);
			Thread.sleep(5000);

			selectdrpdown.selectByValue("New Jersey");
			Thread.sleep(5000);
			selectdrpdown.deselectByValue("New Jersey");
			Thread.sleep(5000);
			
			selectdrpdown.selectByVisibleText("California");
			Thread.sleep(5000);
			selectdrpdown.deselectByValue("California");
			Thread.sleep(5000);
			
			selectdrpdown.selectByIndex(1);
			Thread.sleep(5000);

			selectdrpdown.selectByValue("New Jersey");
			Thread.sleep(5000);
			selectdrpdown.selectByVisibleText("California");

			Thread.sleep(5000);

			selectdrpdown.selectByValue("New Jersey");
			Thread.sleep(5000);
			
			
			selectdrpdown.deselectAll();



			
		}
		
		
		browser_driver.close();
		
	}
}


