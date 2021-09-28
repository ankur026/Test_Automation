package Ankur_Demo.Ankur_Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmazonSearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankursh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	AmazonSearchPage amazonObject=new AmazonSearchPage(driver);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.cssSelector("span#glow-ingress-line1.nav-line-1")).getText());
	amazonObject.searchItems();
	amazonObject.searchIconClick();
	amazonObject.clickimageOne();
	
	// store window ids in array list
    ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
    
    //switch to active tab
    driver.switchTo().window(wid.get(1));
    
	    amazonObject.addCart();
		String ExpectedTitle="Sign-In";
		String ActualTitle=amazonObject.getSignInText();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	    
	//Close all active browser windows 
	driver.quit();
	}
}
