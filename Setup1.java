package paramaterClassroom;



	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Setup1 {
		
		public static ChromeDriver driver;
        @Parameters({"username","password","url"})
		@BeforeMethod
		public void openBrowser(String Uname, String pwd, String url) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
			driver.findElementById("username").sendKeys(Uname);
			
			driver.findElementById("password").sendKeys(pwd);
			
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
		}
		
		@AfterMethod
		public void Closesetup() {
			
			driver.close();

		}

	}