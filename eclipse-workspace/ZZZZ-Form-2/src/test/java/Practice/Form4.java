package Practice;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Form4 {
static WebDriver driver;

public static void main (String[]args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");
	driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_forms.asp");
	String form_heading= driver.getTitle();
	System.out.println(form_heading);
	WebElement Firstname= driver.findElement(By.xpath("//input[@name=\"firstname\"]")); 
	WebElement Lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	Firstname.clear();
	Lastname .clear();
	Firstname.sendKeys("randomName");
	Lastname.sendKeys("\"Test\"");
	driver.findElement(By.xpath("//*[@id=\"main\"]/form[2]/input[3]")).click();
	}
}
