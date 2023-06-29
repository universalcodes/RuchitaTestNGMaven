package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumNavigation {
	public static void googlechrome() throws InterruptedException {
		String address_clk = "Home & Kitchen";
		
		System.out.println("(," +address_clk +")");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("Incognito"); // use only InCognito
		WebDriver browser_driver = new ChromeDriver(chromeOptions);
		browser_driver.manage().deleteAllCookies();

		Dimension getsize = browser_driver.manage().window().getSize();
		System.out.println(getsize);
		Point getposi = browser_driver.manage().window().getPosition();

		System.out.println(getposi);

		browser_driver.manage().window().maximize();
		Thread.sleep(5000);

		/*
		 * browser_driver.manage().window().maximize(); Thread.sleep(5000);
		 * 
		 * browser_driver.manage().window().minimize(); Thread.sleep(5000);
		 * 
		 * browser_driver.manage().window().maximize(); Thread.sleep(5000);
		 */

		System.out.println("Browser launch successfully");
		browser_driver.get("http://www.amazon.in");
		WebElement click_btn = browser_driver.findElement(By.xpath("//*[contains(text(), '')]"));
				//*[contains(text(), 'Select your address')]
		click_btn.click();
		
		Thread.sleep(5000);


		browser_driver.navigate().back();
		String back_urlname = browser_driver.getCurrentUrl();
		String back_titlename = browser_driver.getTitle();
		
		
		
		System.out.println(back_urlname + "\n" + back_titlename);

		Thread.sleep(10000);

		browser_driver.navigate().forward();
		String forward_urlname = browser_driver.getCurrentUrl();
		String forward_titlename = browser_driver.getTitle();

		Thread.sleep(5000);
		System.out.println(forward_urlname + "\n" + forward_titlename);

		browser_driver.navigate().refresh();
		Thread.sleep(5000);

		System.out.println(forward_urlname + "\n" + forward_titlename);
		Thread.sleep(5000);

		browser_driver.navigate().to("https://musicaudiomania.online/");
		

		browser_driver.close();

		// launchchrome.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		googlechrome();

	}

}
