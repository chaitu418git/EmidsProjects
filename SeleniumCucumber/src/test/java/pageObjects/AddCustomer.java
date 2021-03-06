package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitHelper;

public class AddCustomer {
	public WebDriver ldriver;
	public WaitHelper wait;
	public AddCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		wait=new WaitHelper(ldriver);
	}
	
	By dashboard=By.xpath("//div[@class='content-header']");
	By cutomermenulink=By.xpath("//li[@class='nav-item has-treeview']/a/p[contains(text(),'Customers')]");
	By cutomermenuitem=By.xpath("//li[@class='nav-item has-treeview menu-open']//li/a/p[contains(text(),'Customers')]");
	By customerspage=By.xpath("//div[@class='content-header clearfix']/h1");
	By addbutton=By.xpath("//a[@class='btn btn-primary']");
	By addnewcustpage=By.xpath("//div[@class='content-header clearfix']/h1[@class='float-left']");
	By txtEmail=By.id("Email");
	By txtPassword=By.id("Password");
	By txtFirstName=By.id("FirstName");
	By txtLastName=By.id("LastName");
	By radioMale=By.id("Gender_Male");
	By radioFemale=By.id("Gender_Female");
	By newsletter=By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable']//select[@id='SelectedNewsletterSubscriptionStoreIds']");
	By dropdown_VendorId=By.id("VendorId");
	By txt_dob=By.xpath("//input[@id='DateOfBirth']");
	By txt_company=By.id("Company");
	By checkbox_taxExempt=By.id("IsTaxExempt");
	By checkbox_active=By.id("Active");
	By txtadminCommnet=By.id("AdminComment");
	By but_save=By.name("save");
	By txtcustomeroles=By.xpath("//div[@class='input-group-append input-group-required']//div[@class='k-multiselect-wrap k-floatwrap']");
	By listitemGuest=By.xpath("//li[contains(text(),'Guests')]");
	By listitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By listitemAdministrators=By.xpath("//li[contains(text(),'Administrators')]");
	By listitemForumModerators=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By listitemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	//By clearCustomerRole=By.xpath("//span[@class='k-icon k-clear-value k-i-close']");
	By clearcustomerrole=By.xpath("//ul[@class='k-reset']//span[@class='k-select']");
	 
	public void clickCustomeMenuLink()
	{
wait.waitForPrsenceOfElement(cutomermenulink, 5);
		//new WebDriverWait(ldriver, 5).until(ExpectedConditions.presenceOfElementLocated(cutomermenulink));
		ldriver.findElement(cutomermenulink).click();
	}
	public void clickCustomeMenuItem()
	{
		wait.waitForPrsenceOfElement(cutomermenuitem, 5);
		//new WebDriverWait(ldriver, 5).until(ExpectedConditions.presenceOfElementLocated(cutomermenuitem));

		ldriver.findElement(cutomermenuitem).click();
	}
	public void addNew()
	{
		ldriver.findElement(addbutton).click();
	}
	public void setEmail(String email)
	{
		wait.waitForPrsenceOfElement(txtEmail, 5);
		//new WebDriverWait(ldriver, 5).until(ExpectedConditions.presenceOfElementLocated(txtEmail));

		ldriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password)
	{
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	
	public void setCustomerRole(String role) throws InterruptedException
	{
		ldriver.findElement(clearcustomerrole).click();
		ldriver.findElement(txtcustomeroles).click();
		WebElement listitem = null;
		Thread.sleep(3000);
		if(role.equals("Registered"))
		{
			listitem=ldriver.findElement(listitemRegistered);
		}
		else if (role.equals("Guests")) {
			listitem=ldriver.findElement(listitemGuest);
		}
		else if (role.equals("Administrators")) {
			listitem=ldriver.findElement(listitemAdministrators);
		}
		else if (role.equals("Forum Moderators")) {
			listitem=ldriver.findElement(listitemForumModerators);
		}
		else if (role.equals("Vendors")) {
			listitem=ldriver.findElement(listitemVendors);
		}
		//listitem.click();
		
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
	}
	public void setManagerOfVendor(String value)
	{
		Select select=new Select(ldriver.findElement(dropdown_VendorId));
		select.selectByVisibleText(value);
		
	}
	public String getTitle() {
		return ldriver.getTitle();
	}
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			ldriver.findElement(radioMale).click();;
		}
		else if (gender.equals("Female")) {
			ldriver.findElement(radioFemale).click();;
		}
		else
		{
			ldriver.findElement(radioMale).click();//Default
		}
	}
	public void setFirstName(String fname)
	{
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		ldriver.findElement(txtLastName).sendKeys(lname);
	}
	public void setDob(String dob)
	{
		ldriver.findElement(txt_dob).sendKeys(dob);
	}
	public void setCompanyName(String cname)
	{
		ldriver.findElement(txt_company).sendKeys(cname);
	}
	public void setAdminComment(String comment)
	{
		ldriver.findElement(txtadminCommnet).sendKeys(comment);
	}
	public void clickOnSave()
	{
		ldriver.findElement(but_save).click();
	}

}
