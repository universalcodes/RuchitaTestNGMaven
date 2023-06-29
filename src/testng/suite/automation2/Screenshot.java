package testng.suite.automation2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;




public class Screenshot {
	static String appurl ="https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	
	public static java.util.Date sctaken()
	{
		java.util.Date timevisible = new java.util.Date();
		System.out.println(timevisible);
		
		LocalDateTime testing = LocalDateTime.now();
		System.out.println(testing);
		

		return timevisible;
		
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		sctaken();
		

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
		
	
		WebElement ss_element= browser_driver.findElement(By.xpath("//img[@alt='Big Savings, More Happiness']"));
		String sspath = "D:\\Testing Ducat\\DucatProjects\\Ducat\\Ruchita_Java\\SeleAutomation\\screenprints\\test.jpg";
		File createss = (((TakesScreenshot)ss_element)).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(createss, new File(sspath));
				
	}			
			
	}

