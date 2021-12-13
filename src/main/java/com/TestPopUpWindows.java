package com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPopUpWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/tejas/Documents/Docs/Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		String parentWindowId = itr.next();
		while(itr.hasNext()) {
			String childWindowId = itr.next();
			driver.switchTo().window(childWindowId);
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(parentWindowId);
			
			
			
		}
	}
	
}
