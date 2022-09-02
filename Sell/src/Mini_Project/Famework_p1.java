package Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Famework_p1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("elangojeeva");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("elango333");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.xpath("//select[@class='search_combobox']"));
		Select sc = new Select(location);
		sc.selectByIndex(6);
		Thread.sleep(3000);
		WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select sc1 = new Select(hotel);
		sc1.selectByIndex(4);
		WebElement rooms = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select sc2 = new Select(rooms);
		sc2.selectByIndex(4);
		WebElement no = driver.findElement(By.cssSelector("select#room_nos"));
		Select sc3 = new Select(no);
		sc3.selectByIndex(4);
		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		date.clear();
		date.sendKeys("03/11/2021");
		WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		date1.clear();
		date1.sendKeys("08/11/2021");
		WebElement aroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select sc4 = new Select(aroom);
		sc4.selectByIndex(3);
		WebElement croom = driver.findElement(By.cssSelector("select#child_room"));
		Select sc5 = new Select(croom);
		sc5.selectByIndex(4);
		WebElement search = driver.findElement(By.cssSelector("input#Submit"));
		search.click();
		WebElement check = driver.findElement(By.xpath("//input[@type='radio']"));
		check.click();
		WebElement conti = driver.findElement(By.cssSelector("input[name='continue']"));
		conti.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("elango");
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("jeeva");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("no:98 xxxx,yyyyy,zzzz tx-98");
		WebElement card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		card.sendKeys("1234567809875432");
		WebElement ctype = driver.findElement(By.cssSelector("select#cc_type"));
		Select sc6 = new Select(ctype);
		sc6.selectByValue("VISA");
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//td[contains(text(),'Expiry Date')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",findElement);
//		js.executeScript("window.scrollTo(0,500)");
		
		Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement mon = driver.findElement(By.cssSelector("select#cc_exp_month"));
		Select sc7 = new Select(mon);
		sc7.selectByValue("7");
		WebElement year = driver.findElement(By.xpath("(//td[@align='right'])[16]/following::select[2]"));
		Select sc8=new Select(year);
		sc8.selectByVisibleText("2022");
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		text.sendKeys("234");
		Thread.sleep(3000);
//		WebElement book = driver.findElement(By.cssSelector("input#book_now"));
		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		book.click();
		Thread.sleep(3000);	
		js.executeScript("window.scrollTo(0,500)");
		WebElement itinerary = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		itinerary.click();
		Thread.sleep(3000);
//		WebElement logout = driver.findElement(By.cssSelector("input#logout"));
//		WebElement logout = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
//		driver.findElement(By.xpath("//input[@name='logout']")).click();
		WebElement l = driver.findElement(By.xpath("//input[@onclick='window.location=\"Logout.php\"']"));
		l.click();
//		logout.click();
		System.out.println("done");
		driver.close();
		
	}
}
