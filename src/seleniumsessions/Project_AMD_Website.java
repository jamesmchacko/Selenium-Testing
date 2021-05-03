package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_AMD_Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//C:\\Users\\james\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://career4.successfactors.com/career?company=AMD&site=&lang=en_US&requestParams=HI6UlG%2f%2f00hnC5Aymlm2mJKUEhJ42m1Q3UqCQRCdNPMvKgm66xVEv%2biPLkoITUgIxG66%2bBrXSVe2%0a3XV3TCPoieohoieoy14guugdWq0LP2hg5mLOmTNn5ukbMt5BaYh3WB6zVOUz9IMW2kz24%2bV16%2fot%0aDak6FJTBXh0FG9eEPA8c%2bYFRvak9PoFZrE5yoW6ELDAse8k0drB5dT5XVaj75TY7qftHz%2b%2bXn1%2fb%0aD40UwNQG%2bhIDMOSEkqS52RuP4BHSv%2f3c0HR9NKEuQ0mgI3Jx6MSORrFMEDMH0WG0z1D0RkhUNWvV%0afQK%2fQeUp4GH8QlpSUtMivtIwpq8CYU0Y50ghS6PjpJniTlTZ3atG1WqlEojSNzWT06g6ntx%2fy7LC%0a3FrUCSPpWuuUIf93jPaL2PrsNgzWpZjvD2%2bc%2fS0hTTrutKc%2fMUd5Vg%3d%3d&login_ns=register&career_ns=job_application&career_job_req_id=82927&jobPipeline=Google&_s.crb=jYDowhpux7a5jEkXMiRRHCFXK4f3kcYClpNNRi3iKYg%3d");

		// for filling email adress

		driver.findElement(By.id("fbclc_userName")).sendKeys("project@amd.com");

		// for retyping email adress

		driver.findElement(By.cssSelector("#fbclc_emailConf")).sendKeys("project@amd.com");

		// for password

		driver.findElement(By.xpath("//input[@id='fbclc_pwd']")).sendKeys("wecandoit");

		// for retyping password

		driver.findElement(By.cssSelector("#fbclc_pwdConf")).sendKeys("wecandoit");

		// for first name

		driver.findElement(By.name("fbclc_fName")).sendKeys("James");

		// for last name

		driver.findElement(By.name("fbclc_lName")).sendKeys("Chacko");

		// for selecting country from dropdown

		Select select = new Select(driver.findElement(By.name("fbclc_country")));
		select.selectByVisibleText("Canada");

		// for selecting notification

		driver.findElement(By.xpath("//label[@for='fbclc_emailEnabled']")).click();
		driver.findElement(By.xpath("//label[@for='fbclc_campaignEmailEnabled']")).click();

		// for selecting Terms of use

		driver.findElement(By.partialLinkText("Read and accept the")).click();

		// for creating account

		driver.findElement(By.name("fbclc_createAccountButton")).click();

	}

}
