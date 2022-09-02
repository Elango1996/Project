package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Online_Website {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chromedriver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions (driver);
		
       	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		

		
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		

	}

}
