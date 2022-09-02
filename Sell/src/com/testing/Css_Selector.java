package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement fn = driver.findElement(By.cssSelector("input#email"));
	fn.sendKeys("elangovan");
	WebElement p = driver.findElement(By.xpath("//input[@type='password']"));
	p.sendKeys("12345679");
	WebElement create = driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
	create.click();
	Thread.sleep(3000);
	WebElement fn1 = driver.findElement(By.cssSelector("input[placeholder='First name']"));
	fn1.sendKeys("elango");
	WebElement ln = driver.findElement(By.cssSelector("input[name='lastname']"));
	ln.sendKeys("ajith");
	WebElement m = driver.findElement(By.cssSelector("input[name^='reg_email__']"));
	m.sendKeys("9003180496");
	
	WebElement n = driver.findElement(By.cssSelector("input[data-type$='ord']"));
	n.sendKeys("new password");
	
	
	
}
}
