package k_iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_iFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("secondframe");
		driver.findElement(By.name("name1")).sendKeys("Manju");
		Thread.sleep(2000);
		
		//We can't switch from one frame to another frame directly. First we need to switch to default frame and then switch to the next frame
		driver.switchTo().defaultContent(); //or we can use driver.switchTo().parentFrame();
		
		WebElement we=driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(we);
		driver.findElement(By.name("check")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame(); //or we can use driver.switchTo().defaultContent(); bcz we don't hv any nested parents related to this element
		
		driver.switchTo().frame("secondframe");
		driver.findElement(By.name("rep")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
