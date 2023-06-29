package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelectedMethodSelenium {
	
	static String appurl ="https://www.amazon.in/";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;

	
	public static void main(String[] args) throws InterruptedException {
	
		chromeOptions.addArguments("Incognito"); // This is used for google chrome
		browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();
		browser_driver.manage().window().maximize();	
		System.out.println("Browser launch successfully");
		browser_driver.get(appurl);
		Thread.sleep(30000);
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		
		WebElement signclk = browser_driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
		signclk.click();
		
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		
		
		WebElement amazon_elemet = browser_driver.findElement(By.xpath("//*[@name='email']"));
		amazon_elemet.click();	
		amazon_elemet.sendKeys("yogeshkamra25@gmail.com");	
		
		
		WebElement conti_click = browser_driver.findElement(By.xpath("//*[@id='continue']"));
		conti_click.click();
		
		
		WebElement check_clk = browser_driver.findElement(By.xpath("//*[@name='rememberMe']"));
		check_clk.click();
		Thread.sleep(5000);
		boolean check_status = check_clk.isSelected();
		System.out.println(check_status);
		Thread.sleep(5000);
		check_clk.click();
		boolean check_status1 = check_clk.isSelected();
		Thread.sleep(5000);
		System.out.println(check_status1);

		
				//for elements // gettag , gettext and getattribute
		
		//is selected
		//is enabled
		//is displayed
		
		

	}
	}


	
