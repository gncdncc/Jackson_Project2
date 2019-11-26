package Web.seleniumtestcase;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Searchbox {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/");
		driver.manage().window().maximize();
		
		//String data = driver.findElement(By.id("cookie-use-link")).getText();
		//System.out.println("Result : " + data);
		
		//Test1 : search
		WebElement Search = driver.findElement(By.name("displayQ"));
		Search.sendKeys("food");
		Search.submit();
		
		WebElement Result = driver.findElement(By.name("displayQ"));
		String checkResult = Result.getAttribute("value");
		System.out.print("Search = " + checkResult);
		
		assertEquals("food", checkResult);
	}

}
