package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard {

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // object creation
	
		driver.manage().window().maximize(); //maximize window 
		driver.get("https://www.flipkart.com/");  //load site
		
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
		
		
	}

}
