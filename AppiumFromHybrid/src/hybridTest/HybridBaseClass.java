package hybridTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class HybridBaseClass {
	
	static AndroidDriver<AndroidElement> driver;
	public static AndroidDriver<AndroidElement> setCapabilites(String device) throws MalformedURLException
	{
		File app = new File("src");
		File fs = new File(app, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equalsIgnoreCase("Emulator")) {
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "kowsmano");
		}else if(device.equalsIgnoreCase("Real")){
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
}