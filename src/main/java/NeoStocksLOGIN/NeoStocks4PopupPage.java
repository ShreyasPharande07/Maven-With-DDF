package NeoStocksLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStocks4PopupPage 
{
@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement clickOK;

public NeoStocks4PopupPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickNeoStocks4PopupPageOK()
{
	clickOK.click();
}
}
