package selenium_yuva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\resume\\YUVASRI.RESUME (3).pdf");
		

	}

}
