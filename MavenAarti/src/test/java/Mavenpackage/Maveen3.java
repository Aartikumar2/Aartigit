package Mavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maveen3 {

	@Test
	public void Seleniumtest ()
	{
		System.out.println("System.setProperty("webdriver.gecko.driver", "C:\\Users\\aarti\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();

	driver.get("https://www.amazon.com/");
	}
}


	