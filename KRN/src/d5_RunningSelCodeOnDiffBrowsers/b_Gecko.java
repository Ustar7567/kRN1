package d5_RunningSelCodeOnDiffBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b_Gecko {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");//use latest version of firefox n don't stop updates
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();

	}

}
