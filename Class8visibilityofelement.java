package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8visibilityofelement {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 Thread.sleep(4000);
 WebElement txt=driver.findElement(By.xpath("//input[@name=\"username\"]"));
 txt.sendKeys("Admin");
 WebElement dme=driver.findElement(By.xpath("//input[@type=\"password\"]"));
 dme.sendKeys("admin123");
 WebElement kde=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
 kde.click();
 Thread.sleep(5000);
 WebElement myinfo=driver.findElement(By.xpath("//span[normalize-space()='My Info']"));
myinfo.click();
		Thread.sleep(4000);
		WebElement Gender=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		if(Gender.isEnabled()&& Gender.isDisplayed());
		{
		Gender.click();
		}
		WebElement Save=driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']"));
		Save.click();
		
	}

}
