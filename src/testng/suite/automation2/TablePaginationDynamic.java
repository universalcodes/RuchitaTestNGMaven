package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TablePaginationDynamic {
	static String appurl ="https://demo.seleniumeasy.com/table-pagination-demo.html";
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
		Thread.sleep(10000);
		WebElement tablepagination = browser_driver.findElement(By.xpath("//*/tr[5]/td[7]"));
		boolean tablecheckdisplay = tablepagination.isDisplayed();
		System.out.println(tablecheckdisplay);

			System.out.println(tablepagination.getText());
			String getattribute = tablepagination.getAttribute("tbody");
			System.out.println(getattribute);
			System.out.println(tablepagination.getTagName());
			

		
		
		//*/tr[10]/td[7]
	}
}
