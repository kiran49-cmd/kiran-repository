package Execution;

import java.io.IOException;

import GenericClass.AllActions;

public class TC_01 extends AllActions
{
	public static void main(String[] args) throws IOException
	{
		Browser_Initialization("Chrome","https://testautomationpractice.blogspot.com/");
		
		SendKeysInToTextBox(Name(), "kiran");
		SendKeysInToTextBox(Email(), "kiran@gmail.com");
		SendKeysInToTextBox(Phone(), "9912323786");
		SendKeysInToTextBox(Address(), "Hyderabad");
//			
//		RadioButton(RadioButtons(),"male");
//		
//		Checkbox(Checkboxes(),"friday");		
		
//		DropDownSelectByIndex(Dropdown(), 3);
//		DropDownSelect(Dropdown(),"india");	
		
//		DragAndDrop(getdrag(), getdrop(), dragdrop());
		
		

		
	}
	
	
//	 
	
}
	