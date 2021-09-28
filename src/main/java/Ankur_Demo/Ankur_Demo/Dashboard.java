package Ankur_Demo.Ankur_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for the page title and the logout button
	By ErrorMessage = By.xpath("//p[@id='name']");
	By logoutBtn = By.id("submit");
	
	//Method to capture the error message
	public String getErrorMessage() {
		String head = driver.findElement(ErrorMessage).getText();
		return head;
	}
	
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}