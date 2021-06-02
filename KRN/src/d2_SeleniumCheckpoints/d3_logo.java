package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class d3_logo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com");
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//img[@id='logo']")).isDisplayed();
		System.out.println(status);
		if (status) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is not displayed");
		}
		driver.quit();
	}

}
