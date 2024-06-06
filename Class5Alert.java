package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5Alert {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(4000);
		WebElement ok=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		ok.click();
		
    Alert a=driver.switchTo().alert();
    Thread.sleep(4000);
    a.accept();	
    
    WebElement alert=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
    alert.click();
    WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    button.click();
    a.accept();
    WebElement text=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
    text.click();
    Thread.sleep(2000);
    WebElement textbutton=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
    textbutton.click();
    Thread.sleep(2000);
    a.sendKeys("Ganesh");
    a.accept();
   // a.dismiss();
	}

}
