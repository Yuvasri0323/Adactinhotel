

package selenium_yuva;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Adactinhotel {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\selenium_yuva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");


		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("yuvasrir");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mano23");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("Sydney");
		List<WebElement> option2 = s1.getOptions();
		for (WebElement webElement : option2) {
			System.out.println("location:" + webElement.getText());
		}

		WebElement place = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(place);
		Thread.sleep(3000);
		List<WebElement> option3 = s2.getOptions();
		for (WebElement webElement : option3) {

			System.out.println("place:" + webElement.getText());
		}
		System.out.println("*******************************");

		WebElement Roomtype = driver.findElement(By.xpath("//select[@id='Roomtype']"));
		Select s3 = new Select(Roomtype);
		s3.selectByVisibleText("Deluxe");
		Thread.sleep(3000);
		List<WebElement> options2 = s3.getOptions();
		for (WebElement webElement : options2) {
			System.out.println("Roomtype:" + webElement.getText());
		}
		Thread.sleep(3000);
		System.out.println("*******************************");

		WebElement Roomnos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4 = new Select(Roomnos);
		s4.selectByVisibleText("4 - Four");
		Thread.sleep(3000);
		List<WebElement> options3 = s4.getOptions();
		for (WebElement webElement : options3) {
			System.out.println("Roomnos:" + webElement.getText());
		}
		Thread.sleep(3000);
		System.out.println("*******************************");

		WebElement Date_in = driver.findElement(By.xpath("//input[@id='Date_in']"));
		Date_in.sendKeys("30/11/2022");
		WebElement Date_out = driver.findElement(By.xpath("//input[@id='Date_out']"));
		Date_out.sendKeys("01/12/2022");

		WebElement Adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5 = new Select(Adult);
		s5.selectByVisibleText("3 - Three");
		Thread.sleep(3000);
		List<WebElement> options4 = s5.getOptions();
		for (WebElement webElement : options4) {
			System.out.println("Adult:" + webElement.getText());
		}
		Thread.sleep(3000);
		System.out.println("*******************************");

		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s6 = new Select(child);
		s6.selectByVisibleText("2 - Two");
		Thread.sleep(3000);
		List<WebElement> options5 = s6.getOptions();
		for (WebElement webElement : options5) {
			System.out.println("child:" + webElement.getText());
		}
		Thread.sleep(3000);
		System.out.println("*******************************");

		WebElement Serach = driver.findElement(By.xpath("//input[@id='Submit']"));
		Serach.click();
		Thread.sleep(3000);
		TakesScreenshot Ts = (TakesScreenshot) driver;
		File source1 = Ts.getScreenshotAs(OutputType.FILE);
		File def = new File("C:\\Users\\Admin\\eclipse-workspace\\Google\\hotelsearch.jpeg");

		WebElement Radiobutton = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		Radiobutton.click();
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		Thread.sleep(3000);
		JavascriptExecutor To = (JavascriptExecutor) driver;
		To.executeScript("window.scrollBy(0,2000 )");
		Thread.sleep(3000);
		

		WebElement First_name = driver.findElement(By.xpath("//input[@id='first_name']"));
		First_name.sendKeys("Manoj");
		WebElement Lastt_name = driver.findElement(By.xpath("//input[@id='last_name']"));
		Lastt_name.sendKeys("papu");
		WebElement Address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Address.sendKeys("dfjdfdfjfjndj");
		WebElement Credit_card = driver.findElement(By.xpath("//input[@id='cc_num']"));
		Credit_card.sendKeys("9766786543258815");
		WebElement Credit_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select cc = new Select(Credit_type);
		cc.selectByVisibleText("Master Card");
		Thread.sleep(2000);

		WebElement Exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select em = new Select(Exp_month);
		em.selectByVisibleText("April");

		Thread.sleep(3000);
		List<WebElement> options7 = em.getOptions();
		for (WebElement webElement : options7) {
			System.out.println("Expiry month:" + webElement.getText());
		}
		Thread.sleep(3000);

		WebElement Exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s8 = new Select(Exp_year);
		s8.selectByVisibleText("2022");
		Thread.sleep(3000);
		List<WebElement> options8 = s8.getOptions();
		for (WebElement webElement : options8) {
			System.out.println("Expriy year:" + webElement.getText());
		}
		Thread.sleep(3000);

		WebElement CVV = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		CVV.sendKeys("233");
		WebElement Booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		Booknow.click();
		Thread.sleep(3000);
		

		WebElement Logout = driver.findElement(By.xpath("//input[@id='logout']"));
		Logout.click();
	}
}
