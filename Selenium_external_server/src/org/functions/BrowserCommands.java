package org.functions;

public class BrowserCommands extends Browser {
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void launch(String url) {
		driver.get(url);
	}
	
	public static void quit() {
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		browserSetup("firefox");
		maximize();
		launch("https://www.instagram.com/");
		Thread.sleep(2000);
		quit();
	}

}
