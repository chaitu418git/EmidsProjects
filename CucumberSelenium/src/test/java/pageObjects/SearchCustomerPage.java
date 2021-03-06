package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class SearchCustomerPage {
	public WebDriver ldriver;
	public WaitHelper waithelper;
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		waithelper=new WaitHelper(ldriver);
	}
	
	@FindBy(how = How.ID, using ="SearchEmail")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.ID,using ="SearchFirstName")
	@CacheLookup
	WebElement txtFname;
	
	@FindBy(how = How.ID,using ="SearchLastName")
	@CacheLookup
	WebElement txtLname;
	
	@FindBy(how = How.ID,using ="SearchCompany")
	@CacheLookup
	WebElement txtCompany;
	
	@FindBy(how = How.ID,using ="SearchMonthOfBirth")
	@CacheLookup
	WebElement txtSearchMonthOfBirth;
	
	@FindBy(how = How.ID,using ="SearchDayOfBirth")
	@CacheLookup
	WebElement txtSearchDayOfBirth;
	
	@FindBy(how = How.XPATH,using ="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[contains(text(),'Registered')]")
	@CacheLookup
	WebElement listitemRegistered;
	
	@FindBy(how = How.XPATH,using ="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[contains(text(),'Forum Moderators')]")
	@CacheLookup
	WebElement listitemForumModerators;
	
	@FindBy(how = How.XPATH,using ="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[contains(text(),'Administrators')]")
	@CacheLookup
	WebElement listitemAdministrators;
	
	@FindBy(how = How.XPATH,using ="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[contains(text(),'Guests')]")
	@CacheLookup
	WebElement listitemGuests;
	
	@FindBy(how = How.XPATH,using ="//ul[@id='SelectedCustomerRoleIds_taglist']/li/span[contains(text(),'Vendors')]")
	@CacheLookup
	WebElement listitemVendors;
	
	@FindBy(how = How.XPATH,using ="//table[@id='customers-grid']")
	@CacheLookup
	WebElement table;
	

	@FindBy(how = How.XPATH,using ="//table[@id='customers-grid']/tbody/tr")
	@CacheLookup
	List<WebElement> tablerows;
	

	@FindBy(how = How.XPATH,using ="//table[@id='customers-grid']/tbody/tr/td")
	@CacheLookup
	List<WebElement> tablecolumns;
	
	@FindBy(how = How.ID,using ="search-customers")
	@CacheLookup
	WebElement searchbutton;
	
	@FindBy(how = How.XPATH,using ="//div[@id='ajaxBusy']/span")
	@CacheLookup
	WebElement loader;
	
	
	public void setEmail(String email)
	{
		waithelper.waitForVisibilityOfElement(txtEmail, 10);
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void setfName(String fname)
	{
		waithelper.waitForVisibilityOfElement(txtFname, 10);
		txtFname.clear();
		txtFname.sendKeys(fname);
	}
	
	public void setLname(String lname)
	{
		waithelper.waitForVisibilityOfElement(txtLname, 10);
		txtLname.clear();
		txtLname.sendKeys(lname);
	}
	
	public void clickSearch()
	{
		
		searchbutton.click();
		waithelper.waitForInvisibilityOfElement(loader, 10);
	}
	
	public int getNoOfRows()
	{
		return tablerows.size();
	}
	
	public int getNoOfColumns()
	{
		return tablecolumns.size();
	}
	
	public boolean searchCustomerByEmail(String email)
	{
		boolean flag=false;
		
		for(int i=1;i<=getNoOfRows();i++)
		{
			String emailid=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
		System.out.println(emailid);
		if(emailid.equals(email))
			flag=true;
		}
		
		return flag;
	}
	
	public static int getColumnIndex(WebDriver driver,String columnName)
	{
		int columns=driver.findElements(By.xpath("//div[@class='dataTables_scrollHead']//table/thead/tr[1]/th")).size();
		int indexOfQuanity = 0;
		for(int i=1;i<=columns;i++)
		{
			//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td["+i+"]/b")).getText());
			if(driver.findElement(By.xpath("//div[@class='dataTables_scrollHead']//table/thead/tr[1]/th["+i+"]")).getText().equalsIgnoreCase(columnName))
					{
				indexOfQuanity=i;
				break;
					}
			
	//System.out.println(driver.findElement(By.xpath("//table/thead/tr/td/b[text()='Quantiry']")).getSize());
	}
		return indexOfQuanity;
	}

	public boolean searchCustomerByFname(String fname)
	{
		boolean flag=false;
		int columnvalue=getColumnIndex(ldriver,"Name");	
		
		for(int i=1;i<=getNoOfRows();i++)
		{
			List<WebElement> alllist = table.findElements(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td["+columnvalue+"]"));
			for(int j=0;j<alllist.size();j++)
			{
				System.out.println(alllist.get(j).getText());
			if(alllist.get(j).getText().contains(fname))
			{
				flag=true;
			}
			}
		}
		return flag;
		
	}
public boolean searchCustomerByFnameAndLname(String fname, String lname)
{
	String name =fname+lname;
	System.out.println(name);
	boolean flag=false;
	int columnvalue=getColumnIndex(ldriver,"Name");	
	
	for(int i=1;i<=getNoOfRows();i++)
	{
		List<WebElement> alllist = table.findElements(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td["+columnvalue+"]"));
		for(int j=0;j<alllist.size();j++)
		{
			System.out.println(alllist.get(j).getText());
		String[] names=alllist.get(j).getText().split(" ");
		//System.out.println(names.);
		String s1 = names[0];
		String s2=names[1];
		if(s1.contains(fname) & s2.contains(lname))
		{
			//System.out.println(alllist.get(i).getText());
			flag=true;
		}
		}
	}
	return flag;
	
}
	
	
	
}
