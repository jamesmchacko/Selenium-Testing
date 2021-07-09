package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_links_in_CIBC {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // to maximize the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		driver.get("https://www.cibc.com/en/personal-banking.html");

		// for finding out number of links we can use

		List<WebElement> Storage = driver.findElements(By.tagName("a"));

		System.out.println(Storage.size());

		// for printing the name of text

		for (int i = 0; i < Storage.size(); i++) {
			String StorageText = Storage.get(i).getText();

			System.out.println(StorageText);
		}

	}

}
