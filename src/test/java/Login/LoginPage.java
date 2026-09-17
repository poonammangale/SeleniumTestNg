package Login;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.LoginPageOpenObject;
import resources.BaseClass;
import resources.CommonMethods;
import resources.ConstantVariables;

public class LoginPage extends BaseClass {
	
	@Test
	public void VerifyLogin() throws IOException, InterruptedException {
		LoginPageOpenObject MA=new LoginPageOpenObject(driver);
		MA.ClickOnMyaccount().click();
		MA.ClickOnLogin().click();
		Thread.sleep(3000);
		LoginPageObjects LPO=new LoginPageObjects(driver);
		LPO.enterEmail().sendKeys(ConstantVariables.LoginUsername);
		LPO.enterPassword().sendKeys(ConstantVariables.loginPassword);
		LPO.ClickLogin().click();
		Thread.sleep(5000);
		String act_text=LPO.errorText().getText();
		String exp_text=ConstantVariables.LoginExpectedErrorMessage;
		CommonMethods.handleAssertions(exp_text, act_text, "message is not valid");
		
	}

}
