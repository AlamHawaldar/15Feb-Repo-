package VelocityPOM_TESTclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMclass 
{
   WebDriver driver;
   
  
	@FindBy(xpath="(//a[text()='Courses'])[2]")
	WebElement Cources;
	
	
	public void ClickCourcess()
	{
		Cources.click();
	}
	
	
	public HomePOMclass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	
}
