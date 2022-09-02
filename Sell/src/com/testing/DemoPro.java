package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPro {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement id = driver.findElement(By.id("email"));
//		id.sendKeys("9003180496");
//		WebElement name = driver.findElement(By.name("pass"));
//		name.sendKeys("jeevarathinam");
//		WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
//		login.click();
//		driver.navigate().refresh();
//		WebElement click = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		click.click();
//		Thread.sleep(3000);
//		WebElement findElement = driver.findElement(By.xpath(" //input[@type='text'][@name='firstname'] "));
//		findElement.sendKeys("elango");
//		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
//		lname.sendKeys("jeeva");
//		WebElement ele = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		ele.sendKeys("2344");
//		WebElement pass = driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]"));
//		pass.sendKeys("00000");
//		Thread.sleep(4000);
//	
//		//single dropdown list....
//
//		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
//		Select D= new Select(day);
//		D.selectByValue("12");
		
//		WebElement month = driver.findElement(By.xpath("//select[@id='day']"));
//		Select m=new Select(month);
//		m.selectByValue("2");
//		m.selectByIndex(4);
		
		  // m.selectByVisibleText("15");

		//checking multiple or not----------------------------------
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
//		WebElement find = driver.findElement(By.xpath("//select[@class='form-control']"));
//		Select s=new Select(find);
//		
//		boolean check= s.isMultiple();
//		System.out.println(check);
//		System.out.println("sucess");
		WebElement multi = driver.findElement(By.xpath("//select[@name='States']"));
		
		Select m=new Select(multi);
		if(m.isMultiple()){
			m.selectByValue("Florida");
			m.selectByIndex(5);
			m.selectByVisibleText("Washington");
			m.selectByValue("New York");
			
//		     get option-------
			System.out.println("---------All Optiions--------------");

			List<WebElement> opt = m.getOptions();
			for(WebElement o   : opt)
			{
				System.out.println(o.getText());
			}
			System.out.print("");
				
				
			//Selected options
				System.out.println("---------Selected Options---------");
				
				List<WebElement> as = m.getAllSelectedOptions();
				for(WebElement select: as)
				{
				System.out.println(select.getText());
				}
				
				//FirstSelected Option
				System.out.println("--------FirstSelected Option--------");
			WebElement selected = m.getFirstSelectedOption();
				System.out.println(selected.getText());
			
				// deselect by value...
				
				System.out.println("------Deselect By Value------");
				
				m.deselectByValue("Washington");
				List<WebElement> allSelectedOptions = m.getAllSelectedOptions();
				for(WebElement a :allSelectedOptions) {
					System.out.println(a.getText());
				}
				//Deselect by Index.....
				
				System.out.println("-----Deselect by Index-----");
				m.deselectByIndex(5);
				List<WebElement> allSelectedOptions2 = m.getAllSelectedOptions();
				for(WebElement i:allSelectedOptions2 ) {
					System.out.println(i.getText());
					
				}
				///deselectByVisibleText------	
				System.out.println("--------deselectByVisibleText-------");
				m.deselectByVisibleText("Florida");
				List<WebElement> allSelectedOptions3 = m.getAllSelectedOptions();
				for (WebElement v:allSelectedOptions3) {
					System.out.println(v.getText());	
				}
				///deselectall---------	
				System.out.println("--------Alldeselect-------");
				m.deselectAll();
				List<WebElement> allSelectedOptions4 = m.getAllSelectedOptions();
				for(WebElement a:allSelectedOptions4) {
					System.out.println(a.getText());
				}
				}
			
		
		
		
	}
	}


