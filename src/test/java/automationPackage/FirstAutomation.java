package automationPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomation {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
	}
	
	
	
	@Test (priority=1)
	public void testTitle() {
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle, "Didn't match");
		
	}
	
	@Test (priority=2)
	public void login() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // by id
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000); //1000ms = 1sec 
	}
	
	@Test (priority=3)
	public void select() throws InterruptedException {
		driver.findElement(By.className("inventory_item_name")).click();  // by class 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();  // by XPath 
	}
	
	@Test (priority=4)
	public void checkout() throws InterruptedException {
		driver.findElement(By.className("shopping_cart_link")).click();                      // by class
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();                   // by XPath 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("john");        // by XPath
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("wick");        // by XPath 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1200");     // by XPath 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();                // by XPath 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();                //  by XPath 
		Thread.sleep(1000);
		driver.close();                                                               // close the tab			
	}
	
		
	
}
