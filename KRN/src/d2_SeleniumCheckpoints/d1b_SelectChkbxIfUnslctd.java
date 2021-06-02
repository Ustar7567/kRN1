package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class d1b_SelectChkbxIfUnslctd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		Thread.sleep(3000);
		Boolean s1=driver.findElement(By.id("rem")).isSelected();
		System.out.println(s1);
		driver.findElement(By.id("rem")).click();
		Thread.sleep(2000);
		Boolean s2= driver.findElement(By.id("rem")).isSelected();
		System.out.println(s2);
		driver.findElement(By.id("rem")).click();
		Thread.sleep(2000);
		Boolean s3=driver.findElement(By.id("rem")).isSelected();
		System.out.println(s3);		
		if(!s3) {
			driver.findElement(By.id("rem")).click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
