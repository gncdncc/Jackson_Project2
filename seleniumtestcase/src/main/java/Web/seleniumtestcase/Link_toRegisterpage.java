package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_toRegisterpage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/");
		driver.manage().window().maximize();
		
		
		// register & login
		// Click dropdown for show button register and login
		WebElement regis = driver.findElement(By.xpath(".//span[@class='sc-15hq5pm-0 hZlpdU sc-1ave5jq-4 jmTkzA']"));
		regis.click();
	//	// Click register button
		regis = driver.findElement(By.xpath(".//a[@class='ey22qm-5 jrcmLw']"));
		regis.click();
	}
}
