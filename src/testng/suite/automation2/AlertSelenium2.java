package testng.suite.automation2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertSelenium2 {
	static String appurl ="https://demoqa.com/alerts";
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
		

			
		


		
		
		
		WebElement clkalt_4 = browser_driver.findElement(By.xpath("(//*[text()='Click me'])[4]"));
		clkalt_4.click();
		Thread.sleep(5000);
		Alert altck = browser_driver.switchTo().alert();
		altck.sendKeys("Yogesh");
		String getaltvalue = altck.getText();
		System.out.println(getaltvalue);
		Thread.sleep(10000);
		altck.accept();
		Thread.sleep(10000);
		
		WebElement alert_result1 = browser_driver.findElement(By.xpath("//*[@id='promptResult']"));
		System.out.println(alert_result1.getText());
		
		
		clkalt_4.click();
		Thread.sleep(5000);
		altck.dismiss();
		Thread.sleep(5000);

		
		
		clkalt_4.click();
		Thread.sleep(5000);
		altck.accept();
		Thread.sleep(5000);

		
		

		

		
	

		
		
		
		
		
	}

}
