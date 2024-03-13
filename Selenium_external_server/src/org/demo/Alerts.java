package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Alerts extends Baseclass {
	
	public static void alertButton() throws Throwable {
//		WebElement clickalert = driver.findElement(By.xpath("(//li[@class='btn btn-light ' and @id='item-1'])[2]"));
//		clickalert.click();
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		click(alertButton);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
	}
	
	public static void confirmButton() throws Exception {
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmButton.sendKeys(Keys.DOWN);
		confirmButton.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		click(confirmButton);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.dismiss();
	}
	
	public static void prompt() throws InterruptedException {
		WebElement prompts = driver.findElement(By.id("promtButton"));
		prompts.sendKeys(Keys.DOWN);
		prompts.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		click(prompts);
		Alert a = driver.switchTo().alert();
		a.sendKeys("Java Selenium");
		Thread.sleep(2000);
		a.accept();
	}

	public static void main(String[] args) throws Throwable {
		browserSetup("chrome");
		launch("https://demoqa.com/alerts");
		maximize();
		Thread.sleep(3000);
		alertButton();
		confirmButton();
		prompt();
		Thread.sleep(3000);
		quit();
	}
	
	
}
