package selenium_yuva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.xpath("//a[@data-nav-role='signin']"));
		search.click();
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("9840850323");
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("mano@0323");
		WebElement sign = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		sign.click();
		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		Select mm = new Select(all);
		mm.selectByVisibleText("Beauty");
		WebElement white = driver.findElement(By.id("twotabsearchtextbox"));
		white.sendKeys("Kajal");
		WebElement searchs = driver.findElement(By.id("nav-search-submit-button"));
		searchs.click();
		
		
		
		
		
		
		
		

}
}
