package d6_SelectDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E_GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we1=driver.findElement(By.id("cities"));
		Select dd=new Select(we1);
		dd.selectByIndex(0);
		dd.selectByValue("2");
		dd.selectByVisibleText("Mumbai");
		Thread.sleep(2000);
		List<WebElement> we2=dd.getAllSelectedOptions();
		int size1=we2.size();
		for(int i=0;i<size1;i++) {
			System.out.println(we2.get(i).getText());
		}
		driver.close();
	}

}
