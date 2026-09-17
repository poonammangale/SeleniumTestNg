package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOpenObject {
	
	public WebDriver driver;
	
By myAccount=By.xpath("//span[contains(text(),'My Account')]");
By login=By.xpath("//ul[contains(@class,'dropdown-menu')]//a[text()='Login']");

	public LoginPageOpenObject(WebDriver driver) {
    this.driver = driver;
	}
	
	public WebElement ClickOnMyaccount() {
		return driver.findElement(myAccount);
		
	}
	public WebElement ClickOnLogin() {
		return driver.findElement(login);
		
	}
	
	
}
