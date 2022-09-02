package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		Actions ac = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));

		ac.moveToElement(women).build().perform();
		
		ac.moveToElement(tshirt).click().build().perform();

//		tshirt.click();
		System.out.println("success");

	}
}
