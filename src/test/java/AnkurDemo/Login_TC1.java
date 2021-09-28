package AnkurDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Ankur_Demo.Ankur_Demo.Dashboard;
import Ankur_Demo.Ankur_Demo.HomePage;
import Ankur_Demo.Ankur_Demo.LoginPage;


public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ankursh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");
		driver.manage().window().maximize();
		
		//Creating object of home page
		HomePage home = new HomePage(driver);
		
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		//Click on Login button
		home.clickLogin();
		
		//Enter username & password
		login.enterUsername("InvalidUsername");
		login.enterPassword("InvalidPassword");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		//Capture the Error and print on console
		System.out.println("The Error message is " +dashboard.getErrorMessage());
		
		//Close browser instance
               driver.quit();
	}

}