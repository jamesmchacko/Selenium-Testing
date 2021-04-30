package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsession_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// By using ID

		driver.findElement(By.id("email")).sendKeys("wecanmakeit@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("voovoo");

	}

}
