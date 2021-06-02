package e_WorkingWithMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_SelectingAllCheckBoxesInTheWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ifr=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(ifr);
		
		List<WebElement> we=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<we.size();i++) {
			we.get(i).click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
