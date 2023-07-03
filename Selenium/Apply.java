package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apply {
@Test
	public  void apply() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.id("usernameField")).sendKeys("sainadhb1996@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("7660853885");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		/*try {
			driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		driver.findElement(By.id("qsb-keyskill-sugg")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//button[text()='SEARCH']")).click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Any']"));
		Thread.sleep(2000);
		//WebElement zero = driver.findElement(By.xpath("//div[@class='inside']"));
		Actions ac=new Actions(driver);
		//ac.dragAndDrop(ele, zero).perform();
		ac.dragAndDropBy(ele, -300, 0).perform();
		Thread.sleep(4000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@class='title fw500 ellipsis']"));

		for (WebElement links : alllinks) {
			System.out.println(links.getText());
			links.click();
			/*String allwin = driver.getWindowHandle();
			driver.switchTo().window(allwin);
			try {
				driver.findElement(By.xpath("//button[text()='Apply']")).click();
				Thread.sleep(3000);
				driver.close();
			} catch (Exception e) {
				driver.close();
			}*/
		Set<String> allwins = driver.getWindowHandles();
		for (String wins : allwins) {
			driver.switchTo().window(wins);
			try {
				driver.findElement(By.xpath("//button[text()='Apply']")).click();
				Thread.sleep(3000);
				driver.close();
				driver.switchTo().window(wins);
				
			} catch (Exception e) {
				driver.close();
				driver.switchTo().window(wins);
			
		}
			
		}
	}
	}
}
