package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo01 {
	
	public static void main (String[] args ) throws InterruptedException {
		
		//Initialization >>>
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Login >>>
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		//Verify title >>>
		
		//Method 01 ::
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title Match");
		} else {
			System.out.println("Title Didn't Match");
		}

		
		//Method 02 ::
		//Assert.assertEquals(actualTitle, expectedTitle, "Didn't Match");
		
	}

}
