package practisecommands;

import org.openqa.selenium.remote.DesiredCapabilities;
import  org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;

public class SauceLabsDemo {
	public static final String USERNAME = "Sumareddyt";
	  public static final String ACCESS_KEY = "238b116e-0d77-4207-b9d1-a6c15be01aae";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	  //created an account in saucelabs and get the username and access key from account/user settings
	  
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");

		
		//WebDriver driver = new ChromeDriver();====>this is for working on local machine
	//for working on cloud connect to sauce labs account
		
		WebDriver driver = new RemoteWebDriver(new URL(URL) ,caps);
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}
