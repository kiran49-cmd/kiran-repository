package Practice;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01
{
	public static WebDriver driver;
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
	      driver = new ChromeDriver();
	      driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
	      WebElement from = driver.findElement(By.xpath("//input[@name='source']"));
	      
	      from.sendKeys("HYDERABAD", Keys.TAB);
	      
	     WebElement To = driver.findElement(By.xpath("//input[@name='destination']"));
	      
//	      List<WebElement> To = driver.findElements(By.xpath("//input[@name='destination']//ul//a"));
//	      System.out.println(To.size());
	      
	      
	      To.sendKeys("Chennai", Keys.TAB);
	      
	      driver.findElement(By.xpath("//input[@id='txtJourneyDate']")).click();
	     List<WebElement> date1 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//td"));
	    System.out.println(date1.size());
	    for(WebElement d:date1)
      	{
	    	try
	    	{
			if(d.getText().equals("4"))
			{
				d.click();
			}	
	    }
      	
	    catch(Exception e)
	    {
	    	e.getMessage();
	    }
      	}
	    
	    driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']")).click();
	    List<WebElement> date2 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//td"));
	    System.out.println(date1.size());
	    for(WebElement d1:date2)
      	{
	    	try
	    	{
			if(d1.getText().equals("10"))
			{
				d1.click();
			}	
	    }
      	
	    catch(Exception e)
	    {
	    	e.getMessage();
	    }
      	}
	    
	    
	    
	    
	    driver.findElement(By.xpath("//input[@type='button']")).click();
//	driver.findElement(By.xpath("//input[@id='txtReturnJourneyDate']")).click();
//	
// List<WebElement> date2 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//td"));

	
	}

}














