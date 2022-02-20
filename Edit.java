package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	@Test
	public void Edit() {
		// 1. Assignment Edit
		// To setup the Webdrivermanager which it will takecare of everything..
		//Instead of system.setproperty we can use this..
		WebDriverManager.chromedriver().setup();

		// Open the browser..
				ChromeDriver driver = new ChromeDriver();
				// Load the URL
				driver.get("http://leafground.com/pages/Edit.html");
				// Maximize the browser
				driver.manage().window().maximize();
				// EEdit
				System.out.println(driver.getPageSource());
				System.out.println("CURRENT URL:"+driver.getCurrentUrl());
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("krish@gmail.com");
//				driver.findElement(By.xpath("//*[@value='Append '])")).clear();

				System.out.println(driver.findElement(By.xpath("//input[@value='Append ']")).isEnabled());
				System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());
				

				WebElement TextBox=driver.findElement(By.xpath("//input[@disabled='true']"));
				if(TextBox.isEnabled()) {
					System.out.println("TextBox is Enabled");
				}
				else {
					System.out.println("TextBox is disabled");
				}
			
		
		
		
		
		

	}

}
