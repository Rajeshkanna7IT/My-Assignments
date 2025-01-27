package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// load url 
		
		driver.get("https://login.salesforce.com/?locale=in");
		
	   // input username 
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		
       // input password 
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
		
       // login - click event
        
        driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

}
