package com.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_project_Selinium {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot ro = new Robot();
		WebElement women = driver.findElement(By.cssSelector("a[title='Women']"));
		ac.moveToElement(women).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='Women']/following::a[2]"));
		ac.contextClick(tshirt).build().perform();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		ac.moveToElement(dress).build().perform();

		ac.contextClick(casual).build().perform();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
//		-------windowHandle-------
//		String windowHandle = driver.getWindowHandle();
//	String title = driver.getTitle();
//	System.out.println(title);

//	Set<String>window=driver.getWindowHandles();
//	for(String name:window) {
//		String title = driver.switchTo().window(name).getTitle();
//		System.out.println(title);
//		}
//	Iterator<String> iterate=window.iterator();
//	String actualTitle="T-shirts";
//	
//	while(iterate.hasNext()) {
//
//		if
//		(driver.switchTo().window(iterate.next()).getTitle().equals(actualTitle))
//	
//				{
//			break;
//				}	
//	}
//	System.out.println("done");
//	WebElement ts = driver.findElement(By.xpath("//img[@itemprop='image']"));
//	ts.click();
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("window.scrollBy(0,300");
//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement women1 = driver.findElement(By.cssSelector("a[title='Women']"));
		ac.moveToElement(women1).build().perform();
		WebElement tshirt1 = driver.findElement(By.xpath("//a[text()='Women']/following::a[2]"));
		tshirt1.click();
		System.out.println("done");
		WebElement text = driver.findElement(By.xpath("(//form[@method='post'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,0");
//		js.executeScript("window.scrollBy(0,-3000");
		js.executeScript("arguments[0].scrollIntoView();",text);
		
//		WebElement stock = driver.findElement(By.cssSelector("span.available-now"));
//		WebElement card = driver.findElement(By.cssSelector("(//img[@alt='Faded Short Sleeve T-shirts'])[2]"));
//		ac.moveToElement(stock).build().perform();
//		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
//		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
//		cart.click();
		WebElement view = driver.findElement(By.xpath("//img[@itemprop='image']"));
		view.click();
	
		WebElement frame1 = driver.findElement(By.name("Submit"));
		driver.switchTo().frame(frame1);
		frame1.click();
		driver.switchTo().defaultContent();
//		WebElement t = driver.findElement(By.xpath("//strong[contains(text(),'Total shipping')]"));
//		js.executeScript("arguments[0],scollByView();",t);
		
//		 WebElement con = driver.findElement(By.xpath("//div[@class='button-container']//descendant::span[3]"));
//		 
//		 con.click();	
		 
//		WebElement minus = driver.findElement(By.cssSelector("i.icon-minus"));
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
	
	
	
	}
}
