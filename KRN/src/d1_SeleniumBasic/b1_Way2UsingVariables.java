package d1_SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class b1_Way2UsingVariables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		WebElement un= driver.findElement(By.id("username"));
		un.sendKeys("admin");
		WebElement pw= driver.findElement(By.name("pwd"));
		pw.sendKeys("manager");
		WebElement lgn=driver.findElement(By.id("loginButton"));
		lgn.click();

	}

}
//We can assign a variable for findelement event and use that variable to perform operation.But, it makes the code
//lengthy and memory is allocated. So. this process is not preferred.