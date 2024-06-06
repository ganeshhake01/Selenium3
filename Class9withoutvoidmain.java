package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9withoutvoidmain {

	String driverPath = "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	void navigate() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
	}
	void credintial(String a,String b) throws InterruptedException {
		 WebElement txt=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		    txt.sendKeys(a);
		    WebElement dme=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		    dme.sendKeys(b);
		    WebElement kde=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		    kde.click();
		    Thread.sleep(2000);
		    
	}
	void post(String c) throws InterruptedException {
		WebElement pmp=driver.findElement(By.xpath("//span[normalize-space()='Buzz']"));
	    pmp.click();
	    Thread.sleep(2000);
	    WebElement cmd=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	    cmd.sendKeys(c);
	    WebElement kpd=driver.findElement(By.xpath("//button[@type='submit']"));
	    kpd.click();
	    
	}
	
	
}
