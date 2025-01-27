package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnWait {
	
		public static void main(String[] args) {

			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.adidas.co.in/");
			//Selenium wait
			//Implicit wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			// Choosing element by x path - contains - sendkeys
			driver.findElement(By.xpath("//div[contains(@class,'_wrapper_1f3oz_1')]/input")).sendKeys("HOODIE",Keys.ENTER);
			// Choosing element by x path - contains - click event to select
			driver.findElement(By.xpath("//div[contains(@class,'line__gwqRF')]/div")).click();
			// getting more options using x path click method
			driver.findElement(By.xpath("//button[contains(@class,'gl-cta gl-cta--secondary expand-button___3hWYb')]")).click();
			// Redirecting to another page using text & click method
			driver.findElement(By.xpath("//span[contains(text(),'CRICKET')]")).click();
			
	}

}