package selenium_yuva;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriverl.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// Navigation methods
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
	}

}
