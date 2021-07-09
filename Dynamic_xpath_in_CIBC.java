package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath_in_CIBC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // to maximize the window
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); // Dynamic
																			// page
																			// waiting

		driver.get("https://www.cibc.com/en/personal-banking.html");

		driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("123456");

		// the above function may not work because the id may change every time
		// while refreshing the page
		// Another method is to use contain function

		driver.findElement(By.xpath("//input[contains(@id,'card-number-c4089a6d')]")).sendKeys("789456");

		// using starts-with function

		// driver.findElement(By.xpath("//input[starts-with(@id,'password-c4089a6d')]")).sendKeys("james");

		// if a dynamic id ends with particular string we can use ends-with
		// function

		// driver.findElement(By.xpath("//input[ends-with(@id,'-c4089a6d')]")).sendKeys("james");

		// using contain function in link text

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();

	}

}
