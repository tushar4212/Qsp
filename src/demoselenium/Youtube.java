package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // object creation
	
		driver.manage().window().maximize(); //maximize window 
		driver.get("https://www.naukri.com/");  //load site
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}

}
