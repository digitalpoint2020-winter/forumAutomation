package utilities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class eReports {

	static ExtentReports extent;
	 ExtentTest logger;
	 
	 public static ExtentReports getReport(){
	 
	 extent = new ExtentReports (System.getProperty("user.dir") +"\\test-output\\eReport.html", true);
	 //extent.addSystemInfo("Environment","Environment Name")
	 extent
	                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
	                .addSystemInfo("Environment", "Automation Testing")
	                .addSystemInfo("User Name", "Rajkumar SM");
	                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	 return extent;
	 }
}
	 
	 