package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args)  {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("sainadh213");
		driver.findElement(By.id("input-firstname")).sendKeys("Busam");
		driver.findElement(By.id("input-lastname")).sendKeys("Sainadh");
		driver.findElement(By.id("input-email")).sendKeys("sainadh213@gmail.com");
		WebElement dd_add = driver.findElement(By.id("input-country"));
		
		/*dd_add.click();
		dd_add.sendKeys("india");
		dd_add.click();*/
		
		Select sl = new Select(dd_add);
		//sl.selectByVisibleText("India");
		
		//driver.findElement(By.id("input-password")).sendKeys("7660853885");
		String value="india";
		List<WebElement> allopt = sl.getOptions();
		
		for (WebElement opt : allopt) {
			//System.out.println(opt.getText());
			String optval = opt.getText();
			System.out.println(optval);
			if (value.equalsIgnoreCase(optval)) {
				opt.click();
				
				
			}/* else {
				System.out.println("That option is not present in dropdown");

			}*/
		}
		driver.findElement(By.id("input-password")).sendKeys("7660853885");
		System.out.print("Selected option is :");
		System.out.println(sl.getFirstSelectedOption().getText());
	}

}
