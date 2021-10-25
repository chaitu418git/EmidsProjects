package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
public WebDriver driver;
public WaitHelper(WebDriver driver) {
	this.driver=driver;
}
public void waitForVisibilityOfElement(WebElement element, long timeOutInSeconds)
{
	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public void waitForInvisibilityOfElement(WebElement element, long timeOutInSeconds)
{
	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
	wait.until(ExpectedConditions.invisibilityOf(element));
}

public void waitForPrsenceOfElement( By locator, long timeOutInSeconds)
{
	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
}
