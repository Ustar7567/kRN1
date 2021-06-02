package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class F1c_DownloadFileToCustomFolderPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "C:\\Users\\Admin\\Desktop\\Edu-Videos");
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(prof);
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://goo.gl/uJJ5Sc']")).click();
	}

}
