package selenium.elements.poom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollValidation {
	static String appurl ="https://www.amazon.in/ref=nav_logo";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	

	public  static void scroll_validation() throws InterruptedException
	{

		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(5000);
		System.out.println(browser_driver.getTitle());
				System.out.println(browser_driver.getTitle());

		System.out.println(browser_driver.getCurrentUrl());
		Thread.sleep(10000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)browser_driver;
		scroll.executeScript("window.scrollBy(0, 2500)");  // h, v 
		Thread.sleep(5000);
		scroll.executeScript("window.scrollBy(0, -2500)");  // h, v 
		Thread.sleep(10000);
		//scroll.executeScript("window.scrollBy(200, 0)");  // h, v 
		//scroll.executeScript("window.scrollBy(-200, 0)");  // h, v 

		WebElement scrollbyElement= browser_driver.findElement(By.xpath("//*[text()='Frequently repurchased in Beauty & Personal Care']"));
				
		scroll.executeScript("arguments[0].scrollIntoView(false)", scrollbyElement);
		

}
}