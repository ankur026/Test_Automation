package Ankur_Demo.Ankur_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmazonSearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankursh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.cssSelector("span#glow-ingress-line1.nav-line-1")).getText());
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shirts");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]")).click();
	driver.switchTo().window("1");
	driver.findElement(By.xpath("//a[@class='a-button-text a-text-left']")).click();
	String ExpectedTitle="Sign-In";
	String ActualTitle=driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).getText();
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	driver.close();
	}

}
