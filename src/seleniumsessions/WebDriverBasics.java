package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for Mozilla Fire fox

		// System.setProperty("webdriver.gecko.driver","//C:\\Users\\james\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.google.com"); //launching google

		// for Google Chrome

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);

		// expected =actual outcome
		// Validation point for testing
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect Title");
		}
		System.out.println(driver.getCurrentUrl()); // for current url
		System.out.println(driver.getPageSource()); // for page source
		driver.quit();
	}

}
