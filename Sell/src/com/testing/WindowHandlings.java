package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlings {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	driver.get("https://www.amazon.in/");
//	driver.manage().window().maximize();
	Actions ac=new Actions(driver);
	Robot rb=new Robot();
//	js.executeScript("window.scrollBy(0,5000)");
//	js.executeScript("scroll(0,4000)");
//	Thread.sleep(3000);
//	js.executeScript("window.scrollBy(0,-4000)");
//	WebElement findElement = driver.findElement(By.xpath("//a[text()='Instagram']"));
//	driver.findElement(By.xpath("))
	Thread.sleep(3000);
//	js.executeScript("arguments[0].scrollIntoView();",findElement);
//	js.executeScript("arguments[0].ScrollIntoView();",findElement);
//	js.executeScript("arguments[0].scrollIntoView();",findElement);
//	js.executeScript("window.scrollBy(0,-5000)");
//	js.executeScript("arguments[0].scrollIntoView();", )
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_END);
	rb.keyRelease(KeyEvent.VK_END);
	rb.keyPress(KeyEvent.VK_CONTROL);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_HOME);
	Thread.sleep(3000);
	rb.keyRelease(KeyEvent.VK_END);
	rb.keyPress(KeyEvent.VK_HOME);
	System.out.println("done");
}
}
