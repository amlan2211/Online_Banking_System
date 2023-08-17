package com.banking.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ListnerImpClass implements ITestListener
{
	ExtentReports report;
	ExtentTest test;

	public void onFinish(ITestContext context) 
	{
	report.flush();
	}

	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter htmlreport= new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("Bank report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Online bank report");
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Base-Broswer", "edge");
		report.setSystemInfo("Base-url", "http://rmgtestingserver/domain/Online_Banking_System/index.php");
		report.setSystemInfo("reporter name", "amlan kiran");
	}

	public void onTestFailure(ITestResult result) 
	{   
		String Fscript=result.getMethod().getMethodName();
		String FailedScript=Fscript+new JavaUtility().getSystemDateInformat();
		EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClass.sdriver);
		File src=edriver.getScreenshotAs(OutputType.FILE);
		File dst=new File("./ScreenShot/"+FailedScript+".png");
		try {
			FileUtils.copyFile(src, dst);
	} catch (IOException e) {
			
		e.printStackTrace();
		}
        test.log(Status.FAIL, Fscript+"----> failed");
		test.log(Status.FAIL,result.getThrowable());
		test.addScreenCaptureFromPath(dst.getAbsolutePath());
	Reporter.log(Fscript+"---> Testscript failed");
//      try {
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
//	
	}

	public void onTestSkipped(ITestResult result) 
	{
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"--->skipped");
	
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(MethodName+"---->testscript skipped");
	}

	public void onTestStart(ITestResult result) 
	{
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"-->Testscript execution  started");
		
		
	}

	public void onTestSuccess(ITestResult result) 
	{

		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"-->passed");
		Reporter.log(MethodName+"-->TestScriptp");
		
	}
	

}
