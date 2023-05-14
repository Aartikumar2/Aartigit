package Mavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Maven2 {

	@Test
	public void Seleniumtest ()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\aarti\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
	}
	
}
