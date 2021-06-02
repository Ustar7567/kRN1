package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_ToolTipDivisionPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/lenovo-888014199-45-w-adapter/p/itmf7y2zaruh4rjg?pid=ACCF7Y2ZRD7XNMEZ&lid=LSTACCF7Y2ZRD7XNMEZIHEPXF&marketplace=FLIPKART&q=lenovo+l440&store=6bo&srno=s_1_1&otracker=search&otracker1=search&fm=SEARCH&iid=3ab953e6-aed5-445d-b819-1c4197256a1a.ACCF7Y2ZRD7XNMEZ.SEARCH&ppt=hp&ppn=homepage&ssid=5munj2rcls0000001621923017616&qH=bbac4e73ea569344");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Enter pincode for exact delivery dates/charges']/../../..//span[text()='?']")).click();
		String st=driver.findElement(By.xpath("(//div[@class='_1LJS6T'])[1]")).getText();
		System.out.println(st);
		driver.close();
	}

}
