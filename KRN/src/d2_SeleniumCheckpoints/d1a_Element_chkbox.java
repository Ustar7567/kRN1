package d2_SeleniumCheckpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class d1a_Element_chkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		Thread.sleep(3000);
		WebElement a= driver.findElement(By.id("rem"));
		Boolean s1=a.isSelected();
		System.out.println(s1);
		a.click();
		Thread.sleep(2000);
		Boolean s2= a.isSelected();
		System.out.println(s2);
		a.click();
		Thread.sleep(2000);
		Boolean s3=a.isSelected();
		System.out.println(s3);
		driver.close();

	}

}
//unlike radio button, chkbox can be selected and unseleced many times. But, radio btn once selected is selected,cnt unselect