package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	static WebDriver driver;
	public static void browser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\THI Infotech\\Webdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		//get
		driver.get(url);
		//maximize
		driver.manage().window().maximize();
	}
	
	public static void roboActionsGoogle() {
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions action = new Actions(driver);
		action.contextClick(gmail).perform();
	}
	
	public static void roboKeyActionsGoogle() throws AWTException {
		Robot robo = new Robot();
		for (int i = 0; i <3; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void roboKeyActionsFb() throws AWTException, Throwable {
		Robot robo = new Robot();
		//username
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_A);
		robo.keyPress(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		//Tab
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		//password
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		//Tab
		Thread.sleep(3000);
		for (int i = 0; i <2 ; i++) {
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
		}

		//login
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	public static void main(String[] args) throws Throwable {
		browser("https://www.facebook.com/");
		//roboActionsGoogle();
		//Thread.sleep(3000);
		//roboKeyActionsGoogle();
		roboKeyActionsFb();
	}
}
