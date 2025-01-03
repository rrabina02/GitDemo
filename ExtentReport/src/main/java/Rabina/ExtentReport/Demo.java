package Rabina.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig.ExtentSparkReporterConfigBuilder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports ext;
		
		public void extentClass()
		{
			String path = System.getProperty("user.dir")+"\\reports\\index.html";
			ExtentSparkReporter reporter =new ExtentSparkReporter(path);
			reporter.config().setReportName("Initial Demo");
			reporter.config().setDocumentTitle("Rahulshetty");
			
			ext = new ExtentReports();
			ext.attachReporter(reporter);
			ext.setSystemInfo("tester", "automation");
			
		}

		
		public void demo1()		{
			ExtentTest test =ext.createTest("Reprts");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com");
			System.out.println(driver.getTitle());
			ext.flush();
		}
		
	}

}
