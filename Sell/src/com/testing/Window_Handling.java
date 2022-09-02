package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	WebElement electronic = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(electronic).build().perform();
	ac.contextClick().build().perform();
	
	Robot r1=new Robot();
	
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("done");
	
	
	WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
	
	ac.moveToElement(fashion).build().perform();
	ac.contextClick().build().perform();
	
	
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("done");
	
	
  WebElement electronic1 = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
	
	ac.moveToElement(electronic1).build().perform();
	ac.contextClick().build().perform();
	
	
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	System.out.println("done");
	
	
	Set<String> all = driver.getWindowHandles();
//	
//	
//	for (String name : all) {
//		
//		String title = driver.switchTo().window(name).getTitle();
//		System.out.println(title);
//		
//	}
	
	Iterator<String> iterator = all.iterator();
	
	String actualTitle="Amazon Pay";
	
	
	
	
	while(iterator.hasNext()) {
		
		if
		(driver.switchTo().window(iterator.next()).getTitle().equals(actualTitle))
		{
		
			break;
		}
	}
	System.out.println("done");
		}

}


