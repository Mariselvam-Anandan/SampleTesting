package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowHandling extends Baseclass {
	
	public static void singleWindow() throws Throwable {
		String currentUrl = driver.getCurrentUrl();
		WebElement home = driver.findElement(By.id("home"));
		Thread.sleep(2000);
		click(home);
		Thread.sleep(2000);
		switchWindow(1);
		System.out.println(driver.getCurrentUrl());
		
	}

	public static void main(String[] args) throws Throwable {
		browserSetup("chrome");
		launch("https://letcode.in/windows");
		maximize();
		singleWindow();
	}

}
