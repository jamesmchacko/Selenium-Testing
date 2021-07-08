package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class upload_files_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.gecko.driver",
		// "//C:\\Users\\james\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\ReadMe.html");

	}

}
