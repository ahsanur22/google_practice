package AdvanceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceDropDown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select s = new Select(dropdown);
		// Select by Index
		//s.selectByIndex(2);
		
		// Select by value
		//s.selectByValue("2");
		
		// Select by VisibleText
		//s.selectByVisibleText("Option 1");
		
		List<WebElement> allElements = s.getOptions();
		
		for( int i = 0; i < allElements.size(); i++) {
			System.out.println(allElements.get(i).getText());
		}
		
		
				

	}

}
