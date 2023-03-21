package NeoStocksLOGINtest;



import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibaryFiles.BaseClass;
import LibaryFiles.UtilityClass;
import NeoStocksLOGIN.NeoStocks1Startpage;
import NeoStocksLOGIN.NeoStocks2Loginpage;
import NeoStocksLOGIN.NeoStocks3Passwordpage;
import NeoStocksLOGIN.NeoStocks4PopupPage;
import NeoStocksLOGIN.NeoStocks5Homepage;

public class NeostocksLoginTest1 extends BaseClass
{
	

	
	NeoStocks1Startpage start;   //obj globally declaration   datatype objname
	NeoStocks2Loginpage login;
	NeoStocks3Passwordpage pass;
	NeoStocks4PopupPage ok;
	NeoStocks5Homepage home;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		
	
		 InitiallizeBrowser();   //methodname(); //non static to non static
		
		start=new NeoStocks1Startpage(driver); //obj local initiallization    objname=information
		login=new NeoStocks2Loginpage(driver);
		pass=new NeoStocks3Passwordpage(driver);
		ok=new NeoStocks4PopupPage(driver);
		home=new NeoStocks5Homepage(driver);

	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Thread.sleep(2000);
		start.ClickNeoStocks1Startpagelogin();
		Thread.sleep(2000);
		login.InputNeoStocks2LoginpageMobileNo(UtilityClass.PropertyFile("UN")); //fetch from utility class
		Thread.sleep(2000);
		login.ClickNeoStocks2LoginpageSigninbutton();
		Thread.sleep(2000);
		pass.InputNeoStocks3PasswordpagePassword(UtilityClass.PropertyFile("PASS"));
		Thread.sleep(2000);
		pass.ClickNeoStocks3PasswordpageSubmitButton();
		Thread.sleep(2000);
		ok.clickNeoStocks4PopupPageOK();
		Thread.sleep(2000);
		
	}
	
	@Test  //DATA comes from EXECL sheet in TC
	public void VerifyUserID() throws EncryptedDocumentException, IOException 
	{
		TCID=101;
		String ActID = home.NeoStocks5HomepageUserID();
		String ExpID = UtilityClass.EXECLcode(0, 2);
		
		Assert.assertEquals(ActID, ExpID,"both result different");
		//home.inputNeoStocks5HomepageUserID(exel.getRow(0).getCell(2).getStringCellValue());
	}
	
	@AfterMethod
	public void Logout(ITestResult s1) throws IOException
	{
		
		//to capture SS of failed TC
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.screenshot(driver,TCID);
		}
		
		
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();	
	}
	
}
