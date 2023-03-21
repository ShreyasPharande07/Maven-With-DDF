package NeoStocksLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStocks5Homepage {
	//variable declare
	@FindBy(xpath="//span[text()='Hi  ']")private WebElement UserIDcompare ;
	
	//variable initlize
	public NeoStocks5Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String NeoStocks5HomepageUserID() 
	{
		String ActualID = UserIDcompare.getText();
		return ActualID;  //imp
	}
	//variable usage
//	public void inputNeoStocks5HomepageUserID(String EXPun)
//	{
//		String ActId = UserIDcompare.getText();
//		
//		if(ActId.contains(EXPun))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
	}

