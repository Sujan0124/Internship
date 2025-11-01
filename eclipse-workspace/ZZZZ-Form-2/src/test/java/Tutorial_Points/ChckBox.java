package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class ChckBox extends Common_Method{
	public static void main(String[] args) throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		WebElement  Mainbox1 = find("//div[@class=\"tree_main\"]/ul/li[@id=\"bs_1\"]/input[@type=\"checkbox\"]");
		Mainbox1 .click();
		
		Thread.sleep(2000);
		
		WebElement expand1 = find("//*[@id=\"bs_1\"]/span[1]");
		expand1.click();
		
		WebElement Subbox1_1 = find("//ul[@id=\"bs_l_1\"]/li/input[@id=\"c_bf_1\"]");
		Subbox1_1 .click();
		
		WebElement Subbox2_1 = find("//ul[@id=\"bs_l_1\"]/li/input[@id=\"c_bf_2\"]");
		Subbox2_1.click();
		
		WebElement Mainbox2 = find("//div[@class=\"tree_main\"]/ul/li[@id=\"bs_2\"]/input[@type=\"checkbox\"]");
		Mainbox2.click();
		
		Thread.sleep(2000);
		
		WebElement expand2 = find("//*[@id=\"bs_2\"]/span[1]");
		expand2.click();
		
		WebElement Subbox1_2 = find("//ul[@id=\"bs_l_2\"]/li/input[@id=\"c_bf_3\"]");
		Subbox1_2.click();
		
		WebElement Subbox2_2 = find("//ul[@id=\"bs_l_2\"]/li/input[@id=\"c_bf_4\"]");
		Subbox2_2.click();
		
		q();
		}
}
