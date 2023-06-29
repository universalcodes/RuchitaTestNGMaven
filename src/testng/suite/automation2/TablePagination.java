package testng.suite.automation2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TablePagination {
	static String appurl ="https://demo.guru99.com/test/web-table-element.php#";
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
		
		List<WebElement> find_dynamic_data = browser_driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		

		for (WebElement copiesallthelist : find_dynamic_data) 
		{
			
			System.out.println(find_dynamic_data.size());
		String getattribute = copiesallthelist.getAttribute("id");
			System.out.println(getattribute);
			System.out.println(copiesallthelist.getText());
		//	System.out.println(copiesallthelist.getTagName());
			//browser_driver.navigate().refresh();
			//System.out.println(copiesallthelist.getText());


		}
		
		browser_driver.navigate().refresh();
		Thread.sleep(10000);

		List<WebElement> find_dynamic_data1 = browser_driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));

		for (WebElement copiesallthelist1 : find_dynamic_data1) 
		{
			
			System.out.println(find_dynamic_data.size());
		String getattribute = copiesallthelist1.getAttribute("class");
			System.out.println(getattribute);
			System.out.println(copiesallthelist1.getText());
		//	System.out.println(copiesallthelist.getTagName());
			//browser_driver.navigate().refresh();
			//System.out.println(copiesallthelist.getText());


		}
		
		
		//*/tr[10]/td[7]
	}
}
