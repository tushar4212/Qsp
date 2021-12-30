package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demolaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // object creation
	
		driver.manage().window().maximize(); //maximize window 
		
		driver.get("http://facebook.com/");  //load site
		
		//driver.close();// close window
		
		driver.quit();
	}

}
  