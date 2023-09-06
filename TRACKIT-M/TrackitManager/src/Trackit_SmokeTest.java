import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trackit_SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Selenium Setup - 3.141\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
         //Thread.sleep(10000);
           
           driver.manage().window().maximize();
           driver.get("https://www.trackitmanager.com/staging");
           
           driver.findElement(By.id("ctl00_login_layout_LoginControl_UserName")).sendKeys("3");
           driver.findElement(By.id("ctl00_login_layout_LoginControl_Password")).sendKeys("xZf6SNkTIS");
           Thread.sleep(10000);
           System.out.println("I am here");
           driver.findElement(By.name("ctl00$login_layout$LoginControl$LoginButton")).click();
           String handle=driver.getWindowHandle();
           
           
           
           
		
		
		
	}

}
