package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_JavaScriptAlert {
	
	//click on alert, accept alert, click on alert, get text of the alert, accept alert.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		String st=driver.switchTo().alert().getText();
		System.out.println(st);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

}
