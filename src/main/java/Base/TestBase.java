package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	public static AndroidDriver driver;
	public static Wait<AndroidDriver> wait;

	public void executeDriver() {
		DesiredCapabilities capabilties = new DesiredCapabilities();
		capabilties.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 API 26");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilties.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8");
		capabilties.setCapability(MobileCapabilityType.UDID, "emulator-5554");

		capabilties.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.boopathy.raja.tutorial.Splash");

		capabilties.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.boopathy.raja.tutorial");

		URL url = null;
		try {
			url = new URL("http://localhost:" + 4723 + "/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver = new AndroidDriver(url, capabilties);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		 wait = new FluentWait<AndroidDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
	}
	
	public void closeDriver() {
		driver.quit();
	}
}
