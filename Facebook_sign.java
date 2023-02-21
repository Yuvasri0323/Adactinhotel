package selenium_yuva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_sign {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//tagname[text() = '']
		WebElement Create_Account = driver .findElement(By.xpath("//a[@class'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		Create_Account.click();
		Thread.sleep(4000);
		WebElement first_Name = driver.findElement(By.xpath("//input[@type='text'])[2]"));
		first_Name.sendKeys("Yuvasri");
		Thread.sleep(3000);
		WebElement last_Name = driver.findElement(By.xpath("//input[contains@name,'lastname')]"));
		last_Name.sendKeys("manoj");
		Thread.sleep(3000);
		WebElement gender  = driver.findElement(By.xpath("/label[contains(text(),'Female')]"));
		
	} 
}