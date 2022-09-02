package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_practice {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
//		*******FB LOGIN*********
//	WebElement us = driver.findElement(By.name("email"));
//	us.sendKeys("9003180496");
//	WebElement pass = driver.findElement(By.id("pass"));
//	pass.sendKeys("jeevarathinam");
//	Thread.sleep(3000);
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();
//		******FB CREATE A/C*******
	
	WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	create.click();
	Thread.sleep(3000);
	WebElement fn = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	fn.sendKeys("elango");
	Thread.sleep(3000);
	
//	*******dynamic xpath*******
	WebElement ln = driver.findElement(By.xpath("//input[@name='firstname']/following::input[1]"));
//	fn.getText();
//	System.out.println(fn);
	ln.sendKeys("jeeva");
	
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	
	Select s = new Select(day);
	s.selectByValue("5");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select m=new Select(month);
	m.selectByVisibleText("Jul");
	
	WebElement year = driver.findElement(By.xpath("//select[@id='month']/following::select[1]"));
	Select y=new  Select(year);
	y.selectByIndex(6);
	
	WebElement custom = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[3]/child::input"));
//	Select c=new Select(custom);
	custom.click();
	
	
	WebElement pro = driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[3]/following::select"));

	Select p=new Select(pro);
	p.selectByValue("2");
	
	WebElement text = driver.findElement(By.xpath("(//div[contains(text(),'pronoun')])[1]"));
	String text2 = text.getText();
		System.out.println(text2);

//		driver.navigate().to("https://www.ajio.com/");

		driver.get("https://www.ajio.com/");
		driver.navigate().refresh();
//		driver.manage().window().maximize();
//		WebElement aj = driver.findElement(By.className("//div[@class='ic-close-quickview']"));
//		aj.click();
		
		Actions ac=new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[text()='KIDS']"));
		Thread.sleep(3000);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts Under 399']"));
		ac.moveToElement(women).build().perform();
		ac.moveToElement(tshirt).click().build().perform();
		
		
		
		

}
}
