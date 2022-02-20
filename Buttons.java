package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	@Test
	public void buttons() {
		// 2. Assignment Buttons
		// To setup the Webdrivermanager which it will takecare of everything..
		// Instead of system.setproperty we can use this..
		WebDriverManager.chromedriver().setup();

		// Open the browser..
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leafground.com/pages/Button.html");
		// Maximize the browser
		driver.manage().window().maximize();

		WebElement Colour = driver.findElement(By.id("color"));
		System.out.println("The Button Colour is" + " " + Colour.getCssValue("background-color"));

		WebElement Size = driver.findElement(By.id("size"));
		System.out.println("The Size is" + " " + Size.getSize());
		// position
		WebElement Location = driver.findElement(By.id("position"));
		System.out.println("The Location of the Field" + " " + Location.getLocation());

	}

}
