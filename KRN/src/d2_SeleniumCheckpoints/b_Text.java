package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b_Text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		String exp="Enter Time-Track";
		String act=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		System.out.println("The actual text is "+act);
		if(act.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
