package basicTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonUtils.PropertyFileUtil;
import commonUtils.WebDriverUtil;

public class OrganizationsTest {

	@Test
	public void organizationTest() throws IOException, InterruptedException {
		
		PropertyFileUtil putil = new PropertyFileUtil();
		WebDriverUtil wdutil = new WebDriverUtil();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		//Login the application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
  }
}
