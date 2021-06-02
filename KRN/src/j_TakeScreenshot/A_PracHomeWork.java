package j_TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_PracHomeWork {

	public static void main(String[] args) throws IOException, InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String st=driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("C://Users//Admin//Desktop//Eclipse//EclipseWrokspace//KRN//Screenshot//"+st+".png"));
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
