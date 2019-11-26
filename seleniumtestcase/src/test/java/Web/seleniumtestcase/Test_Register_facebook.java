package Web.seleniumtestcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register_facebook {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/guest2/login");
		driver.manage().window().maximize();
		
		WebElement facebook = driver.findElement(By.xpath(".//*[@id='facebookLoginButton']"));
		facebook.click();
		
		// Check button can use
		Boolean check = facebook.isEnabled();
		System.out.println("Facebook register button enable = " + check);
		
		assertTrue(check);
	}

}
