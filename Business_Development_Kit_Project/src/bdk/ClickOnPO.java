package bdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickOnPO {

	ChromeDriver driver;
	@Before

	public void Chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "../Business_Development_Kit_Project/chromedriver.exe");
		System.out.println("-----Before-------");
		driver = new ChromeDriver();
		Options op =driver.manage(); 
		Window win =op.window();
		win.maximize();
		
	}
	
	@Test
	public void ClickPO () throws InterruptedException
	{
		driver.get(URL.url);
		WebElement Create = driver.findElement(By.cssSelector("input[name='PO']"));
		Create.click();
		Thread.sleep(50000);
	}
	
	@After
	public void Close()
	{
		driver.close();
	}

}
