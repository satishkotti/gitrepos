import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchPage {
	
	WebDriver driver; 
	@Test
	public void launchPage()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://www.google.com");
		System.out.println("url" + driver.getCurrentUrl());
		System.out.println("titel-" + driver.getTitle());
		 driver.close();		
		driver.quit();
		
		 
	}
	

}
