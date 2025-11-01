package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class Modal_Dialogue extends Common_Method{

	public static void main(String[] args) throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/modal-dialogs.php");
		
		WebElement Small_Modal = find("/html/body/main/div/div/div[2]/button[1]");
		Small_Modal.click();
		s(2000);
		
		WebElement ok1 = find("//*[@id=\"exampleModalSm\"]/div/div/div[3]/button");
		ok1.click();
		
		WebElement Large_model = find("//div[@class=\"col-md-8 col-lg-8 col-xl-8\"]/button[2]");
		Large_model.click();
		
		WebElement cancel = find("//*[@id=\"exampleModalLg\"]/div/div/div[1]/button");
		cancel.click();
		
		s(10000);
		q();
	}

}
