package Tutorial_Points;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables extends Common_Method {
public static void main(String[] args) throws InterruptedException {
	try {
	url("https://www.tutorialspoint.com/selenium/practice/webtables.php");
	//WebElement text1 = find("//div[@class=\"bd-example table-responsive\"]/table//tbody[1]/tr[1]/td[1]");
	
	String text = dr.findElement(By.xpath("//div[@class=\"bd-example table-responsive\"]/table//tbody[1]/tr[1]/td[1]")).getText();
	System.out.println(text);
	s(3000);
	WebElement edit = find("//div[@class=\"bd-example table-responsive\"]/table//tbody[1]/tr[1]/td[7]/a[@class=\"edit-wrap\"]");
	edit.click();
	
	WebElement name = find("//*[@id=\"firstname\"]");
	name.sendKeys("Terminator");
	
	WebElement submit = find("//*[@id=\"RegisterForm\"]/div[2]/input");
	submit.click();
	s(10000);
	dr.quit();
	}catch(Exception e) {
	s(10000);
	dr.quit();
	}
	}
}
