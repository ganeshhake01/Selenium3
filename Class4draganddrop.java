package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class4draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		Thread.sleep(5000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		//Thread.sleep(4000);
		WebElement drag1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		//Thread.sleep(4000);
		WebElement drag2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement drag3=driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drag4=driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		WebElement drop=driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a= new Actions(driver);	
		
		a.dragAndDrop(drag1, drop).perform();
		a.dragAndDrop(drag2, drop).perform();
		a.dragAndDrop(drag3, drop).perform();
		a.dragAndDrop(drag4, drop).perform();
		
			}
		}
	


