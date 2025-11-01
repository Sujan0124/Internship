package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class textbox extends Common_Method{
	public static void main(String[] args) {
		url("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		WebElement name = find("//input[@id=\"fullname\"]");
		name.sendKeys("Terminator");
		WebElement email=find("//input[@id=\"email\"]");
		email.sendKeys("Example@gmail.com");
		WebElement Address = find("//textarea[@id=\"address\"]");
		Address.sendKeys("386 Hellborne NewYork");
		WebElement password = find("//input[@id=\"password\"]");
		password .sendKeys("*********");
		WebElement submit = find("//input[@type=\"submit\"]");
		submit.click();
		dr.quit();
	}

}
