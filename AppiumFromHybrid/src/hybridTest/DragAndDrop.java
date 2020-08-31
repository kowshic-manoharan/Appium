/**
 * 
 */
package hybridTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author kowshic
 *
 */
public class DragAndDrop extends HybridBaseClass{

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = (AndroidDriver<AndroidElement>) setCapabilites("real");

		System.out.println("App Opened successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		Thread.sleep(2000);
		WebElement first = driver.findElementsByClassName("android.view.View").get(0);
		WebElement second = driver.findElementsByClassName("android.view.View").get(1);
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();
				

	}

}
