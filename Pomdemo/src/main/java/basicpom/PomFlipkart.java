package basicpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webelementpackage.LoginClass;

public class PomFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//Users//revantha//Downloads//chromedriver-3");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		//LoginClass  flip = new LoginClass ();
	LoginClass.userName(driver).sendKeys("9025445405");
	LoginClass.password(driver).sendKeys("Apple@6s");
	LoginClass.login(driver).click();
	}
}
