package g_PopUps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class G_NewWindowOrModalWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		driver.findElement(By.xpath("//a[text()='Packages']")).click();
		Set<String>allhndl=driver.getWindowHandles();
		Iterator<String>it=allhndl.iterator();
		String irctc=it.next();
		String pack=it.next();
		System.out.println(irctc);
		System.out.println(pack);
		
		/*Window handle outputs for string variables "irctc" and "pack" in different browsers are as follows:
		Chrome
		CDwindow-EFA15958AD0246FBB0863B28AB73E572
		CDwindow-49EA5556042D62F349A98D522DF3925A
		Edge
		CDwindow-AD49CF4E48815C48B004E7D7B175D9F5
		CDwindow-520CEB8C7E73A8D237EF025B33E46A09
		IE
		650c152a-0fc6-4d37-8000-fcb33a849224
		0061fab5-b1d6-46ce-b83e-3d224841ec69
		Firefox
		21
		36
		Opera
		CDwindow-CD26BBD6F65074DFCEA7AFA119426BDB
		CDwindow-ADE06044C10298DCE7017B362936908C*/


		driver.switchTo().window(pack);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(irctc);
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.close();
	}

}
