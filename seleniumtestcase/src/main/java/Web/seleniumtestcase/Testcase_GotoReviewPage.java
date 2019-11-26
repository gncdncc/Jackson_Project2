package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_GotoReviewPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com//");
		driver.manage().window().maximize();
		
		 WebElement regis = driver.findElement(By.xpath(".//span[@class='sc-15hq5pm-0 hZlpdU sc-1ave5jq-4 jmTkzA']"));
		 regis.click();
		 WebElement review = driver.findElement(By.xpath(".//span[@class='sc-1h799rw-2 iWPUqI']"));
		 review.click();
		
	}

}
