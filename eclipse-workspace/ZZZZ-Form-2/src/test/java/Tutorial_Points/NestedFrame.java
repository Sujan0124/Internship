package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class NestedFrame extends Common_Method  {

	public static void main(String[] args) {
		url("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		
		dr.switchTo().frame(0);
		WebElement link = find("/html/body/div/header/div[3]/a");
		link.click();
		
		dr.quit();

	}

}
