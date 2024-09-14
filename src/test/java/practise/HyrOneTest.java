package practise;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrOneTest {
	WebDriver driver;
	@Test
	public void hyrpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/");
		String Name = driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']")).getText();
		System.out.println(Name);
		Assert.assertEquals(Name, "YADA GIRI REDDY");
		
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
