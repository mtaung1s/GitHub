package common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commonMethods{
	private WebDriver driver;

	public WebDriver openBrowser(){
		driver=new FirefoxDriver();
		System.out.println("Open Browser");
		return driver;

	}
	public void openURL(){
		driver.get("http://107.170.213.234/catalog/");
		System.out.println("URL is opened");
	}
	
	public void closeBrowser(){
		driver.quit();
		System.out.println("Browser is closed");
	}
	
	

}
