package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Simpletest {
	
	public static void browserSetup() {
		System.setProperty("webdriver.firefox.driver", "D:\\THI Infotech\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	
	public static void main(String[] args) {
		browserSetup();
	}
}
