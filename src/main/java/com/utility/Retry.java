package com.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{
	
	int count =1;
    int max =3;

	@Override
	public boolean retry(ITestResult result) {
	if (count<=max) {
		count++;
		return true;
	}	
		
		return false;
		
	}
	

}
