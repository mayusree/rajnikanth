package testNGTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import mainFunction.UtilPage;
import xPath.HomePageXPath;
import xPath.PracticePageXPath;

public class Test5 extends UtilPage{
	PracticePageXPath pp = new PracticePageXPath();
	HomePageXPath hp = new HomePageXPath();
	
	@Test
	public void test() {
		
		openBrowser("chrome");
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isDisplayed());
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isEnabled());
		System.out.println(driver.findElement(By.xpath(hp.practiceButton)).isSelected());
		
	}
	
	
}
