package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram_Testing {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe" );
	WebDriver driver=  new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");		
	
	
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	element.click();
	Thread.sleep(3000);
	WebElement outer = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
//	driver.switchTo().frame(outer);
//	WebElement key = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//	key.sendKeys("elango1 ");
//	driver.switchTo().defaultContent();s
	WebElement f2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	f2.click();
	WebElement outer1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	driver.switchTo().frame(outer1);
	//driver.switchTo().frame("outer");
	WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(inner);
	WebElement key1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	key1.sendKeys("elango2 ");
	System.out.println("done");
	
	
	//WebElement findElement = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		
		
		
	}
	
}
