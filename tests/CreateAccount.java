package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccount {
	
	private WebDriver driver;
	
	@beforeMethod
	public void setup(){
		
		driver=new FirefoxDriver();
		driver.get("http://107.170.213.234/catalog/");
		
	}

	driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[2]/u")).click();
	

//	driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
	String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
	String ExpectedText="My Account Information";
	Assert.assertEquals(ExpectedText, ActualText);
	System.out.println("ActualText="+ActualText+"\n"+"ExpectedText"+ ExpectedText);
	
//driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
	driver.findElement(By.id("")).click();
	driver.findElement(By.id("")).click();
	
	driver.findElement(By.name("First Name")).sendKeys("john");
	driver.findElement(By.name("Last Name")).sendKeys("smith");
	driver.findElement(By.name("Date of Birth")).sendKeys("05/21/1970");
	driver.findElement(By.name("Email Address")).sendKeys("johnsmith@ecalix.com");
	
	driver.findElement(By.xpath("//*[@id='tdb4']/span[2]")).click();
	
	
	
	
}
