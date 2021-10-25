package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver ldriver;
public LoginPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(id = "Email")
@CacheLookup
WebElement txtEmail;

@FindBy(id="Password")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath = "//button[@class='button-1 login-button']")
@CacheLookup
WebElement btnLogin;

@FindBy(linkText = "Logout")
@CacheLookup
WebElement lnkLogout;

@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
@CacheLookup
WebElement errormessage;

public void setUsername(String uname)
{
	txtEmail.clear();
	txtEmail.sendKeys(uname);
}

public void setPassword(String password)
{
	txtPassword.clear();
	txtPassword.sendKeys(password);
}

public void clickLogin()
{
	btnLogin.click();
	
}

public void clickLogout()
{
	lnkLogout.click();
	
}

public String errorMessage()
{
	return errormessage.getText();
}
}
