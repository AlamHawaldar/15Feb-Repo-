package VelocityPOM_TESTclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01__OpenVCTCwebsite 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver",
			"E:\\Driver File\\chrom&geckodriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is maximize");
	
	driver.get("https://vctcpune.com/");
	System.out.println("Url is open");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	HomePOMclass hp = new HomePOMclass(driver);
	
	hp.ClickCourcess();
	System.out.println("Cources page is open");
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	

}
}
