package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericLibrary.DropdownMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_WithFW {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("sainadh213");
		driver.findElement(By.id("input-firstname")).sendKeys("Busam");
		driver.findElement(By.id("input-lastname")).sendKeys("Sainadh");
		driver.findElement(By.id("input-email")).sendKeys("sainadh213@gmail.com");
		WebElement dd_add = driver.findElement(By.id("input-country"));
	
		DropdownMethods dd=new DropdownMethods();
		
		dd.byIndex(dd_add, 1);
		Thread.sleep(2000);
		
		dd.byValue(dd_add, "30");
		Thread.sleep(2000);
		
		dd.byText(dd_add, "India");
		
		dd.printAllOptions(dd_add);
		
		dd.withoutSelectClass(dd_add, "Zimbabwe");

	}

}
