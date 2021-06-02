package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c_URL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		String act=driver.getCurrentUrl();
		String exp="https://krninformatix.com/about-us.php";
		if(act.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println("Test completed");
		driver.close();
	}
	
}
