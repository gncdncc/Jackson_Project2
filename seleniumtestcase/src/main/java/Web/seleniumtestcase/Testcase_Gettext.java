package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_Gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com//");
		driver.manage().window().maximize();
		
		
		// Check the title of the page
        	System.out.println("Page title is: " + driver.getTitle());
		// Get the text that display on the page
		String data = driver.findElement(By.xpath(".//*[@class='sc-1pvazpa-3 hxfTqx']")).getText();
		System.out.println("Result : " + data);
	}

}
