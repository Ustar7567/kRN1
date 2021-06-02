package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class F1a_FileDownloadDwnldsFoldr {
	
	//Step1:Set Firefox profile
	//Step2:Set preferences in the profile
	//Step3:Pass the argument in the driver

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(prof);
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
		driver.close();
	}
		
		

}
