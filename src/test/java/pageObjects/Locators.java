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
