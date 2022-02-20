package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public ChromeDriver driver;

@BeforeMethod
public void precondition()
{
	WebDriverManager.chromedriver().setup();

	// Open the browser..
			driver = new ChromeDriver();
			// Load the URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			// Maximize the browser
			driver.manage().window().maximize();
			// Enter UserName
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("Demosalesmanager");
			System.out.println(userName);
			// Enter Password..
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// Click Login
			driver.findElement(By.className("decorativeSubmit")).click();
}

@AfterMethod
public void postcondition() {
	driver.close();
}

}
