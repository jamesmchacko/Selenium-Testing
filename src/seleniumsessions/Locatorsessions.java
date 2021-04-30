package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsessions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// by xpath method

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("voovoo");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("wecandothis@gmail.com");
	}

}
