package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By email= By.xpath("//input[@id='input-email']");
	By password= By.xpath("//input[@id='input-password']");
	By login= By.xpath("//input[@class='btn btn-primary']");
	By errorMsg=By.xpath("//div[contains(@class,'alert-danger')]");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement ClickLogin() {
		return driver.findElement(login);
	}
	public WebElement errorText() {
		return driver.findElement(errorMsg);
	}

}
