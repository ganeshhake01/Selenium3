package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cass2navigate {
	public static void main(String[] args)  throws InterruptedException {
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
	    WebElement kde=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	    kde.click();
	    Thread.sleep(4000);
	    driver.navigate().back();
	    Thread.sleep(4000);
	    driver.navigate().forward();
	    Thread.sleep(4000);
	    driver.navigate().refresh();
	    //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    //Thread.sleep(4000);
	    //driver.navigate().forward();
	    //Thread.sleep(4000);

	}

}