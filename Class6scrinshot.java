package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class6scrinshot {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
	    System.out.println(driver.getTitle());
	    driver.getCurrentUrl();
	    driver.manage().window().maximize();
	    WebElement txt=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	    txt.sendKeys("Admin");
	    WebElement dme=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	    dme.sendKeys("admin123");
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File Des = new File("C:\\Ganesh Hake\\Screenshot/sceenshot1.png");
	    FileUtils.copyFile(src, Des);
	    WebElement kde=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    kde.click();
	    Thread.sleep(4000);
	    WebElement pmp=driver.findElement(By.xpath("//span[normalize-space()='Buzz']"));
	    pmp.click();
	    Thread.sleep(4000);
	    WebElement cmd=driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	    cmd.sendKeys("Ganesh is my new firend");
	    
	    TakesScreenshot bs = (TakesScreenshot)driver;
	    File trs = bs.getScreenshotAs(OutputType.FILE);
	    File brs = new File("C:\\Ganesh Hake\\Screenshot\\sceenshot2.png");
	    FileUtils.copyFile(trs, brs);
	    
	    WebElement kpd=driver.findElement(By.xpath("//button[@type='submit']"));
	    kpd.click();
	  //driver.switchTo().alert();
	  //driver.quit();
	}

}

	


