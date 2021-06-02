package d6_SelectDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we1= driver.findElement(By.id("city"));
		Select singleselect=new Select(we1);
		singleselect.selectByIndex(0);
		Thread.sleep(2000);
		singleselect.selectByValue("2");
		Thread.sleep(2000);
		singleselect.selectByVisibleText("Mumbai");
		Thread.sleep(2000);
		driver.close();
	}

}
