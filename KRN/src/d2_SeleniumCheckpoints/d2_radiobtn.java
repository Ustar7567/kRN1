package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class d2_radiobtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.id("female"));
		boolean s1=a.isSelected();
		System.out.println(s1);
		a.click();
		Thread.sleep(2000);
		boolean s2=a.isSelected();
		System.out.println(s2);
		a.click();
		Thread.sleep(2000);
		boolean s3=a.isSelected();
		System.out.println(s3);
		driver.quit();
	}

}
//s3 is true cz radio btn once clicked is clicked. Can't undo the selsection of same radion btn.But, can change it to 
//other option under the same radio button family. For eg.female   male. Should select one at any cost