package Login;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageOpenObject;
import resources.BaseClass;

public class LoginPageOpen extends BaseClass{
	
	
	@Test
	public void OpenLoginPage() throws IOException {
		LoginPageOpenObject MA=new LoginPageOpenObject(driver);
		MA.ClickOnMyaccount().click();
		MA.ClickOnLogin().click();		
	}
	
}
