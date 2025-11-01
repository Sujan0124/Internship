package Tutorial_Points;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseclicks extends Common_Method {

	public static void main(String[] args) throws InterruptedException {
		
		url("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		Actions act = new Actions(dr);
		WebElement rghtclick = find("//div[@class=\"col-md-8 col-lg-8 col-xl-8\"]/button[@onclick=\"showDiv()\"]");
		act.contextClick(rghtclick).perform();
		s(3000);
		WebElement leftclick = find("//div[@class=\"col-md-8 col-lg-8 col-xl-8\"]/button[@onclick=\"fn(event);\"]");
		act.click(leftclick).perform();
		s(3000);
		WebElement dblclick = find("//div[@class=\"col-md-8 col-lg-8 col-xl-8\"]/button[@ondblclick=\"myDoubleclick()\"]");
		act.doubleClick(dblclick).perform();
		s(5000);
		dr.quit();
	}

}
