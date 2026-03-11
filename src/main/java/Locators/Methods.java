package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.BaseA;

public class Methods extends BaseA
{

	public static By Enter_Name = By.xpath("//input[@id='name']");
	public static By Enter_Email = By.xpath("//input[@id='email']");
	public static By Enter_Phonenumber = By.xpath("//input[@id='phone']");
	public static By Enter_Address = By.xpath("//textarea[@id='textarea']");
	
//*****************************************************************************	
	
	public static void Name(String text)
	{
		driver.findElement(Enter_Name).sendKeys(text);
	}
	
	
//	public static WebElement Email()
//	{
//		return driver.findElement(Enter_Email);
//	}
//	public static WebElement Phone()
//	{
//		return driver.findElement(Enter_Phonenumber);
//	}
//	public static WebElement Address()
//	{
//		return driver.findElement(Enter_Address);
//	}

}
