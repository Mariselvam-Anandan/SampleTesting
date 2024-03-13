package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip extends Baseclass {
	
	public static void modal() throws Throwable {
		Thread.sleep(3000);
//		WebElement frame = driver.findElement(By.xpath("//iframe[@title='notification-frame-173061064']"));
//		frameByWebElement(frame);
//		WebElement close = driver.findElement(By.xpath("//a[@class='close']"));
//		click(close);
//		parentFrame();
//		Thread.sleep(2000);
		WebElement modal = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
		click(modal);
	}

	public static void booking() throws Throwable {
		WebElement from = driver.findElement(By.id("fromCity"));
		click(from);
		WebElement flights = driver.findElement(By.xpath("//li[@class='menu_Flights']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", flights); 
		Thread.sleep(3000);
		WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
		click(chennai);
		WebElement to = driver.findElement(By.id("toCity"));
		click(to);
		WebElement dubai = driver.findElement(By.xpath("//p[text()='Dubai, United Arab Emirates']"));
		click(dubai);
		WebElement nextmonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		Thread.sleep(1000);
		click(nextmonth);
		WebElement depaturedate = driver.findElement(By.xpath("//div[@aria-label='Wed Dec 06 2023']"));
		Thread.sleep(1000);
		click(depaturedate);
//		WebElement outclick = driver.findElement(By.xpath("//span[contains(text(),'Select A')]"));
//		click(outclick);
		WebElement returning = driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']"));
		click(returning);
		WebElement returndate = driver.findElement(By.xpath("(//div[@aria-label='Wed Jan 03 2024'])[2]"));
		click(returndate);
		WebElement travellers = driver.findElement(By.xpath("//span[@data-cy='travellerText']"));
		Thread.sleep(3000);
		click(travellers);
		WebElement adults = driver.findElement(By.xpath("//li[@data-cy='adults-3']"));
		click(adults);
		WebElement children = driver.findElement(By.xpath("//li[@data-cy='children-1']"));
		click(children);
		WebElement apply = driver.findElement(By.xpath("//button[text()='APPLY']"));
		click(apply);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		click(search);
	}
	
	public static void selectFlight() throws Throwable {
		Thread.sleep(20000);
		WebElement gotit = driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
		click(gotit);
		WebElement scrollfilter = driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[5]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollfilter);
		Thread.sleep(2000);
//		WebElement dubai  = driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[5]"));
//		click(dubai);
		WebElement filter = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.dragAndDropBy(filter, -130, 0).perform();
		WebElement nonstop = driver.findElement(By.xpath("(//p[contains(text(),'Non Stop')])[1]"));
		click(nonstop);
		
	}
	public static void main(String[] args) throws Throwable {
		 browserSetup("chrome");
		 launch("https://www.makemytrip.com/");
		 maximize();
		 modal();
		 booking();
		 selectFlight();
	}

}
