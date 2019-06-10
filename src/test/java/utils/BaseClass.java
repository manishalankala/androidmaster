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
	public void click(By locator) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated((locator))).click();
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
	public String printText(By locator) {
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
		System.out.println("Verified Element Text is :" + text);
		return text;
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
