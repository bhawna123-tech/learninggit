package Java_Automation.Maven_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		this.driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void appclose() {
		/*
		 * WebElement actualResult =
		 * driver.findElement(By.xpath(Constant.actualResult)); String actualResultUi =
		 * actualResult.getText(); String expectedResult = Constant.expectedResult; if
		 * (actualResultUi.equals(expectedResult)) {
		 * System.out.println("Fare Summary is showing"); } else {
		 * System.out.println("Fare Summary is  not showing"); }
		 */
		driver.quit();
	}
}
