package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A_MouseAndKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		/*String st=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//a[text()='Gmail']")).sendKeys(st);
		The above two lines can be used to open gmail link in new tab on google.*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement courses=driver.findElement(By.xpath("//span[text()='Courses Offered']"));
		Actions act=new Actions(driver);
		act.moveToElement(courses);
	
		act.contextClick(courses).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).click();
		
		//Refer to the classes in "package MouseAndKeyboard";

	}

}
