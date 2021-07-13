package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pages.Add_category;


public class Add_category_testing  {

	WebDriver driver;
	Add_category category;
	
	@Test
	@Parameters({"category_value"})
	
	public void add_category_testing (String addcategory) throws Throwable {
		
	driver = Browserfactory.openBrowser();	
		
	 category = PageFactory.initElements(driver, Add_category.class);
	
	 category.add_category_field(addcategory);
	 category.add_category_button();
	 category.takescreenshhot();
	
		
	driver = Browserfactory.closeBrowser();
	}
	

}
