
package org.functions;

public class Navigations extends BrowserCommands{


	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static void navigateBack() {
		driver.navigate().back();
	}     
	
	public static void navigateForward() {
		driver.navigate().forward();
	}     
	
	public static void referesh() {
		driver.navigate().refresh();
	}
	
	public static void enabled() {
		
	}
	public static void main(String[] args) throws InterruptedException   {
		browserSetup("chrome");
		maximize();
		launch("https://www.instagram.com/");
		Thread.sleep(2000);
		navigateTo("https://www.facebook.com/");
		Thread.sleep(2000);
		navigateBack();
		Thread.sleep(2000);
		navigateForward();
		Thread.sleep(2000);
		referesh();
		Thread.sleep(3000);
		quit();
	}
}
