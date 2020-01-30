package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	WebDriver driver;
	
	@Test
	public void Openbrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//1. Launch URL
		driver.get("https://www.canada.ca/en/health-canada.html");
		
		//2. Go to DropDown menu select tax, click Income Tax 
		driver.findElement(By.xpath("//*[@id='wb-auto-2']/div/button")).click(); 
		driver.findElement(By.xpath("//*[@id='wb-auto-3']/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id='gc-mnu-taxes']/li[3]/a")).click();  
		
		//3. Click Income Tax Act
		driver.findElement(By.xpath("/html/body/main/div[2]/section[1]/div/section[1]/ul/li[1]/a")).click(); 

		
		//4. Navigate to Departments
		driver.navigate().to("https://www.canada.ca/en/government/dept.html"); 
		
		//5. Go to DropDown menu, select Travel and Tourism and click Canada Passport
		driver.findElement(By.xpath("//*[@id='wb-auto-2']/div/button")).click();
		driver.findElement(By.xpath("//*[@id='wb-auto-3']/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='gc-mnu-travel']/li[5]/a")).click();
		
		//6. Click renew your Passport
		driver.findElement(By.xpath("/html/body/main/div[1]/div[5]/aside/div/div[1]/div[2]/aside/div/div[1]/div/section/h3/a")).click();
		
		//7. Click get Pay your fees
		driver.findElement(By.xpath("//*[@id='wb-auto-5']/div[4]/section/h3/a")).click(); 
		
		//8. Click get payment instructions 
		driver.findElement(By.xpath("//*[@id='ff-submit-btn']")).click();
		
		//9. Close browser
		driver.quit(); 
	}
}
