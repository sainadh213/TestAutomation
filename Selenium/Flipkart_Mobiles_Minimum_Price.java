package Selenium;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Mobiles_Minimum_Price {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobiles");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			int price = 0,min=1000000;
			for (WebElement pri : allPrices) {
				String prices = pri.getText();
				String pr = prices.replaceAll("[^0-9]", "");
				 price = Integer.parseInt(pr);
				
				if(price<min)
				{
					min=price;
				}	
			}
			System.out.println("Minium Mobile Price is :"+min);
			for (WebElement pricc : allPrices) {
				String prices = pricc.getText();
				String pr = prices.replaceAll("[^0-9]", "");
				 price = Integer.parseInt(pr);
				if(min==price)
				{
					pricc.click();
					break;

				}
			}
			Set<String> allwins = driver.getWindowHandles();
				Iterator<String> it = allwins.iterator();
				String parent = it.next();
				String child = it.next();
				Thread.sleep(2000);
				driver.switchTo().window(child);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='button']")).click();
				
				
				Thread.sleep(5000);
				driver.quit();
			}
			

		}


