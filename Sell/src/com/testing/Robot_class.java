package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_class {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {


	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement element1 = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	
	Actions a1=new Actions(driver);
	
	a1.moveToElement(element1).build().perform();
	a1.contextClick().build().perform();
	Robot r1= new Robot();
//	r1.keyPress(KeyEvent.VK_DOWN);
//	r1.keyRelease(KeyEvent.VK_DOWN);
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
//	TakesScreenshot tc=(TakesScreenshot)driver;
//	File source = tc.getScreenshotAs(OutputType.FILE);
//	File destination =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\go.png");
//	FileUtils.copyFile(source, destination);
	System.out.println("done");
//	Thread.sleep(3000);
//	WebElement element2 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[7]"));
//	a1.moveToElement(element2).build().perform();
//	a1.contextClick().build().perform();
//	
//	r1.keyPress(KeyEvent.VK_DOWN);
//	r1.keyRelease(KeyEvent.VK_DOWN);
//	r1.keyPress(KeyEvent.VK_ENTER);
//	r1.keyRelease(KeyEvent.VK_ENTER);
//	System.out.println("done2");
//	
//	WebElement element3 = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
//	a1.moveToElement(element3).build().perform();
//	a1.contextClick().build().perform();
//	
//	r1.keyPress(KeyEvent.VK_DOWN);
//	r1.keyRelease(KeyEvent.VK_DOWN);
//	r1.keyPress(KeyEvent.VK_ENTER);
//	r1.keyRelease(KeyEvent.VK_ENTER);
//	
//	TakesScreenshot tc=(TakesScreenshot)driver;
//	File shot = tc.getScreenshotAs(OutputType.FILE);
//	File destination =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\name.png");
//	FileUtils.copyFile(shot, destination);
//	
//System.out.println("done3");	
	
	
	
	
	
	
}
}
