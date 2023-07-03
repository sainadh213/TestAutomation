package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maximum_Price {
	@Test
	public void maximum_Price() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		Thread.sleep(4000);
		List<WebElement> Allprices = driver.findElements(By.xpath("//p[@class='blackText fontSize18 blackFont white-space-no-wrap']"));
		int max =0;
		for (WebElement prices:Allprices) {		
		String price = prices.getText();
		String p = price.replaceAll("[^0-9]", "");
		int val = Integer.parseInt(p);
		System.out.println(p);
		if(val>max)
		{
			max=val;
		}		
		}
		System.out.println("Maximum price is :"+max);
		Thread.sleep(4000);
		driver.close();
		
	}
}
