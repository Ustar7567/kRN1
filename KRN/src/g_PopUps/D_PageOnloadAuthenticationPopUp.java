package g_PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_PageOnloadAuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://uat-dwebge.www.deutsche-bank.de");
		driver.get("https://admin:manager@uat-dwebge.www.deutsche-bank.de/pk.html");
//in the place of admin and manager in the above url, we need to provide the right credentials to navigate to homepage
		Thread.sleep(2000);
		driver.close();

	}

}
