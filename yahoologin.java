
import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.*; 
public class yahoologin {

public static void main(String[] args) 
{
 FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("saikrishna");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		driver.findElement(By.id("login-signin")).click();
 }

}
