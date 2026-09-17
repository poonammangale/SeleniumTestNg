package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {		
	// access the file
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");	
	//read data from file
	prop=new Properties();
	prop.load(fis);
	String BrowserName = prop.getProperty("browser");
	if(BrowserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver(); 
		
	}
	else if(BrowserName.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver(); 
		
	}
	else{
		System.out.println("please enter valid browser name");
	}
	
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		initializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.quit();
		
	}
}

