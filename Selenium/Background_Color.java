package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Background_Color {
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://facebook.com");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		String bg_Colour = loginButton.getCssValue("background-color");
		System.out.println(bg_Colour);
		String color = Color.fromString(bg_Colour).asHex();
		
		System.out.println(color);
		
		if(color.equals("#1877f2"))
		{
			System.out.println("Back-Ground colour is same");
		}
		
		else
		{
			System.out.println("Back-Ground colour is not same");
		}
	}

}
