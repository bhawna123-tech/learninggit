package Java_Automation.Maven_TestNG;

import java.util.concurrent.TimeUnit;

public class Constant {
	private static final TimeUnit SleepUtils = null;
	public static final String closePopUp = "//span[@class='commonModal__close']";
	public static final String citySelection_Locator = "//li[@class='menu_Hotels']";
	public static final String BASE_URL = "https://www.makemytrip.com/";
	public static final String BASE_URL_Naukri = "https://www.naukri.com/";

	public static final String citySelection = "//input[@data-cy='city']";
	public static final String city = "Pune";
	public static final String areaSelection = "//*[contains(text(),'Hinjewadi')]";
	public static final String checkIn_Date = "//div[@aria-label='Fri Aug 16 2024']";
	public static final String checkOut_Date = "//div[@aria-label='Sat Aug 17 2024']";
	public static final String rooms_Count = "(//div[@class='gstSlct'])[1]";
	public static final String adults_Count = "(//li[@data-cy='GuestSelect$$_323'])[2]";
	public static final String apply_Btn = "//button[text()='Apply']";
	public static final String search_Btn = "//button[text()='Search']";
	public static final String hotelSelection_Locator = "(//div[@class='makeFlex spaceBetween'])[1]";
	public static final String bookThisNow_Btn = "//div[@class='cardHldr ']/*/div[2]/*[last()-1]";
	public static final String firstName_Tbox = "//input[@name='fName']";

	public static final String popPup = "//*[text()='I UNDERSTAND']";
	public static final String firstName = "Abhilash";
	public static final String lastName_Tbox = "//input[@name='lName']";
	public static final String LastName = "Mahajan";
	public static final String emailId_Tbox = "//input[@name='email']";
	public static final String emailId = "abc@gmail.com";
	public static final String mobileNo_Tbox = "//input[@name='mNo']";
	public static final String mobileNo = "7020383711";
	public static final String payNow_Btn = "//a[text()='Pay Now']";
	public static final String bookNowPayLater_Btn = "(//span[text()='Book Now Pay Later'])";

	public static final String actualResult = "//span[contains(text(),'Fare Summary')]";
	public static final String expectedResult = "Fare Summary";
}
