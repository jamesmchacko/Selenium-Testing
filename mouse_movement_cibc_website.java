package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_movement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // to maximize the window
		driver.manage().deleteAllCookies();

		driver.get("https://www.cibc.com/en/personal-banking.html");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Bank Accounts"))).build().perform();

		// Thread.sleep(3000); if we want a delay
		driver.findElement(By.linkText("Savings")).click();
	}

}
