package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("brow")).sendKeys("C:\\Users\\Admin\\Desktop\\HTML-Exp\\home.jpg");
		Thread.sleep(3000);
		driver.close();
		
		//file upload with sendkeys works only if in the html file, tag is input tage and type is file
		//example:html code for the above web-element 'brow' is <input type="file" id="brow">
	}

}
