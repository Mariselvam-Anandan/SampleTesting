package org.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver;
	public static WebDriver browserSetup(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\THI Infotech\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\THI Infotech\\Webdriver\\msedgedriver.exe");
			 driver = new EdgeDriver();
		} else if(name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "D:\\THI Infotech\\Webdriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
}
