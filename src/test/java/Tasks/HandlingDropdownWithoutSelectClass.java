package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownWithoutSelectClass {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("sainadh213");
		driver.findElement(By.id("input-firstname")).sendKeys("Busam");
		driver.findElement(By.id("input-lastname")).sendKeys("Sainadh");
		driver.findElement(By.id("input-email")).sendKeys("sainadh213@gmail.com");
		WebElement dd_add = driver.findElement(By.id("input-country"));
		
		Select sl = new Select(dd_add);
		List<WebElement> allopt = sl.getOptions();
		String value="Hyderabad";
		boolean result=true;
		
		for (WebElement opt : allopt) 
		{
			String optval = opt.getText();
			result=value.equalsIgnoreCase(optval);
			
			if (result) {
				opt.click();
				System.out.print("Selected option is :");
				System.out.println(sl.getFirstSelectedOption().getText());
				break;
			}
			else {
				result=result;
			}
		}
		if(result!=true)
		{
			System.out.println(value+" is not present in dropdown");
		}
			}
}
