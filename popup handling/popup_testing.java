package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);

		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		String output = popup.getText();

		if (output.equals("Please enter a valid user name")) {
			System.out.println("Testing passed");
		}

		else {
			System.out.println("Testing failed");
		}
		// popup.dismiss(); if there is cancel option in popup

		popup.accept(); // for pressing ok button on popup

	}

}
