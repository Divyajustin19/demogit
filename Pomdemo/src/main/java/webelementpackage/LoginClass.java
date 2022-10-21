package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginClass {

	public static WebElement userName(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//input[@type='password'])"));
	}
	public static WebElement login(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	}
	
	
}
