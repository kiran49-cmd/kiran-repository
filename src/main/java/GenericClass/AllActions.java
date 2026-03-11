package GenericClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Locators.FindLocators;

public class AllActions extends FindLocators
{
	public void ExplicitWaitForElement(WebElement ele, long time)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
//*****************************************************************************************
	public static void ScrollToView(WebElement scroll)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
//		js.executeScript("aruguments[0].click();", scroll);
	}
//*****************************************************************************************	
	public static void SendKeysInToTextBox(WebElement ele, String text) throws IOException
	{
		ele.click();
		ele.clear();
		ele.sendKeys(text);		
	}
	
//***********************************************************************************	******
	public static void RadioButton(List<WebElement> ele, String text)
	{	
		System.out.println("Count of radio buttons: "+ele.size());
			
		for(WebElement allbuttons:ele)
		{
//			System.out.println(allbuttons.getAttribute("value"));
			if(allbuttons.getAttribute("value").equalsIgnoreCase(text) && !allbuttons.isSelected())
			{	
				allbuttons.click();
				
				System.out.println("The given text "+text+" radio button is selected: "+allbuttons.isSelected());	
				break;
			}		
		}		
	}
	
//*******************************************************************************************		
   public static void Checkbox(List<WebElement> ele, String text)
   {
	   System.out.println("Count of CheckBoxes: "+ ele.size());
	   for(WebElement boxes : ele)
	   {
//		   System.out.println(boxes.getAttribute("value"));
		   if(boxes.getAttribute("value").equalsIgnoreCase(text) && !boxes.isSelected() && boxes.isDisplayed())
		   {
			   boxes.click();
			   
			   System.out.println("The given text "+text+" Checkbox is selected: "+ boxes.isSelected());	
			}
	   }   
   }
//*******************************************************************************************
	   public static void DropDownSelectByIndex(WebElement ele, int index)
	    {
	    	   Select sel = new Select(ele);
	    	   sel.selectByIndex(index);
	    }
	    public static void DropDownSelectByValue(WebElement ele, String value)
	    {
	    	   Select sel = new Select(ele);
	    	   sel.selectByValue(value);
	    }
	    public static void DropDownSelectByVisibleText(WebElement ele, String value)
	    {
	    	   Select sel = new Select(ele);
	    	   sel.selectByValue(value);
	    }
	//***************************************************************************//    
	    public static void DropDownSelect(WebElement ele,String text)
	    {
	       Select sel = new Select(ele);
	    	   List<WebElement> dropdown = sel.getOptions();
	    	   System.out.println("Count of Dropdowns: "+ dropdown.size());
	    	   for(WebElement option : dropdown)
	    	   {
//	    		   System.out.println(option.getText());
	    		   if(option.getText().equalsIgnoreCase(text) && option.isDisplayed() && !option.isSelected())
	    		   {
	    			   option.click();
	    			   System.out.println("The given text "+text+" Dropdown is selected: "+ option.isSelected());
	    		   }
	    			   
	    	   }
	    }
//*******************************************************************************************	    
		public static void DragAndDrop(WebElement Source, WebElement Destination, WebElement ele)
		{
			Actions act = new Actions(driver);
			ScrollToView(ele);
			act.dragAndDrop(Source, Destination).build().perform();
		} 
//*******************************************************************************************			
}
