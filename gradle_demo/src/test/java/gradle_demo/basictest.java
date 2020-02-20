package gradle_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basictest 
{
	@Test
	public void sample()
	{
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1212/Downloads/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.irctc.co.in/nget/train-search");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("CONTACT US")).click();
	}
}
