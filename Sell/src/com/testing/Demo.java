package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//	String title = driver.getTitle();
		//	System.out.println(title);
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println(currentUrl);
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
//		WebElement findElement = driver.findElement(By.id("email"));
//		findElement.sendKeys("9003180496");
//		WebElement findElement2 = driver.findElement(By.name("pass"));
//		findElement2.sendKeys("jeevarathinam");
//		WebElement butclick = driver.findElement(By.name("login"));
//		butclick.click();
//		//driver.findElement(By.xpath("//a[@role='button'])[2]"));
		//findElement.click();
//		Thread.sleep(8000);
		//driver.close();
//		WebElement path = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		path.sendKeys("9003180496");
//		path.click();
//		WebElement findElement = driver.findElement(By.xpath("//input[@type='password']"));
//		findElement.sendKeys("jeevarathinam");
//		WebElement signup = driver.findElement(By.xpath("//div[contains(text(),'quick and easy')]"));
//		String text = signup.getText();
//		System.out.println(text);	
//		WebElement butn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		butn.click();
//		WebElement fname = driver.findElement(By.xpath("//input[@type='text']"));
//		fname.sendKeys("elango");
//		WebElement nname = driver.findElement(By.xpath("//input[name='lastname']"));
//		nname.sendKeys("jeeva");
//		WebElement ph = driver.findElement(By.xpath("//input[type='text']"));
//		ph.sendKeys("9003180496");
//		WebElement newp = driver.findElement(By.xpath("//input[type='password']"));
//		newp.sendKeys("jeeva");
		WebElement butn = driver.findElement(By.id("text"));
		butn.sendKeys("bike");
	}
}
