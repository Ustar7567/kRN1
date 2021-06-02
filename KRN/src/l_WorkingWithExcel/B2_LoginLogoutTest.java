package l_WorkingWithExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2_LoginLogoutTest {

	public static void main(String[] args) throws InterruptedException {
		B1_Frmwrk frm=new B1_Frmwrk(); 

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		int lstrw=frm.lstRw("Sheet1");
		
		for(int i=0;i<=lstrw;i++) {
			String un= frm.fr("Sheet1", i, 0);
			String pw=frm.fr("Sheet1", i, 1);
			
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("logoutLink")).click();
		}
		
		driver.close();
		

	}

}
