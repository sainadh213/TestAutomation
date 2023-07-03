package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Company {
	@Test
	public void create_Company() throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ecdc.v35.dev.zeroco.de/");
		Thread.sleep(5000);
		driver.findElement(By.id("appUserName")).sendKeys("admin");
		driver.findElement(By.id("appPassword")).sendKeys("Ecdc#1234");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='icon-certificate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='icomoon-company2']")).click();

		Faker fk = new Faker();
		/*
		 * String company_Name = fk.company().industry(); String phone_Number =
		 * fk.phoneNumber().cellPhone(); String email = fk.internet().emailAddress();
		 */

		/*
		 * Random rm=new Random(); IntStream number = rm.ints(100,9998);
		 */
		
		String names[] = {"","Hindalco", "Cipla", "Bosch", "Nestle", "Samsung", "Tech Mahindra", "LG", "ZenTech",
				"SoftTech", "Max Vision", "Fine Tech", "Smart Tech", "Impulse", "Tata","Grow More","Sun Pharma","Siemens","Sales Force" ,"Ford","HP","Dell","Lenovo","Nokia"};

		for (int i = 1; i <names.length; i++) {
			Thread.sleep(60000);
			String phoneNumber = fk.phoneNumber().cellPhone();
			String name = names[i];
			String email = name + "@gmail.com";
			String email1 = email.replace(" ", "");
			String emailId = email1.toLowerCase();
			driver.findElement(By.id("name")).sendKeys(name);
			driver.findElement(By.id("phone_main")).sendKeys(phoneNumber);
			driver.findElement(By.id("email")).sendKeys(emailId);
			driver.findElement(By.xpath("(//span[@class='ui-dropdown-trigger-icon ui-clickable icon-angle-down'])[2]")).click();
			driver.findElement(By.xpath("(//li[@class='ui-dropdown-item ui-corner-all'])["+ i + "]")).click();
			Thread.sleep(3000);
			// driver.findElement(By.id("submitBtn")).click();
		}

	}
}
