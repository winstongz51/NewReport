package secondPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyClass {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automatización\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	String baseUrl = "http://demo.guru99.com/V4/";
	String expectedTitle = "Guru99 Bank Home Page";
	String actualTitle = "";
	
	driver.get(baseUrl);
	actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle, "Salio mal");
	
	driver.quit();
	}
}






