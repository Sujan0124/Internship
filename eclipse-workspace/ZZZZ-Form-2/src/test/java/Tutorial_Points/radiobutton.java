package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class radiobutton extends Common_Method {

	public static void main (String[] args) {
		url("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		WebElement radio1 = find("/html/body/main/div/div/div[2]/form/div[1]/input");
		radio1.click();
		
	}
}
