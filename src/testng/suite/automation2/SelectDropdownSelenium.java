package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

public class SelectDropdownSelenium {
	
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

		
		WebElement dropdownlist = browser_driver.findElement(By.xpath("//*[@id='select-demo']"));
		String getdropdownlist = dropdownlist.getText();
		System.out.println(getdropdownlist);
		
		Select selectdropdownlist = new Select(dropdownlist);
		boolean selectedstatus = 	dropdownlist.isSelected();
		System.out.println(selectedstatus);
		
		selectdropdownlist.selectByIndex(1);
		Thread.sleep(8000);
		
		Thread.sleep(5000);
		selectdropdownlist.selectByValue("Monday");
		Thread.sleep(8000);
		System.out.println(selectedstatus);

		selectdropdownlist.selectByVisibleText("Saturday");
		Thread.sleep(8000);
		System.out.println(selectedstatus);

		browser_driver.close();
		
		
		
	}
}