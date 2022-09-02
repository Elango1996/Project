package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waiting {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	System.out.println("------all-----");
	
	List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
	for (WebElement allElement : findElements) {
		System.out.println(allElement.getText());
	}
//	System.out.println("done");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.out.println("------ROW-----");
	List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	
	for (WebElement allElement : row) {
		System.out.println(allElement.getText());
	}
	
	System.out.println("------column-----");
	List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
	
	for (WebElement allElement : column) {
		System.out.println(allElement.getText());
	}
	
	System.out.println("------particular-----");
	 WebElement selective = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
	String text = selective.getText();
	System.out.println(text);
	
	
	
	
	
}
}
