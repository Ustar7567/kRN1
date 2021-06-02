package d5_RunningSelCodeOnDiffBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class c_IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumBrowsers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();

	}

}
