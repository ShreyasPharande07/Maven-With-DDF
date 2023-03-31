package LibaryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	public WebDriver driver;
	public ChromeOptions co;
	
@SuppressWarnings("deprecation")
public void InitiallizeBrowser() throws IOException 
{
	co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);
	driver.get(UtilityClass.PropertyFile("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}
