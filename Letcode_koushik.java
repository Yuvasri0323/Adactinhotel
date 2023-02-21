package selenium_yuva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Letcode_koushik {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//single
		WebElement single_Drop_Down = driver.findElement(By.xpath("//div[@class='select is-multiple']//select"));
		Select ss = new Select(single_Drop_Down);
		boolean multiple = ss.isMultiple();
		System.out.println(multiple);
		ss.selectByVisibleText("Pine Apple");
		// multiple
		WebElement multiple_Drop_Down = driver.findElement(By.xpath("//div[@class='select is-multiple']//select"));
		Select dd = new Select(multiple_Drop_Down);
		boolean multiple2 = dd.isMultiple();
		System.out.println(multiple2);
		dd.selectByVisibleText("Batwoman");
		dd.selectByVisibleText("Captain Marvel");
		dd.selectByVisibleText("The Shadow");
		dd.selectByVisibleText("Supergirl");
		dd.selectByVisibleText("Supergirl");
		List<WebElement> allSelectedOptions = dd.getAllSelectedOptions();
		for(WebElement abc : allSelected )
		
		
		
	}
	
}
