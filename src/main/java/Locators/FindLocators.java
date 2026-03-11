package Locators;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseClass.BaseA;

public class FindLocators extends BaseA
{
	
	public static By Enter_Name = By.xpath("//input[@id='name']");
	public static By Enter_Email = By.xpath("//input[@id='email']");
	public static By Enter_Phonenumber = By.xpath("//input[@id='phone']");
	public static By Enter_Address = By.xpath("//textarea[@id='textarea']");
	
	public static By Rbuttons = By.xpath("//input[@type='radio']");
	
	public static By DragDropContainer = By.xpath("//h2[text()='Drag and Drop']");
    public static By Drag = By.xpath("//div[@id='draggable']");
	public static By Drop = By.xpath("//div[@id='droppable']");
	
	public static By CheckBox = By.xpath("//div[@id='post-body-1307673142697428135']//div//input[@type='checkbox']");
	
	public static By Dropdown = By.xpath("//select[@id='country']");

	
//*****************************************************************************	
	public static WebElement Name()
	{
		return driver.findElement(Enter_Name);
	}
	public static WebElement Email()
	{
		return driver.findElement(Enter_Email);
	}
	public static WebElement Phone()
	{
		return driver.findElement(Enter_Phonenumber);
	}
	public static WebElement Address()
	{
		return driver.findElement(Enter_Address);
	}
//*****************************************************************************		
	public static List<WebElement> RadioButtons()
	{
		List<WebElement> allRadioButtons = driver.findElements(Rbuttons);
		return allRadioButtons;
	}
//*****************************************************************************
	public static List<WebElement> Checkboxes()
	{
		List<WebElement> allChekBoxes = driver.findElements(CheckBox);
		return allChekBoxes;
	}
		
//*****************************************************************************	
	public static WebElement Dropdown()
	{
		return driver.findElement(Dropdown);
	}
//*****************************************************************************	
	public static WebElement dragdrop()
	{
		return driver.findElement(DragDropContainer);
	}
	public static WebElement getdrag()
	{
		return driver.findElement(Drag);
	}
	
	public static WebElement getdrop()
	{
		return driver.findElement(Drop);
	}
	
	
	

	
	
	

	public static String captureScreenShot() throws IOException 
	{	
		TakesScreenshot tc=(TakesScreenshot)driver;
		//we are Takescreenshot as interface and upcasting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
				
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	

}
