package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseA
{
	
//	public static String Browser= "Chrome";
//	public static String URL= "https://www.facebook.com";
	
	public static WebDriver driver;

	public static void Browser_Initialization(String Browser, String URL)
	{
		WebDriverManager.chromedriver().setup();
		
		switch(Browser)
		{
		case "Chrome":
		{
		   driver = new ChromeDriver();		
	       driver.get(URL);	
	       driver.manage().window().maximize();
	       break;
		}
		case "Edge":
		{
			driver = new EdgeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			break;
		}			
		case "Firefox":
		{
			driver = new FirefoxDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			break;
		}
		case "IE":
		{
			driver = new InternetExplorerDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			break;
		}
		}	
	}
	
	public static void Browser_Close()
	{
		driver.close();
	}
}
