package com.GenericLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtil {
public static Select sl;

	
	public void byIndex(WebElement ddadd,int index)
	{
		 sl=new Select(ddadd);
		sl.selectByIndex(index);
	}
	public void byValue(WebElement ddadd,String value)
	{
		sl=new Select(ddadd);
		sl.selectByValue(value);
	}
	public void byText(WebElement ddadd,String text)
	{
		sl=new Select(ddadd);
		sl.selectByVisibleText(text);
	}
	
    public void printAllOptions(WebElement ddadd)
    {
    	sl=new Select(ddadd);
    	List<WebElement> allopt = sl.getOptions();
    	for (WebElement opt : allopt) 
    	{
    		System.out.println(opt.getText());
			
	    }
    
    }
	public void withoutSelectClass(WebElement ddadd,String value) 
	{
		sl=new Select(ddadd);
    	List<WebElement> allopt = sl.getOptions();
    	for (WebElement opt : allopt) 
    	{
    		if(value.equalsIgnoreCase(opt.getText()))
    		{
    			opt.click();
    		}
			
	    }
	}
	public	static Actions ac;
	public void moveToElement(WebElement element_add)
	{
		ac=new Actions(BaseClass.driver);
		ac.moveToElement(element_add).perform();
	}
	public int randomNumber()
	{
		Random rn=new Random();
	int randomNumber = rn.nextInt();
	return randomNumber;
	}
	public void waitForElement(int time)
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void waitForElement(Duration time,WebElement address)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, time);
				wait.until(ExpectedConditions.elementToBeClickable(address));
	}
	
	
	/*public void waitForElement(int time,WebElement address)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, time);
				wait.until(ExpectedConditions.elementToBeClickable(address));
	}*/
	
	public void enterKey() throws Throwable
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	public void switchToFrame(int index)
	{
		BaseClass.driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		BaseClass.driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		BaseClass.driver.switchTo().frame(element);
	}
	
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseClass.driver);
		ac.moveToElement(element).perform();
	}
	
	
	public void rightClick(WebElement element) {
		Actions ac=new Actions(BaseClass.driver);
		ac.contextClick(element).perform();
	}
	
	
	
	
	public void getFullScreenshot(String path) throws Throwable
	{		
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void executeJavaScript(String script)
	{
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		jse.executeScript(script);
	}
	public void switchWindow(String title) {
		Set<String> winids = BaseClass.driver.getWindowHandles();

		Iterator<String> it = winids.iterator();

		for (String id : winids) 
		{
			BaseClass.driver.switchTo().window(id);
			if(title.equalsIgnoreCase(BaseClass.driver.getTitle())) {
				break;
			}
		}
	
}
}