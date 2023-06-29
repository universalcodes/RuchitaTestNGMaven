package testng.suite.automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class InputFormSelenium {
	
	static String appurl ="https://demo.seleniumeasy.com/";
	static ChromeOptions chromeOptions = new ChromeOptions();
	static WebDriver browser_driver ;
	static String firstname = "Ruchita";
	static String firstname1 = "Yogesh";

	static String lastname = "Chittora";
	static String lastname1 = "Kamra";

	static String email = "Ruchita@gmail.com";
	static String email1 = "yogeshkamra25@gmail.com";

	static long mobile = 9986778788l;
	static long mobile1 = 9986771888l;

	static String address = "New Colony";
	static String address1 = "New Tara Nagar";
	
	static String city = "sonepat";
	static String city1 = "delhi";

	static int zipcode = 10009;
	static int zipcode1 = 10001;

	static String webname = "musicaudiomania";
	static String webname1 = "anything";

	static String project_details = "I am automationg input for the first time ever";
	static String project_details1 = "I have total 9 years of experirance in QA where 3 is Manual & Rest is in Automation, API and Database Testing";


	
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
		
		WebElement inputform_clk = browser_driver.findElement(By.xpath("(//b[@class='caret'])[1]"));
		boolean inputformdisplay = inputform_clk.isDisplayed();
		System.out.println("The Input Form is displayed as\t"+inputformdisplay);
		inputform_clk.click();
		Thread.sleep(10000);
		System.out.println("The value of element is displayed as\t"+inputform_clk.getText());
		Thread.sleep(5000);
		
		WebElement inputformsubmit_clk = browser_driver.findElement(By.xpath("(//*[text()='Input Form Submit'])[1]"));
		boolean inputformsubmitdisplay = inputformsubmit_clk.isDisplayed();
		System.out.println("The Input Form is displayed as\t"+inputformsubmitdisplay);
		inputformsubmit_clk.click();
		//System.out.println("The value of element is displayed as\t"+inputformsubmit_clk.getText());
		System.out.println(browser_driver.getTitle());
		System.out.println(browser_driver.getCurrentUrl());
		
		Thread.sleep(15000);

		WebElement enterfirstname = browser_driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		enterfirstname.click();
		enterfirstname.sendKeys(firstname);
		enterfirstname.clear();
		enterfirstname.sendKeys(firstname1);
		Thread.sleep(5000);

		
		WebElement enterlastname = browser_driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
		enterlastname.click();
		enterlastname.sendKeys(lastname);
		enterlastname.clear();
		enterlastname.sendKeys(lastname1);
		Thread.sleep(5000);

		
		WebElement enteremailname = browser_driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']"));
		enteremailname.click();
		enteremailname.sendKeys(email);
		enteremailname.clear();
		enteremailname.sendKeys(email1);
		Thread.sleep(5000);

		
		WebElement entermobile = browser_driver.findElement(By.xpath("//*[@placeholder='(845)555-1212']"));
		entermobile.click();
		entermobile.sendKeys(String.valueOf(mobile));  // where sendkeys accepts only String datatype based values if user wants to  send  in other datatype  but we use String.valueOf(datatype)
		entermobile.clear();
		entermobile.sendKeys(String.valueOf(mobile1));  // where sendkeys accepts only String datatype based values if user wants to  send  in other datatype  but we use String.valueOf(datatype)
		Thread.sleep(5000);

		
		WebElement enteraddress = browser_driver.findElement(By.xpath("//*[@placeholder='Address']"));
		enteraddress.click();
		enteraddress.sendKeys(address);
		enteraddress.clear();
		enteraddress.sendKeys(address1);
		Thread.sleep(5000);

		
		WebElement entercity = browser_driver.findElement(By.xpath("//*[@placeholder='city']"));
		entercity.click();
		entercity.sendKeys(city);
		entercity.clear();
		entercity.sendKeys(city1);
		Thread.sleep(5000);

		
		WebElement enterzipcode = browser_driver.findElement(By.xpath("//*[@placeholder='Zip Code']"));
		enterzipcode.click();
		enterzipcode.sendKeys(String.valueOf(zipcode));
		Thread.sleep(5000);

		
		WebElement enterdomainname = browser_driver.findElement(By.xpath("//*[@placeholder='Website or domain name']"));
		enterdomainname.click();
		enterdomainname.sendKeys(webname);
		enterdomainname.clear();
		enterdomainname.sendKeys(webname1);
		Thread.sleep(5000);

		
		WebElement enterproject_details = browser_driver.findElement(By.xpath("//*[@placeholder='Project Description']"));
		enterproject_details.click();
		enterproject_details.sendKeys(project_details);
		enterproject_details.clear();
		enterproject_details.sendKeys(project_details1);
		Thread.sleep(5000);
		
		WebElement radioboxyesclk = browser_driver.findElement(By.xpath("//*[@value='yes']"));
		radioboxyesclk.click();
		Thread.sleep(5000);
		WebElement radioboxnoclk = browser_driver.findElement(By.xpath("//*[@value='no']"));
		radioboxnoclk.click();
		Thread.sleep(5000);
		
		WebElement send_button_click = browser_driver.findElement(By.xpath("//*[text()='Send ']"));
		send_button_click.click();
		Thread.sleep(5000);
		
	
		
		WebElement validateselecterrormessage = browser_driver.findElement(By.xpath("//small[text()='Please select your state']"));
		String errormessage = validateselecterrormessage.getText();

		String getattrimessage = validateselecterrormessage.getAttribute("help-block");
		
		System.out.println(errormessage + "\t" +getattrimessage );
		
		WebElement selectdrop = browser_driver.findElement(By.xpath("//select[@name='state']"));
		String getdropdatalist = selectdrop.getText();
		System.out.println(getdropdatalist);
		
		Select dropdown= new Select(selectdrop);
		dropdown.selectByIndex(1);
		Thread.sleep(5000);
		dropdown.selectByVisibleText("District of Columbia");
		
		
	
		Thread.sleep(5000);
		send_button_click.click();


	
		
		
		

		

		
		
	}

}
