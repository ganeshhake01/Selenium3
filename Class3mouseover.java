package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Class3mouseover {

public static void main(String[] args)  throws InterruptedException {
System.setProperty("Webdriver.crome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://uncodemy.com/");
Thread.sleep(4000);
WebElement categary=driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
Actions a=new Actions(driver);
a.moveToElement(categary).perform();
WebElement st=driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
a.moveToElement(st).perform();
WebElement testing=driver.findElement(By.xpath("//a[@class='has'][normalize-space()='Software Testing']"));
a.moveToElement(testing).perform();
testing.click();
	}
}