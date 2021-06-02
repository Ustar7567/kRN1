package d1_SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b2_LogoutImmediatelyAfterLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		 /* 
		    driver.findElement(By.id("loginButton")).click();
	        driver.findElement(By.id("logoutLink")).click();
		*/
		
		//If we logout immediately after login as above, the sys throws no such element exception cz it takes time to load the
		//elements in the page after logging in. So, logout button won't be found immediately. 
		//In such case, we need to give some time to the webpage to load all its web elements. So, we use Thread.sleep();
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(20000);
        driver.findElement(By.id("logoutLink")).click();

	    //Thread.sleep waits for 20 seconds completely even if the element loads within 5 seconds or within less than 20 seconds.
        //So, Thread.sleep is not preferred much.

	}

}
