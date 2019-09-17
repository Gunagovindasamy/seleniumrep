package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\programming practice\\Guna\\Selenium\\Driver\\chromedriver.exe ");
	
	
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.facebook.com");
	String title =driver .getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl);
	driver.quit();
	}

}
