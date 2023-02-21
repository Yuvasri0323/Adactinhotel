package selenium_yuva;

import org.openqa.selenium.WebDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	
		
		
