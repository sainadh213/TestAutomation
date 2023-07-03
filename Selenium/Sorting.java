package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorting {
	@Test
	public void sorted() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement webframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(webframe);
		 WebElement from = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
	    	//Thread.sleep(2000);
	    WebElement to = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[4]"));	
		 Actions act=new Actions(driver);					
			//Dragged and dropped.		
		        act.dragAndDrop(from,to).perform();	
		   


	
	}
}
