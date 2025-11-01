package Tutorial_Points;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Broken_Link extends Common_Method{
	public static void repeat(int n) {
		while(n-->0) {
		
		WebElement brokenLink = find("//a[@href=\"broken-link.php\"]");
		brokenLink .click();
		WebElement goback = wt.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[@href=\"broken-links.php\"]")
		));
		goback.click();
		List <Integer> order = new ArrayList<>();
		order.add(n);
		Collections.sort(order);
		System.out.println(order+"th execution done!!");
		}
	}
	public static void main(String[] args) {
		url("https://www.tutorialspoint.com/selenium/practice/broken-links.php");
		repeat(6);
	}
}
