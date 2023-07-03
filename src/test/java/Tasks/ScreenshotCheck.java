package Tasks;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
@Listeners(com.GenericLibrary.MyListeners.class)
public class ScreenshotCheck extends BaseClass{
	@Test
	public void checkingScreeshot()
	{
		/*ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);*/
		driver.get("https://www.flipkart.com/");
		
		Assert.fail();
		
	}

}
