package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
 public static void main(String[] args) {
	 //System.out.println("Bonjour");
	 
	 
	 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 
	 
	 /*
	 System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
	 FirefoxDriver driver1 = new FirefoxDriver();
	 driver1.get("https://opensource-demo.orangehrmlive.com");
	 driver1.manage().window().maximize();
	 driver1.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
	 driver1.findElement(By.id("btnLogin")).click();
	 */
 }
}
