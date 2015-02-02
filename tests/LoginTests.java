package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import common.commonMethods;

public class LoginTests {
	
	private WebDriver driver;
	commonMethods CM;
	
	@BeforeMethod
	public void setUp(){
//		driver=new FirefoxDriver();
//		driver.get("http://107.170.213.234/catalog/");
		
//changed to
		
		CM=new commonMethods();
		driver=CM.openBrowser();
		
//why driver?
		CM.openURL();
	}
	
	@Test
	public void Login01(){
//		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
//		driver.findElement(By.name("email_address")).sendKeys("ecalix@test.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
//		String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
//		String ExpectedText="Welcome to iBusiness";
//		Assert.assertEquals(ExpectedText, ActualText);
//		System.out.println("ActualText="+ActualText+"\n"+"ExpectedText"+ ExpectedText);
		
//		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		
//changed to
		
		LoginPage LP=new LoginPage(driver);
		LP.clickLogYourselfIn();
		LP.enterUserName("ecalix@test.com");
		LP.enterPassword("test123");
		LP.clickSignIn();
		LP.clickLogOff();
		
	}
	
	
	public void Login02(){
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
//		driver.findElement(By.name("email_address")).sendKeys("ecalix@test.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
		String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent'/table/tbody/tr/td")).getText();
		String ExpectedText="Error: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(ExpectedText.trim(), ActualText.trim());
		System.out.println("ActualText="+ActualText+"\n"+"ExpectedText"+ ExpectedText);
		
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();

//changed to
		CM.closeBrowser();
	}


}
