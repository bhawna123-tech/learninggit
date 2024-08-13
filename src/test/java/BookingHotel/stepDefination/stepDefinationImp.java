package BookingHotel.stepDefination;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Java_Automation.Maven_TestNG.BaseTest;
import Java_Automation.Maven_TestNG.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinationImp extends BaseTest {
	/* private static final TimeUnit SleepUtils = null; */
	// public WebDriver driver;
	// WebDriver driver = new ChromeDriver();

	/*
	 * @Given("Landed on MakeMyTrip Booking Page") public void landingPage() {
	 * setup(); }
	 */

	@Given("^Book the hotel at Pune location (.+)$")
	public void citySelection(String cityName) throws InterruptedException {
		setup();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.citySelection_Locator)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.citySelection)).click();
		Thread.sleep(5000);

		Actions a = new Actions(driver);
		a.sendKeys(cityName).build().perform();

		driver.findElement(By.xpath(Constant.areaSelection)).click();
		driver.findElement(By.xpath(Constant.checkIn_Date)).click();
		driver.findElement(By.xpath(Constant.checkOut_Date)).click();
		driver.findElement(By.xpath(Constant.rooms_Count)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.adults_Count)).click();
		WebElement apply = driver.findElement(By.xpath(Constant.apply_Btn));
		a.moveToElement(apply).click().build().perform();
		driver.findElement(By.xpath(Constant.search_Btn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.hotelSelection_Locator)).click();
		Thread.sleep(5000);
	}

	@And("^Giving Details firstname (.+) , lastname (.+) , emailId (.+) and mobilenumber (.+)$")
	public void fillDetails(String fname, String lname, String emailId, String mobileNo) throws InterruptedException {
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
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.popPup)).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");
		driver.findElement(By.xpath(Constant.firstName_Tbox)).sendKeys(fname);
		driver.findElement(By.xpath(Constant.lastName_Tbox)).sendKeys(lname);
		driver.findElement(By.xpath(Constant.emailId_Tbox)).sendKeys(emailId);
		driver.findElement(By.xpath(Constant.mobileNo_Tbox)).sendKeys(mobileNo);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");
		// driver.findElement(By.xpath("//div[@class='appendBottom15 ']")).click();

		// WebElement stateSelection =
		// driver.findElement(By.xpath("//input[@id='dt_state_gst_info']"));
		// driver.findElement(By.xpath("//input[@id='dt_state_gst_info']")).click();
		// driver.findElement(By.xpath("//div[@class='checkboxWithLblWpr']")).click();
		// catch (NoSuchElementException e) {
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.payNow_Btn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Constant.bookNowPayLater_Btn)).click();
		Thread.sleep(5000);

	}

	@Then("Verifying details with message {string}")
	public void verifyDetails(String string) {
		System.out.println(string);
		appclose();

	}
}
