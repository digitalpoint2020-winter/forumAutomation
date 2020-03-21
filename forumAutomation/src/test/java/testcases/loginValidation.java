package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.elementsLocator;
import utilities.loginfo;

public class loginValidation extends elementsLocator {
	
		public static WebDriver driver;	
		@BeforeMethod
			public void browserSetup()
		{
				driver=browserEngine.getBrowser("chrome");

				driver.get(UATURL);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			}
			
			@Test
			
			public void userlogin()
			{
				
			driver.findElement(loginClick).click();
			
			driver.findElement(email).sendKeys(uid);
			driver.findElement(password).sendKeys(pw);
			driver.findElement(loginBtn).click();
			//Course Document Information | Digital Point Forum
			
			String loginexpectedR ="Course Document Information | Digital Point Forum";
			String loginactualR="Course Document Information | Digital Point Forum";
			Assert.assertEquals(loginactualR, loginexpectedR);

			loginfo.debug("Login is successful");
			driver.findElement(userlogoutDrop).click();
			
			driver.findElement(userlogout).click();
			loginfo.debug("logout is successful");
			}
			@AfterMethod
			public void teardown()
			{
				driver.quit();
			}
			
		}



