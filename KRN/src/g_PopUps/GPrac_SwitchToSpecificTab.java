package g_PopUps;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GPrac_SwitchToSpecificTab {
//note: parent window index is 0 present in left corner ----- child windows from 1 to 4 are counted from right to left
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		driver.findElement(By.xpath("//a[text()='Hotel ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Packages']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Cruise' and @class='nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Deluxe Train' and @class='nav-link']")).click();
		Thread.sleep(2000);
		Set<String>all=driver.getWindowHandles();//getting all window handles and storing it in Set of string
		ArrayList<String> al=new ArrayList<String>(all); //Converting Set of string to arraylist
		System.out.println(al.size());//printing the size of array list
		System.out.println(al.get(3));//getting window handle of 3rd window
		driver.switchTo().window(al.get(2));//switching to 2nd window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='searchLocation']")).click();//performing operation on 2nd tab
		Thread.sleep(2000);
		driver.close();//closing 2nd window
		driver.switchTo().window(al.get(0));//switching to parent tab
		Thread.sleep(2000);
		driver.close();//closing parent tab
		Thread.sleep(2000);
		driver.quit();//closing all tabs

	}

}
