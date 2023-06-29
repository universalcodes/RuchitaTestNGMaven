package testng.suite.automation2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SubWindow {
	static String appurl ="https://www.lambdatest.com/selenium-playground/window-popup-modal-demo";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;

	public static void main(String[] args) throws InterruptedException {
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(5000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		Thread.sleep(30000);
		
		System.out.println("Now sub window executes");
	
	WebElement subwindowclk =  browser_driver.findElement(By.xpath("//*[@title='Follow @Lambdatesting on Twitter']"));
	subwindowclk.click();
	
	System.out.println(browser_driver.getTitle());
	
	String get_window = browser_driver.getWindowHandle();
	System.out.println(get_window);
	
	Set<String> get_window1 = browser_driver.getWindowHandles();
	System.out.println(get_window1);
	
	Iterator<String> get_window2 = get_window1.iterator();
	System.out.println(get_window2);
	
	while(get_window2.hasNext())
	{
		boolean subwindow_status = get_window2.hasNext();
		System.out.println(subwindow_status);
		
		String subwindow = get_window2.next();
		
		if(!get_window.equalsIgnoreCase(subwindow))
		{
			browser_driver.switchTo().window(subwindow);
			System.out.println(browser_driver.getCurrentUrl());
			browser_driver.close();
		}
		
	}
	browser_driver.switchTo().window(get_window);
	System.out.println(	browser_driver.getTitle());
	browser_driver.close();
	
	
	
	
	
	
	
	

			
	
	}
	
	
}
