package Web.seleniumtestcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register_Google {

	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/guest2/login");
		driver.manage().window().maximize();
		
		WebElement google = driver.findElement(By.xpath(".//*[@id='googleLoginButton']"));
		google.click();
		// Check button can use
		System.out.println("Google register button enable = " + google.isEnabled());
		// Check button can use
		Boolean check = google.isEnabled();
				
		assertTrue(check);
		
	}

}
