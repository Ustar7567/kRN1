package g_PopUps;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FPrac1_Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		HashMap<String, Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		prefs.put("download.default_directory","C:\\Users\\Admin\\Desktop\\Edu-Videos");
		op.setExperimentalOption("prefs", prefs);
				
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com");
		driver.findElement(By.xpath("//h3[text()='Documents']/../..//a[@href='https://file-examples.com/index.php/sample-documents-download/']")).click();
		driver.findElement(By.xpath("//td[text()='PDF']/..//a")).click();
		driver.findElement(By.xpath("//td[text()='150 kB']/..//a[contains(@href,'sample')]")).click();

	}

}
