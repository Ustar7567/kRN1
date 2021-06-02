package d6_SelectDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Open amazon.com---print no.of options in dropdown----print the options of select dropdown---
 select 'Baby' from select drop-down---print selected option from dropdown---
 Pass 'Pampers'in the search box &click enter---Filter Pampers brand by selecting checkbox--- 
 find best seller product --- click on the img of the product and launch the display page---
 print the title of the display page---Close the browser */

public class F_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.id("searchDropdownBox"));
		Select dd=new Select(we);
		List<WebElement>we1=dd.getOptions();
		int size=we1.size();
		System.out.println(size);
		for(int i= 0;i<size;i++) {
			System.out.println(we1.get(i).getText());
		}
		dd.selectByVisibleText("Baby");
		Thread.sleep(2000);
		//System.out.println(dd.getFirstSelectedOption().getText());
		System.out.println("\n"+dd.getAllSelectedOptions().get(0).getText());
		
		WebElement we2=driver.findElement(By.id("twotabsearchtextbox"));
		we2.sendKeys("Pampers");
		we2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and text()='Pampers']/../../..//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Best Seller']/../../../../../../..//span[text()='Diapers Size 2, 186 Count - Pampers Swaddlers Disposable Baby Diapers, ONE MONTH SUPPLY (Packaging May Vary)']")).click();
		driver.findElement(By.xpath("//span[text()='Best Seller']/../../../../../../..//img")).click();
		Thread.sleep(2000);
		String ttl=driver.getTitle();
		System.out.println("\n"+ttl);
		driver.close();
	}

}
