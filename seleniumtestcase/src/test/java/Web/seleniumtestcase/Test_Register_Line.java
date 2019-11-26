package Web.seleniumtestcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register_Line {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/guest2/login");
		driver.manage().window().maximize();
		
		WebElement line = driver.findElement(By.xpath(".//*[@id='lineLoginButton']"));
		line.click();
		System.out.println("Line register button enable = " + line.isEnabled());
		// Check button can use
		Boolean check = line.isEnabled();
		
		assertTrue(check);
	}

}
