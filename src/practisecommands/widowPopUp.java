package practisecommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pandu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//for regular webbased application
		//driver.get("https://the-internet.herokuapp.com/");
		
		//for windowpopup we need to follow thebelow syntax
		//http://username:password@siteurl
		//http://admin:admin@the-internet.herokuapp.com/
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
		
		
		

	}

}
