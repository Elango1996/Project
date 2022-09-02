package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Testing {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//simple------
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert.click();

		//---confirm----
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert1.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement confirm1 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirm.click();
		
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.dismiss();
		
		//--prompt---
		
		WebElement tBox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		tBox.click();
		WebElement tBox1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		tBox1.click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("elango");
		a.accept();
	
	}
	
	
	

}
