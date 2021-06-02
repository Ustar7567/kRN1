package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_RajKumarCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/samsung-galaxy-f62-laser-grey-128-gb/p/itmaf3ed4dbc2ee5?pid=MOBFZWSUZGKGHMHD&lid=LSTMOBFZWSUZGKGHMHD7IV39I&marketplace=FLIPKART&store=tyy%2F4io&srno=b_1_1&otracker=hp_banner_2_10.bannerX3.BANNER_MLB7JY0TMGLB&fm=neo%2Fmerchandising&iid=6d80b913-8c36-4c5f-8928-2ba9bdde8372.MOBFZWSUZGKGHMHD.SEARCH&ppt=hp&ppn=homepage&ssid=01c5zfp6jk0000001620212824104");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='question'])[1]")).click();
		String tooltip2=driver.findElement(By.xpath("//div[@class='_1LJS6T']")).getText();
		System.out.println(tooltip2);

	}

}

