package bdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_App {
	ChromeDriver driver;
	@Before

	public void Chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "../Business_Development_Kit_Project/chromedriver.exe");
		driver = new ChromeDriver();
		Options op =driver.manage(); 
		Window win =op.window();
		win.maximize();	
	}
	
	@Test
	public void Launch()
	{
		driver.get(URL.url);	
	}
	@After
	public void Close()
	{
		driver.close();
	}

}
