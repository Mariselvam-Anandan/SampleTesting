package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators extends Baseclass {     
	
	 WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	 WebElement accessories = driver.findElement(By.xpath("//a[@aria-label='Mobiles & Accessories, You are currently on a drop-down. To open this drop-down, Press Enter.']"));
	 WebElement cases = driver.findElement(By.xpath("//a[text()='Cases & Covers']"));
	 WebElement basiccase = driver.findElement(By.xpath("//span[text()='Basic Cases']"));
	 WebElement selectedcase = driver.findElement(By.xpath("(//span[contains(text(),'Amozo Ultra Hybrid Camera and Drop Protection Back Cover Case for iPhone 13')])[3]"));
	 WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	 WebElement checkout = driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"));
	 
	 //FlipKart
	 WebElement close = driver.findElement(By.xpath("//span[text()='✕']"));
	 WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
	 WebElement searchandclick = driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
	 WebElement minvalue = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
	 WebElement maxvalue = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[2]"));
	 WebElement mobileblack = driver.findElement(By.xpath("(//div[text()='vivo T2x 5G (Glimmer Black, 128 GB)'])[1]"));
	 WebElement mobileblue = driver.findElement(By.xpath("(//div[text()='vivo T2x 5G (Marine Blue, 128 GB)'])[2]"));
	 WebElement warranty = driver.findElement(By.xpath("//div[text()='1 Year of Device & 6 Months for Inbox Accessories']"));
	 WebElement pin = driver.findElement(By.id("pincodeInputId"));
	 WebElement check = driver.findElement(By.xpath("//span[text()='Check']"));
	 WebElement details = driver.findElement(By.xpath("//div[text()='View Details']"));
	 WebElement standard = driver.findElement(By.xpath("//div[text()='STANDARD EMI']"));
	 WebElement indusbank = driver.findElement(By.xpath("//div[text()='IndusInd Bank']"));
	 WebElement emi = driver.findElement(By.xpath("//div[text()='6 EMIs @ 14% pa']"));
	 WebElement close1 = driver.findElement(By.xpath("(//button[text()='✕'])[1]"));
	 WebElement addtocart1 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	 WebElement placeorder = driver.findElement(By.xpath("//span[text()='Place Order']"));
}
