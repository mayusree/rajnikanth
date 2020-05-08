package goibibo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import mainFunction.UtilPage;

public class GoibiboTest extends UtilPage{
	
	String fromTextXPath = "//input[@id = 'gosuggest_inputSrc']";
	String listResultXPath = "//ul[@id = 'react-autosuggest-1']";
	
	@Test
	public void partialTextSelect () {
		
		
		openBrowser2("chrome");
		sendText(fromTextXPath, "Jap");		
		String listResult = driver.findElement(By.xpath(fromTextXPath)).getAttribute("value");
		
				
		System.out.println(listResult);
		
		
	}
	

}
