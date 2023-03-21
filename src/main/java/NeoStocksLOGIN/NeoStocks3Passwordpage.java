package NeoStocksLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStocks3Passwordpage 
{
	//variable declare
@FindBy(xpath="//input[@name='ctl00$MainContent$_wp_enteraccesspin$txt_accesspin']") private WebElement password;
@FindBy(xpath="//a[@id='lnk_submitaccesspin']") private WebElement submitbutton;

    //variable initialize
public NeoStocks3Passwordpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

    //variable usage
public void InputNeoStocks3PasswordpagePassword(String PW)
{
	password.sendKeys(PW);
}

public void ClickNeoStocks3PasswordpageSubmitButton()
{
	submitbutton.click();
}
}