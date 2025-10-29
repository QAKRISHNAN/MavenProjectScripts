package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Browser 
{
	@Test
	public void ChromeBrowser() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
       
	}
}
