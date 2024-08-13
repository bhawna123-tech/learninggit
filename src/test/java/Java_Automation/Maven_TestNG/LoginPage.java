package Java_Automation.Maven_TestNG;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage extends BaseTest {

	@Test
	public void loginpage() throws InterruptedException {
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant.closePopUp)));
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath(Constant.citySelection_Locator)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.citySelection)).click();
		Thread.sleep(5000);

		Actions a = new Actions(driver);
		a.sendKeys(Constant.city).build().perform();

		driver.findElement(By.xpath(Constant.areaSelection)).click();
		driver.findElement(By.xpath(Constant.checkIn_Date)).click();
		driver.findElement(By.xpath(Constant.checkOut_Date)).click();
		driver.findElement(By.xpath(Constant.rooms_Count)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.adults_Count)).click();
		WebElement apply = driver.findElement(By.xpath(Constant.apply_Btn));
		a.moveToElement(apply).click().build().perform();
		driver.findElement(By.xpath(Constant.search_Btn)).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(Constant.hotelSelection_Locator)).click();
		Thread.sleep(5000);

		String currentWindowHandle = driver.getWindowHandle();

		// Get the set of window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through the window handles and switch to each window
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Switched to window: " + windowHandle);
			}
		}
		// Scroll down by 500 pixels
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.bookThisNow_Btn)).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");
		driver.findElement(By.xpath(Constant.firstName_Tbox)).sendKeys(Constant.firstName);
		driver.findElement(By.xpath(Constant.lastName_Tbox)).sendKeys(Constant.LastName);
		driver.findElement(By.xpath(Constant.emailId_Tbox)).sendKeys(Constant.emailId);
		driver.findElement(By.xpath(Constant.mobileNo_Tbox)).sendKeys(Constant.mobileNo);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");

		// driver.findElement(By.xpath("//input[@id='dt_state_gst_info']")).click();
		// driver.findElement(By.xpath("//p[text()='Confirm and save billing details to
		// your profile']/..")).click();
		driver.findElement(By.xpath(Constant.payNow_Btn)).click();
		driver.findElement(By.xpath(Constant.bookNowPayLater_Btn)).click();
		Thread.sleep(5000);
		System.out.println("New Project");
		System.out.println("New Project1");
		System.out.println("New Project2");

	}
}