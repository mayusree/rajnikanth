package functions;

import mainFunction.UtilPage;
import xPath.HomePageXPath;
import xPath.PracticePageXPath;

public class HomePageFunction extends UtilPage{
	
	HomePageXPath hp = new HomePageXPath();	
	
	public void clickPracticeButton() {
		
		clickElement(hp.practiceButton);
	}
	
	

}
