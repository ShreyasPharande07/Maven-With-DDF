package NeoStocksLOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStocks1Startpage
{
	//1.variable declare as private
	
@FindBy(xpath="//a[text()='Sign In']") private WebElement login;                                                          //private WebElement login=driver.findElement(By.xpath("//a[text()='Sign In']");


    //2.variable initialize as public

public NeoStocks1Startpage(WebDriver driver)                                                                               //int a means datatype variablename   same objectTYPE objectNAME
{
	PageFactory.initElements(driver,this);                                                                                //diffClassname.Methodname(WebdriverObject,this);
	                                                                                                                   //PageFactory is in-build class in which static method is present called as initElements(WebdriverObj,this)
}

     //3.variable Usage as public 

public void ClickNeoStocks1Startpagelogin()
{
	login.click();
}
}

