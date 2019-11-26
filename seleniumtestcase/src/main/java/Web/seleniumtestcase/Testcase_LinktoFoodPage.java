package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_LinktoFoodPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com//");
		driver.manage().window().maximize();
		
		// Link to page food
		WebElement clickres = driver.findElement(By.xpath(".//*[@class='sc-16qgtf6-5 iaCACm']"));
		clickres.click();
		
//		WebElement map = driver.findElement(By.xpath(".//*[@class='_1zFQmfuBST1hNiZhsqj6MU']"));
//		map.click();

		
//		driver.quit();
		
	
	}
}
