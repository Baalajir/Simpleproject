package mavenSample;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Booking {
	public static void main(String[] args) throws Exception {
		LibGlobalK global = new LibGlobalK();
		global.getDriver();
		global.loadUrl("https://adactinhotelapp.com/");
		
		WebElement name = global.findElementByName("username");
		String data = global.getData("Bookin", 1, 0);
		global.typeInPage(name, data);
		
		WebElement pass = global.findElementByName("password");
		String data1 = global.getData("Bookin", 1, 1);
		global.typeInPage(pass, data1);
 	
	
		WebElement btn = global.findElementByName("login");
		global.click(btn);
		
		WebElement loc = global.findElementByName("location");
		String locdata = global.getData("Bookin", 1, 2);
		global.typeInPage(loc, locdata);
		
		WebElement hot = global.findElementByName("hotels");
		String hotdata = global.getData("Bookin", 1, 3);
		global.typeInPage(hot, hotdata);
		
		WebElement hot1 = global.findElementByName("hotels");
		String hot1data = global.getData("Bookin", 1, 3);
		global.typeInPage(hot1, hotdata);
		
		WebElement hot2 = global.findElementByName("hotels");
		String hot2data = global.getData("Bookin", 1, 3);
		global.typeInPage(hot2, hotdata);
		
		WebElement hot3 = global.findElementByName("hotels");
		String hot3data = global.getData("Bookin", 1, 3);
		global.typeInPage(hot3, hotdata);
		
		
		
		
		
	}

}
