package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop extends Baseclass {
	
	public static void frames() {
		WebElement droppable = driver.findElement(By.linkText("Droppable"));
		click(droppable);
		//Frame size
		int size = driver.findElements(By.xpath("//iframe[@class='demo-frame']")).size();
		System.out.println(size);
		//Frame Switch
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		//Drag and drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).release().build().perform();
		
	}
	public static void main(String[] args) {
		browserSetup("chrome");
		launch("https://jqueryui.com/");
		maximize();
		frames();
	}
}
