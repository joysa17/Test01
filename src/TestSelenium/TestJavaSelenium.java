package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestJavaSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chromedriver.driver","");
		
		//driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
