package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_JavaScriptConfirmation {
	
	//click on alert box, cancel the alert, click on alert, get text of the alert and accept the alert.

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we1=driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
		we1.click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.dismiss();
		Thread.sleep(2000);
		we1.click();
		Thread.sleep(2000);
		String st=al.getText();
		System.out.println(st);
		al.accept();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
