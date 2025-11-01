package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class Dynamic_Properties extends Common_Method {

	public static void main(String[] args) throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		WebElement clickme = find("//button[@id=\"colorChange\"]");
		clickme .click();
		
		s(6000);
		WebElement afterclick= find("//button[@id=\"visibleAfter\"]");
		afterclick .click();
		
		s(10000);
		q();
	}

}
