package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class Links extends Common_Method  {
public static void main(String []args) throws InterruptedException {
	url("https://www.tutorialspoint.com/selenium/practice/links.php");
//	WebElement click_home=find("//body[@class=\"text-center\"]//div[@class=\"container\"]/div[@class=\"row d-flex justify-content-center logindiv bg-white rounded\"]//div[@class=\"col-md-8 col-lg-8 col-xl-8\"]/p/a[@href=\"https://www.tutorialspoint.com/index.htm\"]");
//	click_home.click();
//	dr.close();
//	WebElement clickkk = find("/html/body/main/div/div/div[2]/p[2]/a");
//	clickkk.click();
//	dr.close();
	
	WebElement Created = find("//p[@class=\"text-left\"]/a[@onclick=\"shide('create')\"]");
	Created.click();
	
	String message = find("//div[@class=\"create\"]").getText();
	System.out.println(message);
	
	s(4000);
	q();
	}

}
