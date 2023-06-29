package testng.suite.automation2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.elements.poom.ScrollValidation;

public class Scroll1 {
	
	
	@Test(description = "Executing scroll", priority = 2, suiteName = "Prority", threadPoolSize = 1, groups = "group1")
	public void executescroll2() throws InterruptedException{
		System.out.println("Executing scroll2" +Thread.activeCount())	;
	}
	
	@Test(description = "Executing scroll",priority = 1, threadPoolSize = 1, groups = "group2")
	public void executescroll3() throws InterruptedException{
		System.out.println("Executing scroll3" + Thread.activeCount());
	}
	@Test(description = "Executing scroll",priority = 1, threadPoolSize = 1, groups = "group2")
	public void executescroll4() throws InterruptedException{
		System.out.println("Executing scroll4" + Thread.activeCount());
	}
	@Test(description = "Executing scroll",priority = 1, threadPoolSize = 1, groups = "group1")
	public void executescroll5() throws InterruptedException{
		System.out.println("Executing scroll5" + Thread.activeCount());
	}
	
	
	@BeforeClass
	public void checkclass(){
		System.out.println("Validate Naming Convention is correct or not");
		}
	
	@BeforeMethod
public void checkmethod(){
		System.out.println("Validate Method is Present or not");	
	}
	@BeforeSuite
	public void checksuite(){
		System.out.println("Validate All Test Are Added properly");
		
	}
	@BeforeTest
	public void checkbeforeTest()
	{
		System.out.println("Validate In Test Case all the Steps are executed properly");
		
	}
	
	@AfterClass
	public void checkafterclass(){
		System.out.println("Validated Naming Convention is defined");
		}
	
	@AfterMethod
		public void checkaftermethod(){
		System.out.println("Validate ensure all methods are executed");	
	}
	
	@AfterSuite
	public void checkafftersuite(){
		System.out.println("Validate all Test Suite are executed properly");
	}
	@AfterTest
	public void validateTestStatus()
	{
		System.out.println("Validate Result Passed or Failed");
		
	}
}
