package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
//Why do we need it?
	}
	
	public void enterUserName(String UserName){
		driver.findElement(By.name("email_address")).sendKeys("UserName");
		System.out.println("Username entered");
	}
	
	public void clickLogYourselfIn(){
		driver.findElement(By.xpath("//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
		System.out.println("Log yourself link clicked");
	}
	
	public void enterPassword(String Password){
		driver.findElement(By.name("password")).sendKeys("Password");
		System.out.println("Pwd entered");

	}
	
	public void clickSignIn(){
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
		System.out.println("Click Signin");

	}
	
	public void clickLogOff(){
		driver.findElement(By.xpath("//*[@id='tdb4']/span")).click();
		System.out.println("Click Logoff");

	}
}
