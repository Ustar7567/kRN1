package d5_RunningSelCodeOnDiffBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class d_Edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumBrowsers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
