package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_Locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		WebDriver browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();
		System.out.println("Browser launch successfully");
		browser_driver.get("https://www.amazon.in/?ref_=nav_signin");
		Thread.sleep(15000);
		
		try {
		WebElement multiple_oper= browser_driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		
		String validategettext = multiple_oper.getText();
		boolean validatetext= multiple_oper.isDisplayed();
		String validategettag = multiple_oper.getTagName();
		String validateattribute = multiple_oper.getAttribute("href"); // GetAttributes returns of Value given attribute

		System.out.println(validategettext + "\t" +validatetext  + "\t" + validategettag  + "\t" + validateattribute);
		
		}		
		catch (NoSuchElementException elementexpection) 
		{
			System.out.println(elementexpection+ "oops expection is found");
		}
		
	}
	

}
