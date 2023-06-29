package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertSelenium {
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
		
		
		WebElement clkalt_1 = browser_driver.findElement(By.xpath("(//*[text()='Click me'])[1]"));
		clkalt_1.click();
		Thread.sleep(5000);
		browser_driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		System.out.println(clkalt_1.getText());
		
		WebElement clkalt_3 = browser_driver.findElement(By.xpath("(//*[text()='Click me'])[3]"));
		clkalt_3.click();
		Thread.sleep(5000);
		browser_driver.switchTo().alert().accept();
		Thread.sleep(5000);
		WebElement alert_result = browser_driver.findElement(By.xpath("//*[@id='confirmResult']"));
		System.out.println(alert_result.getText());
		clkalt_3.click();
		browser_driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		System.out.println(alert_result.getText());
		
		
		WebElement clkalt_4 = browser_driver.findElement(By.xpath("(//*[text()='Click me'])[4]"));
		clkalt_4.click();
		Thread.sleep(5000);
		browser_driver.switchTo().alert().sendKeys("Yogesh");
		Thread.sleep(5000);
		browser_driver.switchTo().alert().accept();
		WebElement alert_result1 = browser_driver.findElement(By.xpath("//*[@id='promptResult']"));
		System.out.println(alert_result1.getText());
		
		// TC - 2
		
		clkalt_4.click();
		Thread.sleep(5000);
		browser_driver.switchTo().alert().accept();
		Thread.sleep(5000);

		
		//TC - 3
		
		clkalt_4.click();
		Thread.sleep(5000);
		browser_driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

		

		
	

		
		
		
		
		
	}

}
