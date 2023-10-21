package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo03 {
	
	public static void main (String[] args) throws InterruptedException {
		
		//Initialization >>>
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Login >>>
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		//Using Class >>>
		driver.findElement(By.className("inventory_item_name")).click();
		
		//Using Relative Path ID >>>
		//driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']")).click();
		
		//Using CSS path >>>
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).click();
		
		
		
		
		
		
		
	}

}
