
import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.*; 
public class yahoologin2 {

public static void main(String[] args) 
{
 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("satishnarayana07@yahoo.com");
		driver.findElement(By.id("login-passwd")).sendKeys("sathyam07");
		driver.findElement(By.id("login-signin")).click();
		driver.manage().window().maximize();
		driver.quit();
 }

}
