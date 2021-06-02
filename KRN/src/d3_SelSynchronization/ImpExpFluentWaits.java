package d3_SelSynchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpExpFluentWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com"); // get method has auto-synchronization internally. So, we don't write
		// implicit wait before get method usually.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // applicable for all driver.findElement()
		// methods throughout the program
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);// Applicable only to logout link(the following web element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));// Giving condition for explicit
		// wait
		driver.findElement(By.id("logoutLink")).click();

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		@SuppressWarnings("deprecation")
		Wait<WebDriver> flwait = new FluentWait<WebDriver>(driver)// checks every 5 seconds for 30 seconds (6 times)
				// for the element to be clickable
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		flwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logoutLink' and @class='logout']")));
		driver.findElement(By.id("logoutLink")).click();
	}

}
