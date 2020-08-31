/**
 * 
 */
package hybridTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author kowshic
 *
 */
public class HybridBaseChrome {

	static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> setCapabilites(String device) throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equalsIgnoreCase("Emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kowsmano");
		}else if(device.equalsIgnoreCase("Real")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "D:\\Appium_Jars\\drivers\\chromedriver_win32\\chromedriver.exe");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

}
