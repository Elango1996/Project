package com.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Sign up']"));
		click.click();
		WebElement ph = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		ph.sendKeys("9003180496");
		WebElement name = driver.findElement(By.xpath("//input[contains(@id,'name')]"));
		name.sendKeys("elangovan");
		WebElement mail = driver.findElement(By.xpath("//input[@tabindex='3']"));
		mail.sendKeys("elangovanjeeva@gmail.com");
		
		Thread.sleep(3000);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\relg.png");
		FileUtils.copyFile(source,destination);
		Thread.sleep(5000);
	
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement amazon = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
	
		amazon.click();
		
		WebElement o = driver.findElement(By.xpath("//select[@title='Search in']"));
		Select s =new Select(o);
		
		s.selectByValue("search-alias=digital-music");
		WebElement cl = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		cl.click();
		
		TakesScreenshot ts1= (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\ela.png");
		FileUtils.copyFile(source1,destination1);
		
		driver.get("https://www.ebay.com/");
		WebElement ebay = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
		ebay.sendKeys("shoes");
		WebElement c = driver.findElement(By.xpath("//input[@value='Search']"));
		c.click();
		TakesScreenshot ts2= (TakesScreenshot)driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destinatin2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\ila.png");
		FileUtils.copyFile(source2,destinatin2);
	
	}

}
