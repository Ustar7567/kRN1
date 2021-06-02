package f_FindingValueAttributeOfAnElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_href {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String st=driver.findElement(By.xpath("//a[contains(text(),'About us')]")).getAttribute("href");
		System.out.println(st);
		driver.close();
		String act="https://krninformatix.com/about-us.php";
		if(act.equals(st)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
