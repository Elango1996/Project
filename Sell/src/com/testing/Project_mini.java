package com.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project_mini {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	Actions ac=new Actions(driver);
	Thread.sleep(3000);
	
	WebElement women = driver.findElement(By.className("sf-with-ul"));
	ac.moveToElement(women).build().perform();
	driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]")).click();
//	driver.findElement(By.xpath("//span[text()='Quick view']")).click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,500)");
	Thread.sleep(3000);
	
	WebElement n = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	
//	driver.findElement(By.className("quick-view-mobile")).click();
//	js.executeScript("arguments[0].scrollIntoView();",n);
	n.click();
//		driver.findElement(By.xpath("(//a[@class='quick-view']/span)[1]")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement add = driver.findElement(By.xpath("//p[@class='buttons_bottom_block no-print'][1]"));
	add.click();
	driver.findElement(By.cssSelector("button.exclusive")).click();
	driver.switchTo().defaultContent();
//	WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span"));
//	ac.moveToElement(check).build().perform();
	//	check.click();
	Thread.sleep(3000);
//	WebElement d = driver.findElement(By.xpath("//span[contains(text(),'Proceed ')]"));
//	d.click();
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span")).click();
	
	driver.findElement(By.xpath("(//span[contains(text(),'Proceed ')])[2]")).click();
	driver.findElement(By.cssSelector("input#email")).sendKeys("elangovanjeeva10@gmail.com");
	driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]")).sendKeys("pass@123");
	driver.findElement(By.xpath("(//button[@type='submit']/span)[3]")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'Proceed ')])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#cgv")).click();
	driver.findElement(By.xpath("(//butto	n[@type='submit'])[2]/span")).click();
	driver.findElement(By.cssSelector("a.bankwire")).click();
	
	driver.findElement(By.cssSelector("button.button.btn.btn-default.button-medium")).click();
	
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\commons-io-2.8.0\\ng.png");
	FileUtils.copyFile(src, des);
	
	System.out.println("done");


























}
}
