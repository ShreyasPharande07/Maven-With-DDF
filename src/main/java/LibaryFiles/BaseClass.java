package LibaryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
@SuppressWarnings("deprecation")
public void InitiallizeBrowser() throws IOException 
{
	driver=new ChromeDriver();
	driver.get(UtilityClass.PropertyFile("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}
