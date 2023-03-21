package LibaryFiles;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//@Author Name=Shreyas Shivaji Pharande
	//this method is used to get the test data from exel sheet
	//need to pass 2 inputs- row and col
public static String EXECLcode(int Row,int Col) throws EncryptedDocumentException, IOException 
{
	
	FileInputStream file=new FileInputStream("E:\\eclipse\\NeoStocks_MAVEN\\TestData\\Shreyas.xlsx");
	 Sheet exel = WorkbookFactory.create(file).getSheet("Sheet1");	
	 String value = exel.getRow(Row).getCell(Col).getStringCellValue();
	 return value;  //imp
}

public static void screenshot(WebDriver driver,int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest = new File("E:\\eclipse\\NeoStocks_MAVEN\\failedTCScreenshot\\TCID"+TCID+".jpg");
	 FileHandler.copy(src, dest);
//(TakesScreenshot)driver)=covert webdriver object to takescreenshot interface
//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  =ss saved in local memory 
	
}
public static String PropertyFile(String key) throws IOException 
{
	FileInputStream pf=new FileInputStream("E:\\eclipse\\NeoStocks_MAVEN\\PropertyFiles.properties");
	Properties p=new Properties();
	p.load(pf);
	String value = p.getProperty(key);
	return value;
}
}
