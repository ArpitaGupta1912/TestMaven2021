//Author Arpita
package project2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2021 {

	public static void main(String[] args) throws InterruptedException  {
       
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpita\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://classic.freecrm.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    driver.manage().deleteAllCookies();
    driver.findElement(By.name("username")).sendKeys("ArpitaGupta");
    driver.findElement(By.name("password")).sendKeys("Welcome$25");
    driver.findElement(By.xpath("//input[@type = 'submit']")).click();
   driver.switchTo().frame("mainpanel");
   WebElement contacts = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
  Thread.sleep(3000);
   Actions action = new Actions(driver);
   action.moveToElement(contacts).build().perform();
  driver.quit();
	
	}

/*public static void main(String[] args){
try{	
System.out.println("From Try");
System.exit(0);
}catch(Exception e){
	System.out.println("From Catch");
	}finally{	
		System.out.println("From Finaly");
	}
		}	*/
		}
	
	
	
	

