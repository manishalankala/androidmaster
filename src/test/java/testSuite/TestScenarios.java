package testSuite;

import java.util.Map;

import javax.naming.Context;

import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.StartsActivity;
import pageObjects.Locators;
import utils.BaseClass;

public class TestScenarios extends BaseClass{

	Locators execute= new Locators();
	@Test(description ="verify click and scroll/action actions")
	public void testCae1() throws Exception{
		execute.clickAndScroll();
		
	} 
	
	@Test(description ="verify click and scroll/action actions")
	public void testCase2() throws Exception{
		execute.sorting();
		
	} 
	@Test(description ="connectd device UDID and Wifi Name")
	public void testCase3() throws Exception{
		execute.udid_wifi();
	//FYI https://github.com/appium/appium/issues/9698  we can't get all the udid's info need to more R&D
	}
}
