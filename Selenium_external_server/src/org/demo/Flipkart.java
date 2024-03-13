package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Flipkart extends Baseclass {

	public static void product() throws Throwable {
		WebElement close = driver.findElement(By.xpath("//span[text()='✕']"));
		click(close);
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		inputText(search, "Vivo V29");
		WebElement searchandclick = driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
		click(searchandclick);
		WebElement minvalue = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
		selectbyValue(minvalue, "10000");
		WebElement maxvalue = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
		selectbyValue(maxvalue, "20000");
		Thread.sleep(3000);
			
		WebElement mobileblack = driver.findElement(By.xpath("(//div[text()='vivo T2x 5G (Glimmer Black, 128 GB)'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", mobileblack);     
		WebElement mobileblue = driver.findElement(By.xpath("(//div[text()='vivo T2x 5G (Marine Blue, 128 GB)'])[2]"));
		click(mobileblue);
		switchWindow(1);
		//New Tab
		Thread.sleep(2000);
		WebElement warranty = driver.findElement(By.xpath("//div[text()='1 Year of Device & 6 Months for Inbox Accessories']"));
		js.executeScript("arguments[0].scrollIntoView(true);", warranty);
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.id("pincodeInputId"));
		inputText(pin, "600048");
		WebElement check = driver.findElement(By.xpath("//span[text()='Check']"));
		click(check);
		Thread.sleep(2000);
		WebElement details = driver.findElement(By.xpath("//div[text()='View Details']"));
		click(details);
		Thread.sleep(1000);
		WebElement standard = driver.findElement(By.xpath("//div[text()='STANDARD EMI']"));
		click(standard);
		
		WebElement indusbank = driver.findElement(By.xpath("//div[text()='IndusInd Bank']"));
		js.executeScript("arguments[0].scrollIntoView(true);", indusbank);
		click(indusbank);
		Thread.sleep(2000);
		WebElement emi = driver.findElement(By.xpath("//div[text()='6 EMIs @ 14% pa']"));
		click(emi);

		Thread.sleep(2000);
		WebElement close1 = driver.findElement(By.xpath("(//button[text()='✕'])[1]"));
		click(close1);
		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		click(addtocart);
		Thread.sleep(2000);
		WebElement placeorder = driver.findElement(By.xpath("//span[text()='Place Order']"));
		click(placeorder);
		Thread.sleep(4000);
		quit();
	}
	
	public static void main(String[] args) throws Throwable {
		browserSetup("chrome");
		launch("https://www.flipkart.com/");
		maximize();
		product();
		
	}
}
