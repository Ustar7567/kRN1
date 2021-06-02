package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement we1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement we2=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		act.dragAndDrop(we1, we2).perform();

	}

}
