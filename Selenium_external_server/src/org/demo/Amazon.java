package org.demo;

public class Amazon extends Baseclass {
	Locators obj;
	public void mobiles() throws InterruptedException {
		obj = new Locators();
		click(obj.mobile);
//		mouseover(accessories);
//		Thread.sleep(2000);
//		click(cases);
//		click(basiccase);
//		click(selectedcase);
//		switchWindow(1);
//		click(addtocart);
//		Thread.sleep(5000);
//		click(checkout);
		//Thread.sleep(3000);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Amazon a = new Amazon();
		browserSetup("chrome");
		launch("https://www.amazon.in/");
		maximize();
		a.mobiles();
		
	}

}
