package DEMO;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
     public class demoTestng {
    	 
	public WebDriver driver= new FirefoxDriver();
	String url= "https://facebook.com";

	 
	@Test(priority=0)
	public void openfb()
	{
	   driver.get(url);
	   driver.manage().window().maximize();
	   }
	@Test(priority=1)
	public void loginfb()
	{
		driver.findElement(By.id("email")).sendKeys("satish.narayana07");
		driver.findElement(By.id("pass")).sendKeys("05061989");
		driver.findElement(By.id("u_0_v")).click();
	}
     }
