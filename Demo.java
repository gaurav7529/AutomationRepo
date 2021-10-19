import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) {
		try {
		//set property contains two argumant 'key','property'
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gaurav Sharma\\eclipse-workspace\\Introduction\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.findElementByXPath("//button[text()='Allow All Cookies']").click();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@id='email']").sendKeys("gaurav.link90@gmail.com");
		driver.findElementByXPath("//input[@id='pass']").sendKeys("gaurav");
		
		System.out.println(driver.getCurrentUrl());//Validate If you are landed to correct url
		System.out.println(driver.getPageSource());//Print the page source
		driver.quit();
		}catch(Exception e) 
		{
		System.out.println(e.getMessage());
			
		}
		

	}
}


