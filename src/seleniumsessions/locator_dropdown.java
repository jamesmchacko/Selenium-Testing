package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locator_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazondelivers.jobs/?cmpid=SAGOCH2805H6&gclid=Cj0KCQjwvr6EBhDOARIsAPpqUPEUkdstb_7aGqpzv7iGzTwRHNxJjwEf46At9ZJvqCEzk6ZaUsDTLR0aAjSqEALw_wcB");

		// for dropdown in website

		Select select = new Select(driver.findElement(By.id("sel-location-0")));
		select.selectByVisibleText("Canada");

	}

}
