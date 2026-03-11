package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import GenericClass.AllActions;
import Locators.FindLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TextStepDefinationfile extends AllActions
{
	@Given("user is on practice web page {string} {string}")
	public static void userisonpracticewebpage(String Browser, String URL) throws IOException
	{
		Browser_Initialization(Browser, URL);
		ExtentCucumberAdapter.addTestStepLog("application is launched successfully");
	}
	
	@When("user enter name in name textbox {string}")
	public static void userentertextininputtextbox(String text) throws IOException
	{
		WebElement ele = driver.findElement(FindLocators.Enter_Name);
		ele.click();
		ele.clear();
		ele.sendKeys(text);
		ExtentCucumberAdapter.addTestStepLog("Name enter successfully");
	}
	@And("user enter email in email textbox {string}")
	public static void userenteremailinemailtextbox(String text)
	{
		WebElement ele = driver.findElement(FindLocators.Enter_Email);
		ele.click();
		ele.clear();
		ele.sendKeys(text);
		ExtentCucumberAdapter.addTestStepLog("Email enter successfully");
	}
	
	@And("user enter phonenumber in phonenumber textbox {string}")
	public static void userenterphonenumberinphonenumbertextbox(String text)
	{
		WebElement ele = driver.findElement(FindLocators.Enter_Phonenumber);
		ele.click();
		ele.clear();
		ele.sendKeys(text);
		ExtentCucumberAdapter.addTestStepLog("Phonenumber enter successfully");
	}
	
	@And("user enter address in address textbox {string}")
	public static void userenteraddressinaddresstextbox(String text)
	{
		WebElement ele = driver.findElement(FindLocators.Enter_Address);
		ele.click();
		ele.clear();
		ele.sendKeys(text);
		ExtentCucumberAdapter.addTestStepLog("Address enter successfully");
	}
	


}
