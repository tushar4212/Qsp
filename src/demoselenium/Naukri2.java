package demoselenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SOFTWARE/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // object creation
	
		driver.manage().window().maximize(); //maximize window 
		driver.get("https://www.naukri.com/"); 
		Thread.sleep(2000);
		String parentWH =driver.getWindowHandle();
		System.out.println("parent window handle"+parentWH);
		Set<String> wins = driver.getWindowHandles();
		System.out.println(wins.getClass());
		wins.remove(parentWH);
		for(String handle : wins) {
		     System.out.println(handle);
		     driver.switchTo().window(handle);
		     driver.close();
		     Thread.sleep(2000);
		     driver.close();
		}
		
		
	}


}
