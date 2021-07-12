package pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class Add_category extends Base_page {
	WebDriver driver;
	
	public Add_category(WebDriver driver) {
		this.driver = driver;
		
	}
	
	@FindBy(how =How.XPATH, using ="//input[@name='categorydata']")WebElement ADD_CATEGORY_FIELD;
	@FindBy(how =How.XPATH, using ="//input[@value='Add category']") WebElement ADD_CATEGORY_BUTTON;
	
	
	
	public void add_category_field(String addcategory)  throws Throwable  {
		
		String entered_category = (addcategory + randomvalue() );
		
		ADD_CATEGORY_FIELD.sendKeys(entered_category);
		Thread.sleep(2000);
	}
	
	
	public void add_category_button() {
		ADD_CATEGORY_BUTTON.click();
	}
	
	public void validation() {
		
	}
	
	
	public void takescreenshhot() throws Throwable {
		Thread.sleep(2000);

		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + label + ".png"));
	}
}
