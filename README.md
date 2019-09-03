

# Appium

http://appium.io/


![image](https://user-images.githubusercontent.com/33985509/59467324-ab4bf600-8e2f-11e9-93ec-8a2db650138c.png)







# Requirement


````

Using Appium with Java and any App(s) that you like, please, automate 3 test cases either on iOS or Android based on the following scenarios:


1. There is a drop down menu or a picker wheel, 

which position is flexible - can be anywhere on the screen. 

You have to select an element of that list, which is not visible at first, 

so that you have to scroll/swipe to it.


2. You have a list of contact names, 

which has more than 15 entries and can be sorted by family name or by first name. Verify that both sorting options work. 



3. Assume there are some number of connected android devices.(One is not connected to wifi, rest are connected to the wifi)

- Get all of their connected wifi network names 

- Get udid of the device which is not connected to the wifi

- Disable wifi of any device that is connected to the wifi



The requirements for a successfully finished task are:

Code is written in Java with TestNG and Gradle!

You use PageObject/PageFactory Structure

There is documentation for your automation(software, hardware and configuration prerequisites for running the tests; how to run the tests; etc.) in the form of a README.MD file

add step by step description of your test cases in separate text files.


Your code can be executed according to the the documentation in the README.MD

Tests are all green, unless there is a bug in the app.



`````




 Install JDK

https://www.oracle.com/technetwork/java/javase/downloads/index.html

![image](https://user-images.githubusercontent.com/33985509/59460626-da5a6b80-8e1f-11e9-92c9-fe3ba0cf6460.png)


Else if you any license trouble i follow openjdk,Select version and follow

https://openjdk.java.net/install/


Double click on downloaded .exe file

It will launch JDK software installation dialog.

Now we need to set JAVA_HOME variable in windows

in Windows search - edit the environmental variable


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59461012-b6e3f080-8e20-11e9-81af-543ceb704c36.png)



For example :

Set Variable name = JAVA_HOME.
Set Variable Value = Path where JDK is located. For me It is "C:\Program Files\Java\jdk1.8.0_45"


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59461114-eb57ac80-8e20-11e9-8126-dd93c9ec301c.png)


save the path



Verify java is installed properly or not
To verify java software is installed properly or not,
Open command prompt.
Run command "java -version"


![image](https://user-images.githubusercontent.com/33985509/59461311-5e612300-8e21-11e9-9d0a-b10668e29ec8.png)




Appium Setup in Eclipse
Create new project

Right click on the project click on Build Varient -> Add External Archieves -> Add all jars of selenium client folder and Java Client folder

Click on Add Libraries -> Junit and add Junit Library.










Only if we are using Android Sdk


Download Android SDK

For downloading android SDK

Go to this software web application page -> http://developer.android.com/sdk/index.html

Scroll down to bottom of page.

There will be SDK Tools Only" under "Other Download Options" section.

Click on android-sdk_r(Version number)-windows.zip link e.g. android-sdk_r24.3.3-windows.zip 

It will download android SDK zip file

Put zip file in E: drive. (Note : Android SDK needs 20 to 30 GB space on disc to store different files. 
So select appropriate disc where enough space is available.)

Extract .zip file. You will get "android-sdk-windows" folder as shown in above image.

Rename folder name  from "android-sdk-windows" to "SDK" for easy name.




Install Required Packages

In order to create android emulators for testing, You need to download and install few packages. 

You can do it using Android SDK Manager as described in bellow given steps.

Look inside SDK folder. There will be "SDK Manager.exe".

Execute it by double click. It will open Android SDK Manager dialog as shown in bellow image.

Android SDK Tools package will be installed by default.

You can select your required package from list of different packages and then click on Install packages button 

I have installed different 27 packages.

Downloading all packages can take lot of time. 

After installation of different packages and system images 

we need to set ANDROID_HOME and Path environment variables. 



Set ANDROID_HOME Variable

After installation of different packages, we need to set ANDROID_HOME and path environment variables. 

Follow the steps given bellow to set it.

For example : 
Open "Environment Variables" dialog from win start menu -> Right click on My Computer -> Select properties -> Advanced system settings -> Environment Variables button from Advanced tab. 

Click on New button under User Variable table. It will open New User Variable dialog.

Set Variable Name = ANDROID_HOME and Variable value = E:\SDK (Path of SDK folder). Path can be different for you as per your SDK folder location as described in previous post.

Click on OK button to close New User Variable dialog.



Set Path Variables

Open SDK Folder from E: drive.

You will find "tools" and "platform-tools" folders inside SDK folder.

Copy path of both these folders. e.g. E:\SDK\tools and E:\SDK\platform-tools\

Open "Environment Variables" dialog as described above.

Locate Path variable line under System Variables table.

Edit Path variable by clicking on Edit button. It will open Edit  System Variables dialog.

Append "tools" and "platform-tools" folder's full path at the end of line 

e.g. ;E:\SDK\tools;E:\SDK\platform-tools\



Now close all dialog by clicking on OK buttons of all opened dialog

Verify Android Is Installed And Configured Properly

To check if android is configured properly or not

Open command prompt --->Type command android 

It will open Android SDK Manager dialog

android is configured properly in your system.

Now ANDROID_HOME and Path Environment Variables are set for android SDK in windows environment. 

So android environment is configured and ready to use with appium to execute software automation tests






Not required in this scenario

To integrate android SDK with eclipse IDE to access SDK tools in eclipse IDE. 

Android offers plugin called Android Developer Tools (ADT) to integrate android development environment in eclipse IDE.

After installing ADT in eclipse, we can setup android project, debug apps and build apps.

However we CAN use it to launch android emulators through eclipse to run software automation tests on it using appium. 

Also you can launch android virtual devices(Emulator) direct from SDK folder -> AVD Manager.exe. 

So this is optional step but still let me describe you how to do it if you wish to launch AVD Manager from eclipse.



Bellow given tools/components should be available/installed

Eclipse IDE -> VIEW POST.

JDK -> VIEW POST.

Android SDK -> VIEW POST.

Steps to install ADT plugin in eclipse IDE.

Open eclipse IDE

Go to Help -> Install New Software. It will open Install software dialog.

Click on Add button. It will open Add Repository dialog.

Set URL "https://dl-ssl.google.com/android/eclipse/" in Location text box and click on OK button as shown in above snap.

It will load Developer Tools with check box.

Select all check box of developer tools and click on Next button. 

It will take you to installation details.

Click on Next button. It will take you to Review Licenses screen.



On completion of ADT plugin, It will ask you to restart eclipse IDE. 

Click on Yes to restart eclipse IDE.

We need to set SDK folder path after installation of ADT plugin which enables eclipse to integrate with android software development environment. 

Open eclipse IDE Preferences dialog from Windows -> Preferences.

Select Android on Preferences dialog.

Set SDK folder path in SDK Location box. 

SDK folder is located in my E: drive which contain all android SDK related stuff


Verify Android SDK configured properly with eclipse

To verify if android SDK is integrated properly or not

Go to Eclipse IDE's Windows menu -> Select Android SDK Manager.

It will open Android SDK Manager dialog

hence we confirmconfirms that android SDK is integrated properly with eclipse IDE using ADT plugin.







Download And Install

Search for "download latest version of Microsoft .Net Framework" keyword In google

It will take you to Microsoft .Net Framework latest version download page.

Current latest version is Microsoft .NET Framework 4.5.

Click on download button. It will download .exe file to install Microsoft .Net Framework(e.g. dotNetFx45_Full_setup.exe).

Double click on .Net framework installation .exe file.

It will open .Net framework installation dialog.

Proceed for installation with default selected options and settings on each screen of installation dialog.



Download And Install node js 

Go to https://nodejs.org/en/download/

Download Windows Installer (.msi) file as per your system(32 bit or 64 bit)

Double click on Node JS installation .msi file.

It will open Node JS installation dialog.

Proceed for installation with default selected options and settings on each screen of installation dialog.



Download And Install PDANet+ for Android

http://pdanet.co/a/

Download PdaNet+ for Android (4.1 or above)

Version 5.10 installer for Windows 10/8/7/Vista/XP (both 32/64bit)

Download and installation instructions for Mac OS (5.0 or above).

We need to install this software only if you not able to detect your connected device in PC. Later on we will learn how to connect device with PC in THIS POST.


Right now skip this software installation and install it only if you face any problem in detecting device in PC.


We need to connect real android device with PC in USB debugging mode in order to run android app automation tests in real android device using appium.



Enable Developer Option In Android Device

Previously if you have not enabled "developer options" in your android device then once you need to enable it in order to switch device

in USB debugging mode. O

otherwise you can not access USB debugging mode in your device

Verify Developer Option Is Enabled?

To check Developer Option is enabled or not,

Note: It may vary also with Android devices



Enable Developer Option

To enable Developer Option in android device

Go to Settings.

Scroll down to bottom and tap on About Phone.

Scroll down bottom again on About Phone screen. 

we will see option Build number.

Tap seven times on Build number option one by one.

After 3 tap, It will start showing you message like.. "we are now 2 steps away from being a developer".

Now go back to Settings and scroll down bottom.

You will see option Developer Options above About Phone as shown in bellow image.


Connect Device With PC And Start USB Debugging Mode

To start USB Debugging mode

Connect your device with PC using USB cable.

Go to Settings -> Developer options.

There will be option USB debugging with check box. Check it.

It will ask you to "Allow USB debugging?". Tap on OK.

It will enable USB debugging mode for your android device.





Verify Device Connected Properly With PC

To verify device is connected properly with PC with USB debugging mode

Open command prompt in your PC

Run command adb devices.

It will show you list of connected devices with your PC. 

If not display any device in list that means there is some issue with device connection or USB debugging mode is not enabled properly.


Referenced screenshot:

![image](https://user-images.githubusercontent.com/33985509/59462211-894c7680-8e23-11e9-996f-f25f2153b38d.png)




Microsoft Webdriver


Go to the link https://www.microsoft.com/en-us/download/details.aspx?id=48212

Click on the Download link on this page.

Install it.



Eclipse Configuration with Selenium WebDriver: 

This is needed for the interaction between your test scripts and the Selenium WebDriver. 

For the same, we will be needing language-specific client drivers.working on needs Java client drivers.

Go to this link: http://docs.seleniumhq.org/download/

Click on the Download link here for the latest JAR available (selenium-2.53.0 in my case)

Extract the downloaded zipped folder

Open Eclipse IDE

Create a new Java Project -> Create a new package under this project -> Create a new class under this package

Right click on your Project name -> Select Build Path -> Select Configure Build Path

Click on “Add External JARs” button -> go to the path where you had saved the Selenium WebDriver zip folder (e.g. in my case: C:\Android Automation\selenium-java-2.53.0\selenium-2.53.0)

Select both .jar files from here.

Now select all the .jar files inside the libs folder here.

Don’t close the Properties Dialogue, since there are a few more JARs which need to be added to your project.




Eclipse Configuration with Appium: 

Go to this link: http://appium.io/downloads.html

Click on the Java link under the Appium Client Libraries section.

Click on the JAR link here.

Download starts.

Follow the same steps as in 10. to import Appium client libraries into your Eclipse project.

Click on OK after importing all the JAR files.














Installing Appium

Install Appium --- > http://appium.io/downloads.html

It will download zip file.

When download completes, Extract zip file.we will get AppiumForWindows folder

Open AppiumForWindows folder. "appium-installer.exe" file will be there.

Double click on "appium-installer.exe" file to install appium. It will start installing appium.


Android Settings :

Click on Android Settings button as shown in bellow image.

Select Platform Name = Android

Select Automation Name = Appium

Select PlatformVersion = Your android device's OS version. 

General Settings

Click on General Settings button as shown in bellow image.

Note down Server Address and Post number. 

We need it during appium software automation test script creation. 

Server Address is : 127.0.0.1 and Port number is : 4723.

Un-check Pre-Launch Application check box if it is checked.






# Automation Framework

An Automation Framework is collection of concepts, assumptions and practices while developing the automation project, 

so it useful to constitute a work platform or support for automated testing. 

If you look into the existing framework, it will be block of function libraries for reporting, error handling, and driver scripts. 

So the test automation framework is an execution environment for automated tests. 

It is the overall system in which our tests will be automated.

<b>Contents</b>

    • What is a Framework 
    • Why do we need Automation framework
    • Data-Driven Framework
    • Purpose of Framework
    • Frameworks Tools
    • Framework Structure
        ◦ Keywords Library
        ◦ Object Repository
        ◦ Generate reports
        ◦ Send reports by Email
        ◦ Screenshot
        
<b>What is a Framework?</b>

In general, a framework is a real or conceptual structure intended to serve as a support or guide for the building of something that 
expands the structure into something useful.

Using Frameworks, produce beneficial outcomes like increased code re-usage, higher portability, reduced script maintenance cost, higher code readability, etc. 

Prior to knowing about the Hybrid Test Automation Framework, we should know about the existing frameworks.

Generally we have,
    • Data Driven Framework
    • Hybrid Framework
    
<b>Why do we need Automation framework?</b>

Using Framework, we can solve many issues like

    • Writing code once and reusing it. Significant Reduction in Testing Cycle Time
    
    • Running the script with different set of data.
    
    • Executing the scripts end-to-end without any manual intervention. ( If any error occurs from tool or application, Script run will stop. If we use framework, it will skip or fail that test case and run with the next test case.)
    
    • With basic knowledge on tool also anyone can run and write the script. 
    
    • Maintenance becomes very easy.
    
    
    
Combination of above all framework is nothing but Hybrid Driven Framework.

Example: In the application, We have 5 scenarios.

    • login with out using password
    
    • login with wrong password
    
    • login with valid Credentials 
    
    • logout and relogin with same credentials
    
    • log out and verify fogot password link
    
Now write a script for all 5 scenarios using any automation tool.

Write a script for one time. Make it as a function and reuse the same function

    • Read all the scenarios.
    
    • Identify the repeated steps.
    
    • Convert them into function.
    
<b>Advantages:</b>

    • Write once (saves time)
    
    • Reusable
    
    • Easy Maintenance
    
<b>Disadvantages:</b>

    • Data is hard-coded, we can’t run with multiple sets of data.
    
<b>Data Driven Framework:</b>

It is a framework where test input and output values are read from data files (Excel, CSV, Database) and are loaded into variables in captured or manually coded scripts. 

If we see the above example, For Login(uname) we can run the script with any data picking it from excel or CSV.




<b>Purpose:</b>

To build a Hybrid Test Automation Framework which can be used across different web/Mobile based applications. 

With this framework in place, whenever we need to automate a web based application.

<b>Tools Used:</b>

    • Eclipse Java EE
    • Java 7+
    • Jxl
    • Apache Maven
    • JUnit 4.10
    • TestNG
    • XML
    • Extent Libraries
    • Appium 1.12.0
    • Android Studio
    • Others Open-Source tools
    
<b>Framework Structure:</b>

The framework consists of the following components.

    • pageObjects
        ◦ Locators


    • testSuite/Scenarios
        ◦ TestCases
    • utils
        ◦ BaseClass

<b>Object Repository:</b>

-- Page objects we are using for the locators.


![image](https://user-images.githubusercontent.com/33985509/59570881-d1c39880-909e-11e9-9398-cd94efab53cf.png)


Page Object Model is a design pattern which has become popular in test automation for enhancing test maintenance and reducing code duplication. 

A page object is an object-oriented class that serves as an interface to a page of your AUT.

The tests then use the methods of this page object class whenever they need to interact with the UI of that page, 

the benefit is that if the UI changes for the page, the tests themselves don’t need to be changed, only the code within the page object needs to change.

Subsequently all changes to support that new UI are located in one place.


Increasing automation test coverage can result in unmaintainable project structure, if locators are not managed in right way. 

This can happen due to duplication of code or mainly due to duplicated usage of locators.

For Example, in home page of web application we have menu bar which leads to different modules with different features.

Many automation test cases would be clicking through these menu buttons to execute specific tests.

Imagine that the UI is changed/revamped and menu buttons are relocated to different position in home page, this will result automation tests to fail. 

Automated test cases will fail as scripts will not be able to find particular element-locators to perform action.

Now, QA Engineer need to walk through whole code to update locators where necessary. 

Updating element-locators in duplicated code will consume a lot of time to only adjust locators, while this time can be consumed to increase test coverage. 

We can save this time by using Page Object Model in our test automation framework.


According to Page Object Model, we should keep our tests and element locators separately, this will keep code clean and easy to understand and maintain.

The Page Object approach makes test automation framework programmer friendly, more durable and comprehensive.

Another important advantage is our Page Object Repository is Independent of Automation Tests. 

Keeping separate repository for page objects helps us to use this repository for different purposes with different frameworks like, we are able to integrate this repository with other tools like JUnit/NUnit/PhpUnit as well as with TestNG/Cucumber/etc.

Test cases become short and optimized as we are able to reuse page object methods in the POM classes.

Any change in UI can easily be implemented, updated and maintained into the Page Objects and Classes.









<b>Generate reports:</b>
-- using Extent reports library we are generating reports for passed and failed test cases including screenshots
Available under utils package

<b> Note:</b> Sample code snippets for reusable methods and other methods are availble in the project.




## BaseClass.java

package utils;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static io.appium.java_client.touch.offset.PointOption.point;

import static java.time.Duration.ofMillis;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.lang.reflect.Method;

import java.net.MalformedURLException;

import java.net.URL;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Iterator;

import java.util.List;

import java.util.Properties;

import java.util.Scanner;

import java.util.UUID;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;

import org.testng.ITestContext;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileElement;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

	public static String TimeStamp = new SimpleDateFormat("MM-dd HH-mm-ss").format(new Date());
	
	public String TestName = this.getClass().getSimpleName();
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public static int count = 0;
	
	private static Scanner scanner;
	
	static String firstLine;
	
	public static AndroidDriver<WebElement> driver = null;
	
	public static WebDriverWait wait;
	
	public static String extentReport;
	
	Dimension size;

	@BeforeSuite
	
	public void setUpSuiteDetails() throws Exception {
	
		extentReport = "M:\\android\\Reports\\" + TestName + TimeStamp + ".html";
		
		extent = new ExtentReports(extentReport, true);

	}

	/**
	 * <h1>before Test it will launch the app with specified app package and
	 * activity
	 * </p>
	 * 
	 * @throws MalformedURLException
	 */
	@BeforeTest
	public void beforeTest() throws MalformedURLException {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//org.telegram.messenger/org.telegram.ui.IntroActivity
		
		//org.telegram.messenger/org.telegram.ui.LaunchActivity}
		
		dc.setCapability("deviceName", "Moto");
		
		dc.setCapability("platformName", "Android");
		
		dc.setCapability("platformVersion", "");
		
		dc.setCapability("appPackage", "org.telegram.messenger");
		
		dc.setCapability("appActivity", "org.telegram.ui.LaunchActivity");
		
		dc.setCapability("autoAcceptAlerts", true);
		
		dc.setCapability("autoGrantPermissions", true);
		
		 dc.setCapability("noReset", true);
		 
		dc.setCapability("automationName", "UiAUtomator2");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver<WebElement>(url, dc);
		
		wait = new WebDriverWait(driver, 30);
	}

	/**
	 * <p>
	 * This is used to take a screenshot with unique id in the specified
	 * location
	 * 
	 * @param driver
	 * @return
	 */
	public static String createScreenshot(WebDriver driver) {
	
		String reportLocation = "M:\\android\\Reports\\Screenshots.html";
		
		String imageLocation = "images/";

		UUID uuid = UUID.randomUUID();

		// generate screenshot as a file object
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			// copy file object to designated location
			
			FileUtils.copyFile(scrFile, new File(reportLocation + imageLocation + uuid + ".png"));
			
		} catch (IOException e) {
		
			System.out.println("Error while generating screenshot:\n" + e.toString());
		}

		return reportLocation + imageLocation + uuid + ".png";
	}

	@BeforeMethod
	public void beforeMethod(Method method) {
	
		test = extent.startTest(method.getAnnotation(Test.class).description());
	}

	@AfterMethod
	public void tearDown(ITestResult result, Method method) throws Exception {
	
		wait(3000);
		
		if (result.getStatus() == ITestResult.FAILURE) {
		
			String firstLine = "";
			
			Throwable exception = result.getThrowable();
			
			String str = exception.toString();
			
			scanner = new Scanner(str);
			
			firstLine = scanner.nextLine();
			
			count++;
			
			String screenshot_path = createScreenshot(driver);
			
			String image = test.addScreenCapture(screenshot_path);
			
			test.log(LogStatus.FAIL, result.getThrowable().getMessage(), image);

		} else {
		
			String screenshot_path = createScreenshot(driver);
			
			String image = test.addScreenCapture(screenshot_path);
			
			test.log(LogStatus.PASS, "Passed " + method.getName(), image);
		}
		
		extent.endTest(test);
	}

	@AfterSuite
	
	public void afterSuite() throws Exception {
	
		try {
			extent.flush();
			
			wait(1000);
			
			driver.quit();
			
		} catch (Exception ex) {
		}
	}

	@BeforeClass
	
	public void BeforeClass() throws Exception {
	
		TestName = this.getClass().getSimpleName();
		
		System.out.println("TestName ::::: " + TestName);

	}

	/**
	 * <p>
	 * This Method is used to click on an element using locator
	 */
	public void click(MobileElement element) throws Exception {
		try {
			element.click();
		} catch (Exception e) {
			throw e;

		}
	}
	/**
	 * <p>
	 * This is to verify the element using actual and expected results
	 * 
	 * @param locator
	 * @param expected
	 */
	public void verifyElementTextByAsert(By locator, String expected) {
	
		String actual = driver.findElement(locator).getText();
		
		Assert.assertEquals(actual, expected);
		
		System.out.println("Verified Element " + actual);
	}

	/**
	 * <p>
	 * This method is to verify Keyboard is appeared or not
	 */
	public void keyboardStatus() {
	
		boolean isKeyboardShown = driver.isKeyboardShown();

		if (isKeyboardShown == true) {
		
			System.out.print("Keyboard Appeared !!!");
			
		} else {
		
			System.out.println("No Keyboard Appears Yet !!!");
		}
	}

	/**
	 * <p>
	 * This method is used to scroll the screen with the help of device
	 * dimensions
	 */
	public void scrollByDeviceDimension() {
	
		size = driver.manage().window().getSize();
		
		int starty = (int) (size.height * 0.80);
		
		// Find endy point which is at top side of screen.
		
		int endy = (int) (size.height * 0.30);
		
		// Find horizontal point where you wants to swipe. It is in middle of
		
		// screen width.
		
		int startx = size.width / 2;
		
		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		
		new TouchAction(driver).press(point(startx, starty)).waitAction(waitOptions(ofMillis(3000)))
				.moveTo(point(startx, endy)).release().perform();

	}
	
public void scrollByElementText(String ElementText){
		
		driver.findElement(MobileBy
		
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\""+ElementText+"\"));"));
}
public void UiSCrollableByIdText(String rID, String text) {

	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" + rID
			+ "\")).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"))"));
}
	/**
	 * <p>
	 * This method is used to verify the placeholder value of provided element
	 * 
	 * @param locator
	 * @param requiredattribute
	 * @return
	 * @throws Exception
	 */
	public static String getattributevalue(By locator, String requiredattribute) throws Exception {
	
		String attribute = null;
		
		try {
			attribute = driver.findElement(locator).getAttribute(requiredattribute);
			
			System.out.println(attribute);
			
		} catch (RuntimeException localRuntimeException) {
		
		}
		
		return attribute;
	}

	/**
	 * <p>
	 * This Method is used to verify the element is present or not if present it
	 * will perform click action on provided element locator
	 * 
	 * @param loc
	 * @return
	 */
	public static boolean ClicIfElementPresent(By loc) {
	
		if (driver.findElement((loc)).isDisplayed()) {
		
			String text = (driver.findElement((loc)).getText());
			
			System.out.println("Available Element is: " + text);
			
			driver.findElement(loc).click();
			
			return true;
			
		} else {
		
			return false;
		}
	}

	public void ContainsTextByAssert(By locator, String ContainsText) {
	
		String actualString = driver.findElement(locator).getText();
		
		Assert.assertTrue(actualString.contains(ContainsText));
	}

	/**
	 * <p>
	 * This Method is used to clear if any data found in the text box and pass
	 * the required test data
	 */
	public void type(By locator, String data) throws Exception {
		try {
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(element).click().perform();
			
			driver.findElement(locator).clear();
			
			wait(1000);
			
			driver.findElement(locator).sendKeys(data);
			
		} catch (RuntimeException localRuntimeException) {
		
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			
			localRuntimeException.getMessage();
			
			throw localRuntimeException;
		}
	}

	/**
	 * wait for element with given int
	 * 
	 * @param locator
	 * @param timer
	 * @throws Exception
	 */
	public void waitForElement(By locator, int timer) throws Exception {
		try {
			for (int i = 0; i < timer; i++) {
				try {
					driver.findElement(locator).isDisplayed();
					
					System.out.println("Element is available :" + locator);
					
					break;
				} catch (RuntimeException localRuntimeException) {
				
					Thread.sleep(1000);
					
					System.out.println("Waiting for........" + locator);
				}
			}
		} catch (RuntimeException localRuntimeException) {
		
			System.out.println("Error in performing Wait:" + localRuntimeException.getMessage() + "Fail");
			
			localRuntimeException.getMessage();
		}
	}

	/**
	 * <p>
	 * This method is used to find the element's text and print on console
	 * 
	 * @param locator
	 * @return
	 */
	public String printText(MobileElement element) {
	
		/*String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
		
		System.out.println("Verified Element Text is :" + text);
		
		return text;*/
		
		String elText = element.getText();
		
		return elText;
	}

	/**
	 * <p>
	 * This method is used to find available elements text and print on console
	 * 
	 * @param locator
	 * @return
	 */
	public void printAvailableElementsText(By locator) {
	
		List<WebElement> element = driver.findElements(locator);
		
		Iterator<WebElement> itr = element.iterator();
		
		while (itr.hasNext()) {
		
			System.out.println(itr.next().getText());
		}

	}

	public void wait(int ms) {
	
		try {
			Thread.sleep(ms);
			
		} catch (InterruptedException e) {
		}
	}
}




## TestScenarios.java

package testSuite;

import java.util.Map;

import javax.naming.Context;

import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.StartsActivity;
import pageObjects.Locators;
import testMethods.TestSteps;
import utils.BaseClass;

public class TestScenarios extends BaseClass{

	TestSteps execute= new TestSteps();
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



## Locators

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import utils.BaseClass;

public class Locators extends BaseClass {

	public MobileElement hambergerMenu = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc='Open navigation menu']");

	public MobileElement inviteFriends = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Invite Friends']");

	public MobileElement textFields = (MobileElement) driver.findElementByClassName("android.widget.TextView");
	public MobileElement search = (MobileElement) driver.findElementByClassName("android.widget.EditText");
	public MobileElement contactHello = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='HelloThere']");
	public MobileElement contactUIa = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='UIDAI']");
	public MobileElement backArrow = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc='Go back']");

	public MobileElement contactsMenu = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Contacts']");
	public MobileElement sorting = (MobileElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc='Change sorting']");

	public MobileElement wifiSettings = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='Wi‑Fi']");
	public MobileElement connectedWifi =(MobileElement) driver.findElementByClassName("android.widget.CheckedTextView");
	public MobileElement toggleWifi = (MobileElement) driver.findElementById("android:id/checkbox");
			

	

}




