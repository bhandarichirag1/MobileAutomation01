package utilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.TestBase;


public class GenericKeywords extends TestBase {

	public static WebElement getElement(String locator) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(0));
		element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		return element;
	}

	public static void verifyElementPresent(String locator) {
		WebElement element = (WebElement) wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(locator)));
		boolean elementpresent = element.isDisplayed();
		if (elementpresent) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public static void verifyOutput(String output) {
		WebElement element = (WebElement) wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='" + output + "']")));
		boolean elementpresent = element.isDisplayed();
		if (elementpresent) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
