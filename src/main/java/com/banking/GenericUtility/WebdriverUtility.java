package com.banking.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility 
{
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
		
	}
	public void waitforPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	public void waitUntillElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByVisibleText(String Text, WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}
	public void selectAlloptions(WebElement ele,String value)
	{
		Select sel=new Select(ele);
		sel.deselectByValue(value);
	}
	
	public void Mouseover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	public void draganddropaction(WebDriver driver, WebElement src, WebElement dst)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst);
	}
	public void doubleClickAction(WebDriver driver,WebElement ele)
	{
		Actions act= new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void rightClickAction(WebDriver driver, WebElement ele)
		{
			Actions act= new Actions(driver);
			act.contextClick(ele).perform();
		}
	public void enterKeyPress(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	public void KeyPress(WebDriver driver) throws Throwable
	{
		Robot ro= new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
	}
//	public void KeyPress1(WebElement ele) throws Throwable
//	{
	//	Robot ro= new Robot();
//		ro.keyPress(KeyEvent.VK_ENTER);
//	}
	
	public void KeyRelease(WebDriver driver) throws Throwable
	{
		Robot ro= new Robot();
		ro.keyRelease(KeyEvent.VK_ENTER);
	}
	public void switchToFrameIndex(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver, String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	public void Alertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void Alertcancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public String Alerttext(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		String text1=a.getText();
		return text1;
		
	}
	public void switchToWindow(WebDriver driver, String partialtitle)
	{
	
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();
		while(i.hasNext())
		{
			
			String winId = i.next();
			String currentWinTitle = driver.switchTo().window(winId).getTitle();
			if(currentWinTitle.contains(partialtitle))
			{
				break;
			}
		}
	}
/** 
 * 
 * @this method will take screenshot of particular webelement
 * @author amlan
 * @throws Throwable
 */
	
	public void takeScreenshot(WebDriver driver,String path) throws Throwable {
		
	TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dst = new File(path);
		FileUtils.copyFile(src, dst);
	}
	
	
	public void scrollAction(WebDriver driver, WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		int Y = element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+Y+")", element);
		
	}
	public void scrollAction(WebDriver driver,int Index)
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,"+Index+")","");
	}
	public void RightClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	public void PageScrolling() throws AWTException
	{
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}
	
	 
}
