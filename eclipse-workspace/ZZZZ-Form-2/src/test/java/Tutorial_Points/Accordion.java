package Tutorial_Points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Accordion extends Common_Method {

	public static void main(String[] args) throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/accordion.php");
		
		WebElement first = find("//h2[@id=\"headingTwentyOne\"]/button");
		first.click();
		WebElement gettext = wt.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id=\"collapseTwentyOne\"]//p")));
		gettext .getText();
		
		s(2000);
		String gettext1 = find("//div[@id=\"collapseTwentyOne\"]//p").getText();
		System.out.println(gettext1);
	}

}
