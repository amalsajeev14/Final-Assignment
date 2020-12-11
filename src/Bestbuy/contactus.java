package Bestbuy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class contactus {

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
	driver.get("https://wpforms.com/contact/");
	contact();
} catch (Exception e) {

e.printStackTrace();
}
}

public void contact() {
try {
    driver.get("https://wpforms.com/contact/");
    
    driver.findElement(By.linkText("Complete a Form")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("wpforms-330-field_2")).sendKeys("AMal Sajeev");
    Thread.sleep(2000);
    driver.findElement(By.id("wpforms-330-field_3")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("wpforms-330-field_3")).sendKeys("amalsajeev14@gmail.com");
    driver.findElement(By.id("wpforms-330-field_4")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("wpforms-330-field_4")).sendKeys("http://www.gmail.com");
    driver.findElement(By.id("wpforms-330-field_5")).click();
    Thread.sleep(2000);
    {
      WebElement dropdown = driver.findElement(By.id("wpforms-330-field_5"));
      dropdown.findElement(By.xpath("//option[. = 'Bug Report']")).click();
    }
    driver.findElement(By.id("wpforms-330-field_5")).click();
    driver.findElement(By.id("wpforms-330-field_6")).click();
    Thread.sleep(2000);
    
    driver.close();


} catch (Exception e) {

e.printStackTrace();
}

}
public static void main(String[] args) {

	contactus cu=new contactus();
cu.start();

}
}
