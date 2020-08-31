/**
 * 
 */
package hybridTest;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author kowshic
 *
 */
public class UIAutomator extends HybridBaseClass {

	/**
	 * @param args
	 * @throws MalformedURLException
	 */
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) setCapabilites("real");

		System.out.println("App Opened successfully");

		// driver.findElementByAndroidUIAutomator("attribute("value")") --> Syntax

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		// driver.findElementsByAndroidUIAutomator("new UISelector().attribute(value)") --> Syntax
		 
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
