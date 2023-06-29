package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsSeleniumDragnDrop {
	static String appurl ="https://www.amazon.in/ref=nav_logo";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	
	
	public static void main(String[] args) throws InterruptedException
	{
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(5000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		Thread.sleep(10000);
		Actions dragndrop = new Actions(browser_driver);
		WebElement dragfrom = browser_driver.findElement(By.xpath("//*[text()='Up to 60% off | Styles for women']"));
		WebElement dragto= browser_driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']"));
		Thread.sleep(10000);
		dragndrop.dragAndDrop(dragfrom, dragto).build().perform();
		Thread.sleep(10000);
		System.out.println("Drag n Drop Done");

		

		
		


	}

}
