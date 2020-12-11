package Bestbuy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class WalmartSignup {

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
	driver.get("https://www.walmart.ca/create-account");
	walmart();
} catch (Exception e) {

e.printStackTrace();
}
}

public void walmart() {
try{
    driver.get("https://www.walmart.ca/create-account");

    driver.findElement(By.id("firstName")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).sendKeys("AMAL");
    driver.findElement(By.id("lastName")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("lastName")).sendKeys("Sajeev");
    driver.findElement(By.id("phoneNumber")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("phoneNumber")).sendKeys("987548248652");
    {
      WebElement element = driver.findElement(By.id("email"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".css-uqeef0 > .css-0"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".css-uqeef0:nth-child(5)")).click();
    driver.findElement(By.id("email")).sendKeys("amalsajeev14@gmi.com");
    driver.findElement(By.id("password")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("password")).sendKeys("1234656");
    driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(8) .css-12k6l22")).click();
    driver.findElement(By.cssSelector(".css-1icu9ov:nth-child(9) .css-12k6l22")).click();
    Thread.sleep(2000);
    driver.close();
} catch (Exception e) {

e.printStackTrace();
}

}
public static void main(String[] args) {

	WalmartSignup ws=new WalmartSignup();
ws.start();

}
}