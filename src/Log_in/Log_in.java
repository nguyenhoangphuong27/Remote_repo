package Log_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log_in {
	public static void Log_In(String username,String password) {
		
	WebDriver firefox = new FirefoxDriver();
	
	firefox.get("http://toolsqa.com/automation-practice-form/");
	firefox.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys(username);;
	firefox.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys(password);;
}
	
	public void find_dish(){
		WebDriver firefox = new FirefoxDriver();
		firefox.findElement(By.xpath("l/li[3]/a")).click();
		firefox.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451955160']/span")).click();
	}
		
	}

