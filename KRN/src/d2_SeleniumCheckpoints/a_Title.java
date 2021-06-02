package d2_SeleniumCheckpoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a_Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumBrowsers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String exp="actiTIME - Login";
		String act=driver.getTitle();
		System.out.println("Actual title is "+act);
		if(act.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
