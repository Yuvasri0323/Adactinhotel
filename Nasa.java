package selenium_yuva;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nasa {


public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nasa.gov/mission_pages/station/main/index.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement overview = driver.findElement(By.xpath("//a[@href='/mission_pages/station/overview/index.html']"));
	Actions yuva = new Actions(driver);
	yuva.contextClick(overview).build().perform();
	Robot y = new Robot ();
	y.keyPress(KeyEvent.VK_DOWN);
	y.keyRelease(KeyEvent.VK_DOWN);
	y.keyPress(KeyEvent.VK_ENTER);
	y.keyRelease(KeyEvent.VK_ENTER);
	WebElement image = driver.findElement(By.xpath("//a[@href='/mission_pages/station/images/index.html']"));
	yuva.contextClick(image).build().perform();
	y.keyPress(KeyEvent.VK_DOWN);
	y.keyRelease(KeyEvent.VK_DOWN);
	y.keyPress(KeyEvent.VK_ENTER);
	y.keyRelease(KeyEvent.VK_ENTER);
	WebElement video = driver.findElement(By.xpath("//a[@href='/mission_pages/station/videos/index.html']"));
	yuva.contextClick(video).build().perform();
	y.keyPress(KeyEvent.VK_DOWN);
	y.keyRelease(KeyEvent.VK_DOWN);
	y.keyPress(KeyEvent.VK_ENTER);
	y.keyRelease(KeyEvent.VK_ENTER);
	WebElement media = driver.findElement(By.xpath("//a[@href='/mission_pages/station/news']"));
	yuva.contextClick( media).build().perform();
	y.keyPress(KeyEvent.VK_DOWN);
	y.keyRelease(KeyEvent.VK_DOWN);
	y.keyPress(KeyEvent.VK_ENTER);
	y.keyRelease(KeyEvent.VK_ENTER);

	Set<String> windowHandles = driver.getWindowHandles();
	for(String string : windowHandles) {
		System.out.println("To Get Window ID : " + string);
		
	}
	String ss = "Space Station Images | NASA";
	for (String ym : windowHandles) {
		if (driver.switchTo().window(ym).getTitle().equalsIgnoreCase(ss)) {
			break;
			
	}
		System.out.println(driver.switchTo().window(ym).getTitle());
	}	
	
}
}
