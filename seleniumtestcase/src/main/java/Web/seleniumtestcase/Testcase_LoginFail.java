package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_LoginFail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/guest2/login");
		driver.manage().window().maximize();
		
		//Test7 : Login fail
		WebElement login = driver.findElement(By.xpath(".//*[@name='email']"));
		login.sendKeys("thayut.ind@gmail.com");
		// Check button can use
		System.out.println(login.isEnabled());
		
		WebElement clicklogin = driver.findElement(By.xpath(".//*[@class='sc-EHOje cjQjIN']"));
		clicklogin.click();
		
		WebElement loginpass = driver.findElement(By.xpath(".//*[@name='password']"));
		loginpass.sendKeys("12345678");
	}
}
