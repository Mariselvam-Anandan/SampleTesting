package com.org.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "D:\\THI Infotech\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		//Maximize
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//driver.manage().window().fullscreen();
				//title
				String title = driver.getTitle();
				System.out.println("title "+title);
				
				int length = title.length();
				System.out.println("title length "+length);
				
				String currentUrl = driver.getCurrentUrl();
				System.out.println("currentUrl "+currentUrl);
				
				String pageSource = driver.getPageSource();
//				System.out.println("pageSource "+pageSource);
				
				int length2 = pageSource.length();
				System.out.println("pageSource length "+length2);
				
				//Navigate
				Thread.sleep(2000);
				driver.navigate().to("https://www.youtube.com/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				
				Thread.sleep(3000);
				driver.quit();
	}

}
