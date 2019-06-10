package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import utils.BaseClass;

public class Locators extends BaseClass {

	public By hambergerMenu = By.xpath("//android.widget.ImageView[@content-desc='Open navigation menu']");

	public By inviteFriends = By.xpath("//android.widget.TextView[@text='Invite Friends']");

	public By textFields = By.className("android.widget.TextView");
	public By search = By.className("android.widget.EditText");
	public By contactHello = By.xpath("//android.widget.TextView[@text='HelloThere']");
	public By contactUIa = By.xpath("//android.widget.TextView[@text='UIDAI']");
	public By backArrow = By.xpath("//android.widget.ImageView[@content-desc='Go back']");

	/**
	 * <h1>this method is to perform click and scroll actions</h1?
	 * <p>
	 * click on hamburger menu --> click on invite Friends --> perform Scroll
	 * and click on a contact
	 * 
	 * 
	 * @throws Exception
	 */
	public void clickAndScroll() throws Exception {
		click(hambergerMenu);
		printAvailableElementsText(textFields);
		click(inviteFriends);
		waitForElement(search, 5);
		getattributevalue(search, "content-desc");
		wait(2000);
		UiSCrollableByIdText("android:id/content", "HelloThere");
		click(contactHello);

	}

	public By contactsMenu = By.xpath("//android.widget.TextView[@text='Contacts']");
	public By sorting = By.xpath("//android.widget.ImageView[@content-desc='Change sorting']");

	/**
	 * <h1>this method is verify sorting order</h1?
	 * <p>
	 * click on contacts and verify sort oprions
	 * 
	 *
	 * @throws Exception
	 */
	public void sorting() throws Exception {
		click(backArrow);
		click(hambergerMenu);
		click(contactsMenu);
		wait(2000);
		printAvailableElementsText(textFields);
		click(contactsMenu);
		printAvailableElementsText(textFields);

	}
public By wifiSettings = By.xpath("//android.widget.TextView[@text='Wi‑Fi']");
	public By connectedWifi = By.className("android.widget.CheckedTextView");
	public By toggleWifi = By.id("android:id/checkbox");

	/**
	 * <h1>this method is verify connected device ID and check wifi name then
	 * disable wifi</h1?
	 * <p>
	 * launch settings App and check connected wifi name then turn off wifi
	 * <b>NOTE: Used Red Mi Note 5 Android 8.1.0
	 * 
	 * @throws Exception
	 */
	public void udid_wifi() throws Exception {
		//Connected device's UDID
		System.out.println(driver.getSessionId());
		//launching Native Settings App 
		driver.startActivity(new Activity("com.android.settings", "com.android.settings.MainSettings"));
		wait(5000);
		//click on Wifi in Settings menu
		click(wifiSettings);
		wait(1000);
		//Print Connected wifi name
		printText(connectedWifi);
		//turn off wifi
		click(toggleWifi);
	}

}
