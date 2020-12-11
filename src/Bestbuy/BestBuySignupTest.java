package Bestbuy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class BestBuySignupTest {

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
	driver.get("https://www.bestbuy.ca/en-ca");
	signup();
} catch (Exception e) {

e.printStackTrace();
}
}

public void signup() {
try {
	driver.get("https://www.bestbuy.ca/en-ca");
    {
      WebElement element = driver.findElement(By.linkText("Order Status"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".accountLabel_20Gjt")).click();
    driver.findElement(By.cssSelector(".create-account-link > span")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys("Amal");
    Thread.sleep(1000);
    driver.findElement(By.id("lastName")).sendKeys("Sajeev");
    driver.findElement(By.id("email")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("email")).sendKeys("amalsajeev14@gmail.com");
    driver.findElement(By.id("password")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("password")).sendKeys("redirectme@123");
    driver.findElement(By.cssSelector(".\\_2suuK > label")).click();
    Thread.sleep(2000);
    
	driver.close();


} catch (Exception e) {

e.printStackTrace();
}

}
public static void main(String[] args) {

BestBuySignupTest bt=new BestBuySignupTest();
bt.start();

}
}