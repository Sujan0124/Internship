package Tutorial_Points;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Practice_Form extends Common_Method {
	public static void main(String []args) throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		try {
		WebElement fname = find("//input[@placeholder=\"First Name\"]");
		fname.sendKeys("John");
		WebElement lname = find("//input[@placeholder=\"name@example.com\"]");
		lname.sendKeys("Connor@example.com");
		WebElement gender= find("//div[@class=\"mb-3 row\"][3]//div[@class=\"col-sm-9\"]//div[@class=\"d-flex justify-content-start align-center\"]/div[@class=\"col-sm-3 text-left\"][1]/input");
		gender .click();
		WebElement mobile = find("//input[@placeholder=\"Enter Mobile Number\"]");
		mobile .sendKeys("9876543210");
		WebElement dateofbirth = find("//input[@id=\"dob\"]");
		dateofbirth .sendKeys("12122050");
		WebElement subjects = find("//input[@id=\"subjects\"]");
		subjects.sendKeys("Science, AI, Biology");
		WebElement Hobbies = find("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input");
		Hobbies .click();
		WebElement currentadd= find("//textarea[@placeholder=\"Currend Address\"]");
		currentadd.sendKeys("365 Hellbohosada NYC");
		WebElement state= find("//div[@class=\"col-sm-6\"]/select[@name=\"state\"]");
		Select s1 = new Select(state);
		s1.selectByContainsVisibleText("NCR");
		WebElement city = find("//*[@id=\"city\"]");
		Select s2 = new Select(city);
		s2.selectByContainsVisibleText("Agra");
		
		s(5000);
		q();
		}
		catch(Exception e) {
			s(10000);
			q();
		}
	}
}
