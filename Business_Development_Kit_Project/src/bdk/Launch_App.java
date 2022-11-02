package bdk;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_App {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Business_Development_Kit/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		
	}

}
