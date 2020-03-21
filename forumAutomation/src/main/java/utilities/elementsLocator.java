package utilities;

import org.openqa.selenium.By;

public class elementsLocator {
	
//Hard coded value for login page 
	public static By email= By.name("email");
	public static By password =By.name("password");
	public static By loginClick= By.xpath("//*[@id='text-fade']/div[1]/div/div[3]/div/a[2]");
	public static By loginBtn=  By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button");

	public static By userBalance = By.xpath("/html/body/div[3]/div[1]/ul/li[3]/a");
	public static By userBalanceHist =  By.xpath("/html/body/div[3]/div[1]/ul/li[4]/a");
	public static By courseDoc =   By.xpath("/html/body/div[3]/div[1]/ul/li[2]/a");
	public static By userlogoutDrop = By.xpath("//*[@id='navbar-right']/li/a");
	public static By userlogout =By.xpath("//*[@id='navbar-right']/li/ul/li/a");
	
	public static String UATURL="https://www.ebay.ca";
	public static String DEVURL="https://www.ebay.ca";
	public static String QAURL="https://www.ebay.ca";
	public static String PRDURL="https://www.ebay.ca";
	public static String hexpectedt ="Electronics, Cars, Fashion, Collectibles & More | eBay";
	
	public static String uid="nizam@digitalpoint.tech";
	public static String pw="abcdef*123456";

	
	//hardcoard value for registration page 
	
	
}
