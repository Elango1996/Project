package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Booking {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		WebElement ircts= driver.findElement(By.xpath("//button[text()='OK']"));
		ircts.click();
//		Thread.sleep(3000);
		WebElement f = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		f.sendKeys(args)
		
		
	}
}
