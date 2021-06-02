package d6_SelectDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_GetAllAvailOptionsInDD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement we1=driver.findElement(By.id("cities"));
        Select dd=new Select(we1);
        List<WebElement> opt1= dd.getOptions();
        int size1=opt1.size();
        for (int i=0;i<size1; i++) {
        	System.out.println(opt1.get(i).getText());
        }
        driver.close();

	}

}
