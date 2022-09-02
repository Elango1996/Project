package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynami_Xpath {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Actions ac=new Actions(driver);
		Robot ra=new Robot();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		WebElement alert = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		alert.click();
//		WebElement findElement = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]/following::div[12]"));
		
//		WebElement gro = driver.findElement(By.xpath("//div[contains(text(),'Gro')]"));
//		ac.moveToElement(findElement).click().build().perform();
//		gro.click();
		
//		---------css using id-----------
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.cssSelector("input#email"));
		un.sendKeys("9003180496");
		WebElement pass = driver.findElement(By.cssSelector("div#passContainer"));
		pass.sendKeys("123456789");
//		ra.keyPress(KeyEvent.VK_DOWN);
//		ra.keyRelease(KeyEvent.VK_DOWN);
//		ra.keyPress(KeyEvent.VK_ENTER);
//		ra.keyRelease(KeyEvent.VK_ENTER);
//		
//		System.out.println(findElement.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
