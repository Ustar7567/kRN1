package d5_RunningSelCodeOnDiffBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class e_Opera {

	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "C:\\SeleniumBrowsers\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
