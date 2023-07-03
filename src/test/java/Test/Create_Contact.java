package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Contact {
@Test
public void create_Contact() throws Throwable
{
	WebDriverManager.firefoxdriver().setup();
	 WebDriver driver= new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://qlanabase.v35.dev.zeroco.de/");
	 Thread.sleep(3000);
	 driver.findElement(By.id("appUserName")).sendKeys("admin");
	 driver.findElement(By.id("appPassword")).sendKeys("Qlana@2023");
	 driver.findElement(By.xpath("//span[text()='Login']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[@class='icon-certificate']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//i[@class='icon-book\']")).click();
	}
}
