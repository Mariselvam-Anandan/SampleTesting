package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	 
	static WebDriver driver;
	
	public static WebDriver browserSetup(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/THI Infotech/Webdriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:/THI Infotech/Webdriver/msedgedriver.exe");
			 driver = new EdgeDriver();
		} else if(name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "D:/THI Infotech/Webdriver/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void launch(String url) {
		driver.get(url);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void mouseover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public static void switchWindow(int num) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(num));
	}
	
	public static void selectbyIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	
	public static void selectbyValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectbyVisibletext(WebElement element, String value ) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}
}
