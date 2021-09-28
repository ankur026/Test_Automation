package Ankur_Demo.Ankur_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public AmazonSearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for the page title and the logout button
	By heading = By.xpath("//div[@class=\"main-header\"]");
	By logoutBtn = By.id("submit");
	
	By searchItem=By.xpath("//input[@id='twotabsearchtextbox']");
	
	By searchIconClick= By.xpath("//input[@id='nav-search-submit-button']");
	
	By imageOne=By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]");
	
	By addCart=By.xpath("//a[@class='a-button-text a-text-left']");
	
	By getSignInText = By.xpath("//h1[@class='a-spacing-small']");
	
	
	
	//Method to search for Items
		public void searchItems() {
			driver.findElement(searchItem).sendKeys("Shirts");
		}
		
		//Method to click on search Icon 
		public void searchIconClick() {
			driver.findElement(searchIconClick).click();
		}
		
		//Method to click on search Icon 
		public void clickimageOne() {
			driver.findElement(imageOne).click();
				}
		
		//Method to click on Add Cart 
				public void addCart() {
					driver.findElement(addCart).click();
						}
				
		//Method to capture the page heading
		public String getSignInText() {
			String head = driver.findElement(getSignInText).getText();
			return head;
				}
		
	
	//Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement(heading).getText();
		return head;
	}
	
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}