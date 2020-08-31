/**
 * 
 */
package hybridTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author kowshic
 *
 */
public class InvokeChromeBrowser extends HybridBaseChrome{

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) setCapabilites("real");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
	}
}
