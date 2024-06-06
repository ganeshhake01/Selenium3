package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7windowshandling { public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
	    System.out.println(driver.getTitle());
	    driver.getCurrentUrl();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
	    
	    String pw= driver.getWindowHandle();
	   Set<String> all = driver.getWindowHandles();
	   for(String a: all) {
		   if(!(pw.equals(a))) {
	 driver.switchTo().window(a);
		   }
	   }
	  Thread.sleep(5000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ganesh");
	   
	    }
	}


