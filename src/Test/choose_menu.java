package Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class choose_menu {

	
	private static WebDriver firefox =null;
	
	@Before
	void setup(){
		
		FirefoxDriver firefox=new FirefoxDriver();
		
	}
	@After
	public void teardown(){
		firefox.close();
		firefox.quit();
	}
	
}
