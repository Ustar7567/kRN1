package g_PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_PracAshishCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9677252321");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashish@1997");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@href='/viewcart?otracker=Cart_Icon_Click']")).click();

		driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).click();

		Thread.sleep(3000);



		driver.findElement(By.xpath("//span[@class='question']")).click();
		String Txtvalue=driver.findElement(By.xpath("//div[@class='_1LJS6T']")).getText();

		System.out.println(Txtvalue);


		}

		}
