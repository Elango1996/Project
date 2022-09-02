package Mini_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("http://automationpractice.com/index.php");
	driver.get("http://automationpractice.com/index.php");
	WebElement findElement = driver.findElement(By.xpath("//a[@title='Women']"));
	Actions ac= new Actions(driver);
	ac.moveToElement(findElement).build().perform();
	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
	tshirt.click();
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
//	WebElement view = driver.findElement(By.xpath("//span[text()='Quick view']"));
//	WebElement view = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	//img[@title='Faded Short Sleeve T-shirts']
	driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")).click();
//	view.click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
	WebElement size = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));
	Select s=new Select(size);
	s.selectByValue("3");
	WebElement color = driver.findElement(By.cssSelector("a[name=Blue]"));
	color.click();
	WebElement add = driver.findElement(By.cssSelector("button[name='Submit']"));
	add.click();
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span"));
	proceed.click();	
	js.executeScript("window.scrollTo(0,600)");
	WebElement proceed1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout']/span)[2]"));
	proceed1.click();
	js.executeScript("window.scrollTo(0,600)");
	WebElement user = driver.findElement(By.cssSelector("input#email"));
	user.sendKeys("elangovanjeeva10@gmail.com");
	WebElement pass = driver.findElement(By.cssSelector("input[type^='pass']"));
	pass.sendKeys("pass@123");
	driver.findElement(By.cssSelector("button#SubmitLogin")).click();
	WebElement proceed2 = driver.findElement(By.cssSelector("button[name='processAddress']"));
	proceed2.click();
	WebElement check = driver.findElement(By.cssSelector("input#cgv"));
	check.click();
	WebElement proceed3 = driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/button"));
	proceed3.click();
	js.executeScript("window.scrollTo(0,600)");
	WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
	pay.click();
	WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	confirm.click();
	js.executeScript("window.scrollTo(0,500)");
	TakesScreenshot tc= (TakesScreenshot)driver;
	File source= tc.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sell\\Screenshots\\new.png");
	FileUtils.copyFile(source, destination);
	System.out.println("Mini Project Done");
	
	
	
}
}
