package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class isEnabledSeleniumMethod {
	static String appurl ="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	

public static void main(String[] args) throws InterruptedException {
	
	chromeOptions.addArguments("Incognito"); // This is used for google chrome
	browser_driver = new ChromeDriver(chromeOptions);
	browser_driver.manage().deleteAllCookies();
	browser_driver.manage().window().maximize();	
	System.out.println("Browser launch successfully");
	browser_driver.get(appurl);
	Thread.sleep(10000);
	System.out.println(browser_driver.getTitle());
	System.out.println(browser_driver.getCurrentUrl());
	
	
	WebElement checkbuttonclk = browser_driver.findElement(By.xpath("//*[@id='runbtn']"));
	System.out.println(checkbuttonclk.isEnabled());
	
	Thread.sleep(10000);
	
	WebElement checkbuttonclk1 = browser_driver.findElement(By.xpath("//button[text()='Click Me!']"));
	System.out.println(checkbuttonclk1.isEnabled());
	
	Thread.sleep(10000);

	browser_driver.close();
}

}
