package org.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;

public class TextBox extends Baseclass {
	
	
static String name = "Harish K";
static String email = "hk11471297@gmail.com";
static String current = "4th Street, Otteri extention, Vandalur";
static String permanent = "2/102, Dindigul";



public static void textBox() throws InterruptedException {
	WebElement findElement = driver.findElement(By.xpath("(//li[@id='item-0'])[1]"));
	click(findElement);
	inputText(driver.findElement(By.xpath("//input[@id='userName']")), name);
	inputText(driver.findElement(By.xpath("//input[@id='userEmail']")), email);
	inputText(driver.findElement(By.xpath("//textarea[@id='currentAddress']")), current);
	inputText(driver.findElement(By.xpath("//textarea[@id='permanentAddress']")), permanent);
	Thread.sleep(22000);
	click(driver.findElement(By.xpath("//button[@id='submit']")));
	WebElement text = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
	String text2 = text.getText();
	
	System.out.println(text2);

}

public static void fullScreenShot(String url) throws IOException {
	
	File from = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	File to = new File(url);
	Files.copy(from, to);
}



	public static void main(String[] args) throws InterruptedException, IOException {
		browserSetup("firefox");
		launch("https://demoqa.com/elements");
		maximize();
		textBox();	
		fullScreenShot("D:\\THI Infotech\\Screenshots\\fullscreen.png");
		quit();
	
		
	}

}
