package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.browserEngine;
import utilities.eReports;
import utilities.loginfo;
import utilities.variableData;

public class homePageValidation {
	
	public static WebDriver driver;
	
	static ExtentReports report;
	static ExtentTest test;
@BeforeMethod
	public static void browserSetup()
	
{
		driver=browserEngine.getBrowser("chrome");
		report = eReports.getReport();
		test = report.startTest("Start the home Page Validation test");
		loginfo.debug("Chrome browser is launching");
		loginfo.debug("Application under test openned");
		driver.get(variableData.UATURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Application under test opened");
	}
	@Test
     public void homepageValidation() {
		String hactualt=driver.getTitle();
		Assert.assertEquals(hactualt, variableData.hexpectedt);
		loginfo.debug("expected title is matching with actual title");
		
		test.log(LogStatus.INFO, "expected title is matching with actual title");
	
	}
	
	@AfterMethod
	public void teardown()
	{
		report.flush();
		driver.quit();
	}
	
}



