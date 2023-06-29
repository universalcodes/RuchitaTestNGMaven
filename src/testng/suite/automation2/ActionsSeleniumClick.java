package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsSeleniumClick {
	static String appurl ="https://www.amazon.in/ref=nav_logo";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	static String register_clk = "//*[text()='Starting ₹79 | Amazon Brands & more']";
	
	static String searchenter = "//*[@placeholder='Search Amazon.in']";

	
	public static void main(String[] args) throws InterruptedException
	{
		chromeOptions.addArguments("Google Chrome"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(5000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		Thread.sleep(10000);
		browser_driver.switchTo().newWindow(WindowType.TAB);
		browser_driver.get(appurl);
		browser_driver.switchTo().newWindow(WindowType.TAB);
		browser_driver.get(appurl);
		WebElement clk = browser_driver.findElement(By.tagName("body"));
		clk.sendKeys(Keys.ALT, Keys.TAB);

		//Actions clickelement = new Actions(browser_driver);
		//WebElement clk = browser_driver.findElement(By.xpath(searchenter));
		//clickelement.moveToElement(clk).doubleClick().build().perform();
		//clickelement.moveToElement(clk).contextClick().build().perform();
		//clickelement.moveToElement(clk).click().build().perform();
		//clickelement.moveToElement(clk).sendKeys("Testing").build().perform();


	}

}
