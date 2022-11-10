package bdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnFinanceReport {
	
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
	public void FinanceReport() throws InterruptedException
	{
		driver.get(URL.url);
		WebElement Create = driver.findElement(By.cssSelector("input[name='Reports']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Create).build().perform();
		Thread.sleep(50000);
		WebElement FinanceReport = driver.findElement(By.id("Finance"));
		FinanceReport.click();		
	}
	@After
	public void Close()
	{
		driver.close();
	}

}
