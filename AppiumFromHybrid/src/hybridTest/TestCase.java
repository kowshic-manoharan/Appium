package hybridTest;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends HybridBaseClass {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) setCapabilites("real");
		System.out.println("App Opened successfully");
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		Thread.sleep(10000);
	}
}