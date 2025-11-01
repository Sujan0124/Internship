package Tutorial_Points;

import org.openqa.selenium.JavascriptExecutor;

public class Frames extends Common_Method {

	public static void main(String[] args) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) dr;
		url("https://www.tutorialspoint.com/selenium/practice/frames.php");
		try {
			dr.switchTo().frame(1);
			js.executeScript("window.scrollBy(0,500)");
			s(2000);
			js.executeScript("window.scrollBy(0, -500)");
			dr.switchTo().defaultContent();
			
			dr.switchTo().frame(1);
			
			
			q();
		}catch(Exception e) {
			s(10000);
			q();
		}

	}

}
