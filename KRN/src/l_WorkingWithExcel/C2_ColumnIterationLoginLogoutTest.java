package l_WorkingWithExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_ColumnIterationLoginLogoutTest {

	public static void main(String[] args) throws InterruptedException {
		C1_FrameworkIterateThroughColumns frmwrk = new C1_FrameworkIterateThroughColumns();

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		int lstcl = frmwrk.lastCell("Sheet1", 0);

		for (int i = 0; i < lstcl; i++) {

			String un = frmwrk.excel("Sheet1", 0, i);
			String pw = frmwrk.excel("Sheet1", 1, i);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(7000);
			driver.findElement(By.id("logoutLink")).click();

		}
		driver.close();

	}

	}
