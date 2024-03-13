package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Scrollable extends Baseclass {
	public static void scroller() throws Throwable {
		Thread.sleep(3000);
		WebElement imdb = driver.findElement(By.xpath("//a[text()='IMDb']"));
		imdb.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobiles.sendKeys(Keys.UP);
	}

	
	public static void main(String[] args) throws Throwable {
		browserSetup("chrome");
		launch("https://www.amazon.in/");
		scroller();
		Thread.sleep(5000);
		quit();

	}
}
