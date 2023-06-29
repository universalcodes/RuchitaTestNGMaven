package testng.suite.automation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PrivateBrowser {
	
	public static void googlechrome()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("InCognito Chrome"); // InCognito Chrome or  InCognito both are same
		chromeOptions.addArguments("Google Chrome"); // InCognito Chrome or  InCognito both are same
		chromeOptions.addArguments("Google Chrome"); // InCognito Chrome or  InCognito both are same

		WebDriver launchchrome = new ChromeDriver(chromeOptions);
		launchchrome.get("http://www.google.com");
		System.out.println("Browser launch successfully");
		
		launchchrome.close();

		launchchrome.quit();
		
	}
	
	public static void firefox()
	{
		FirefoxOptions fireOptions = new FirefoxOptions(); 
		fireOptions.addArguments("-private");
		WebDriver launchfirefoxpvt = new FirefoxDriver(fireOptions);
		launchfirefoxpvt.get("http://www.google.com");
		System.out.println(" private launch successfully");
		launchfirefoxpvt.close();
		
	}
	
	public static void edge()
	{
		EdgeOptions edgeOptions = new EdgeOptions(); 
		edgeOptions.addArguments("InPrivate");
		WebDriver launch_edge = new EdgeDriver(edgeOptions);
		launch_edge.get("http://www.google.com");
		System.out.println("Browser launch successfully");
		launch_edge.close();
		
	}
	
	
	public static void main(String[] args) {
		
		googlechrome();

		
		
		//chrome, opera, firefox, edge
		//pvt - chrome, opera, firefox, edge
		//headless
		// remote
		
		
		
		
	}

}
