package TestNGkeyword;


import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import propBase.Base2;

public class Listener implements ITestListener 

{
	Base2 b=new Base2();

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC execution is start  "+ result.getName(),true);
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC execution is Successfull  "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC execution is Skipped  "+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		String TCname=result.getName();
		
		try {
			b.snapsot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log(" Take Screenshot ",true);
	}
	
	
	}

