package reportTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase extends BaseClass {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) setCapabilites();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("App Opened successfully");
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		

		Thread.sleep(10000);
		
		

	}

}