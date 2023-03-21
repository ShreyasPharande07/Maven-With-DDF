package NeoStocksLOGIN;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStocks2Loginpage 
{
	//variable declare
@FindBy(xpath="//input[@name='ctl00$MainContent$signinsignup$txt_mobilenumber']") private WebElement mobileNo;
@FindBy(xpath="//a[@id='lnk_signup1']") private WebElement signin1button;

     //variable initialize
public  NeoStocks2Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

      //variable usage
public void InputNeoStocks2LoginpageMobileNo(String MN)
{
	mobileNo.sendKeys(MN);
}
public void ClickNeoStocks2LoginpageSigninbutton()
{
	signin1button.click();
}
}
