package AdvanceSelenium;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

	

	public class practiceDragAndDrop {
		static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement ColA = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement ColB = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(ColA, ColB).build().perform();
		

	}

}
