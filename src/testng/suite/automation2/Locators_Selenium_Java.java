package testng.suite.automation2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_Selenium_Java {
	public static void main(String[] args) throws InterruptedException	
	{
		
		String deals= "Amazon Pay";
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		WebDriver browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();
		System.out.println("Browser launch successfully");
		browser_driver.navigate().to("https://demo.seleniumeasy.com/table-pagination-demo.html");
		Thread.sleep(20000);

		browser_driver.findElement(By.cssSelector("css=div[class=logo]")).click();

		
		
		



		System.out.println("Waiting for next elements");
		
		Thread.sleep(5000);
		System.out.println("Test Case Passed");		
		
		
		
	}
}
