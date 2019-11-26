package Web.seleniumtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/natcha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wongnai.com/guest2/login");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath(".//*[@id='signUpLink']"));
		signup.click();
		  
		WebElement signmail = driver.findElement(By.xpath(".//*[@name='email']"));
		signmail.sendKeys("thayut.ind@gmail.com");
		WebElement signname = driver.findElement(By.xpath(".//*[@name='name']"));
		signname.sendKeys("Thayut");
		WebElement gender = driver.findElement(By.xpath(".//*[@class='sc-dxgOiQ kUNdKG']"));
		gender.click();
		  
		WebElement confirm = driver.findElement(By.xpath(".//*[@class='sc-EHOje cjQjIN']"));
		confirm.click();
		
//		driver.close();
	}

}
