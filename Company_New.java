package selenium_yuva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Company_New {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.muvierecktech.com/");
		driver.manage().window().maximize();
		
		WebElement applyjobs = driver.findElement(By.xpath("(//a[@class='btn  text-white serv'])[2]"));
		applyjobs.click();
		
		WebElement softwaretesting = driver.findElement(By.id("(defaultOpen)[5]"));
		softwaretesting.click();
	
		WebElement applynow = driver.findElement(By.xpath("(//a[@class='ml-xl-5 aclass'])[20]"));
		applynow.click();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("yuvasri");
		
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("9840850323");
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("uvawin35@gmail.com");
		
		WebElement resume = driver.findElement(By.id("resume"));
		resume.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\resume\\YUVASRI.RESUME (3).pdf");
		
		WebElement submit = driver.findElement(By.name("create"));
		submit.click();
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
