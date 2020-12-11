package Bestbuy;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class bestbuysearch {

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
	search();
} catch (Exception e) {

e.printStackTrace();
}
}

public void search() {
try {
    driver.get("https://www.bestbuy.ca/en-ca");

    driver.findElement(By.name("search")).sendKeys("airpod");
    driver.findElement(By.cssSelector(".searchIcon_2vafY")).click();
    Thread.sleep(2000);

    driver.close();


} catch (Exception e) {

e.printStackTrace();
}

}
public static void main(String[] args) {

	bestbuysearch bs=new bestbuysearch();
bs.start();

}
}
