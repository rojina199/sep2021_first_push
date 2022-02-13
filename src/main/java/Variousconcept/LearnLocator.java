package Variousconcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe" );
	 driver =new ChromeDriver();
	driver.get("http://objectspy.space/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testlocator() {
	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	//driver.findElement(By.partialLinkText("TF-API")).click();
	driver.findElement(By.cssSelector("input#sex-1")).click();
	//Relative xpath
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("abc");
	//relative,multiple xpath
	//driver.findElement(By.xpath("//input[@type='text' and @ name='firstname']")).sendKeys("Rojina");
	
	driver.findElement(By.xpath("//strong[text() ='Link Test : New Page']")).click();
	//driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[7]/input")).sendkeys();
	// xpath by using multiple method
	driver.findElement(By.xpath("//input[@type='text' and@ name='firstname']")).sendKeys("abvdft");
	//xpath for links by text method
	driver.findElement(By.xpath("// strong[text()='Link Test : New Page']")).click();
	//by contain method xpath for links
	driver.findElement(By.xpath("// strong[contains(text(),'Link Test : New Page')]")).click();
	
	
	
	
	
	}
	
	
	
	}