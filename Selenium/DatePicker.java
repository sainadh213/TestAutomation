package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DatePicker {
	@Test
	public void datePicker() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		WebElement date = driver.findElement(By.xpath("//a[text()=24]"));
		date.click();
		//System.out.println(date.getText());
		 String value=driver.findElement(By.id("datepicker")).getAttribute("value");
	        System.out.println(value);
	        
	        /*driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	        WebElement fr = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(fr);
	       // Actions ac=new Actions(driver);
	    	Thread.sleep(2000);
	      //  WebElement first = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
	    	//Thread.sleep(2000);
	    	//WebElement last = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[4]"));
	    	WebElement from=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
			
			WebElement To=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
			
			 Actions ac=new Actions(driver);
	        ac.dragAndDrop(from,To).build().perform();
	        //Thread.sleep(5000);
	        //driver.close();*/
	
	
}

}
