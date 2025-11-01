package Practice;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Form3 {
	static WebDriver driver;
	public static void fullname(String firstname,String lastname) {
		WebElement frstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		frstname.sendKeys(firstname);
		
		WebElement lstname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lstname.sendKeys(lastname);
		
	}
	public static void hobbies() {
		
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]")).click();
		
	}
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		fullname("randomName","\"Test\"");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		WebElement email=driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
		email.sendKeys("randomNameexample@gmail.com");
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
		radio.click();
		
		WebElement phn = driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
		phn.sendKeys("9876543210");
		
		WebElement DOB = driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
		DOB.click();
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]/option[@value=\"0\"]")).click();
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]/option[@value=\"2001\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"react-datepicker__day react-datepicker__day--001\"]")).click();
		
//		WebElement Sub = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div"));
//		Sub.sendKeys("M");
//		Select s =(Select) driver;
//		s.selectByContainsVisibleText("Maths");
		
		hobbies();
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
		Address .sendKeys("456 Sample Street");
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.quit();
	}
}

