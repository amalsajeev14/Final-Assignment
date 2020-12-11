package Bestbuy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class GiantSignup {

WebDriver driver;
JavascriptExecutor jse;

public void start() {
try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amal Sajeev\\Downloads\\mtt\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.giant-bicycles.com/ca/account/create");
	signup();
} catch (Exception e) {

e.printStackTrace();
}
}

public void signup() {
try {
	 driver.get("https://www.giant-bicycles.com/ca/account/create");
	    driver.findElement(By.cssSelector(".btn-default")).click();
	    driver.findElement(By.id("Gender")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("Gender"));
	      dropdown.findElement(By.xpath("//option[. = 'Mr.']")).click();
	    }
	    driver.findElement(By.cssSelector("#Gender > option:nth-child(2)")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_OrderFirstname")).sendKeys("Amal");
	    driver.findElement(By.id("Order_OrderLastname")).sendKeys("Sajeev");
	    driver.findElement(By.id("Order_OrderStreet")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_OrderStreet")).sendKeys("45254");
	    driver.findElement(By.id("Order_OrderAddress2")).sendKeys("21");
	    driver.findElement(By.id("Order_OrderPostalcode")).sendKeys("jvhsdjhs");
	    driver.findElement(By.id("Order_OrderCity")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_OrderCity")).sendKeys("montreal");
	    {
	      WebElement element = driver.findElement(By.id("Order_OrderState"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("Order_OrderState"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("Order_OrderState"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.id("Order_OrderState")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("Order_OrderState"));
	      dropdown.findElement(By.xpath("//option[. = 'Quebec']")).click();
	    }
	    driver.findElement(By.cssSelector("option:nth-child(12)")).click();
	    driver.findElement(By.id("Order_OrderPhone")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_OrderPhone")).sendKeys("1234456789");
	    driver.findElement(By.id("Email")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Email")).sendKeys("amal@gmail.com");
	    driver.findElement(By.cssSelector(".input-label")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".year:nth-child(7)")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".month:nth-child(6)")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("tr:nth-child(4) > .day:nth-child(4)")).click();
	    driver.findElement(By.id("Order_Password")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_Password")).sendKeys("password");
	    driver.findElement(By.id("Order_PasswordConfirmed")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Order_PasswordConfirmed")).sendKeys("password");
	    driver.findElement(By.cssSelector(".checkbox > label")).click();
	    Thread.sleep(2000);
	    driver.close();

} catch (Exception e) {

e.printStackTrace();
}

}
public static void main(String[] args) {

	GiantSignup gt=new GiantSignup();
gt.start();

}
}