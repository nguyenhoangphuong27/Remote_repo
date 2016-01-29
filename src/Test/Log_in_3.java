package Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Log_in.Log_in;

public class Log_in_3 {
	private static WebDriver firefox =null;
	
	@Before
	
	public void Setup(){
		firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@Test(timeout = 40000)
	public void test() {
		Log_in.Log_In("Phuong", "abc123");
	}

	
	@After
	public void Teardown(){
		firefox.close();
		firefox.quit();
	}
}
