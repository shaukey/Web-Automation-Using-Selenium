package automationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo02 {
	public static void main (String[] args) throws InterruptedException {
		
		//Initialization >>>
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		
		//Select Radio Button >>>
		
		//Female
		WebElement radioButton = driver.findElement(By.id("female"));
		radioButton.click();
		
		//Checking if the radioButton is selected or not! 
		assert radioButton.isSelected();
		System.out.println(radioButton.isSelected());
		
		
		//Select Drop-down Menu  >>>
		
		WebElement testDropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropdown);
		
		//dropdown.selectByValue("option 3"); // by value 
		//dropdown.selectByIndex(2);  // by index
		dropdown.selectByVisibleText("Option 2"); // by visible text  
		
			
	}

}
