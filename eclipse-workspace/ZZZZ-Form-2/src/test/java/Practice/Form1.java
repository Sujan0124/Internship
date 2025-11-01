package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Form1 {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://forms.office.com/pages/responsepage.aspx?id=YmxbZhBzOU2auzKgy8O5D8sFEJIo67VBhgHuGitWBJ5URFFSUjBVSkg3WkdFR0hRNzM3OUQwTTA0RC4u&route=shorturl");
        
        WebElement Name = driver.findElement(By.xpath("//input[@placeholder=\"Enter your answer\"]"));
        Name.sendKeys("Terminator");
        
        WebElement Age = driver.findElement(By.xpath("//input[@placeholder=\"Number must be between 18 ~ 60\"]"));
        Age.sendKeys("59");
        
        WebElement date = driver.findElement(By.xpath("//input[@id=\"DatePicker0-label\"]"));
        date.sendKeys("12/12/2050");
        
        WebElement Submit = driver.findElement(By.xpath("//button[@data-automation-id=\"submitButton\"]"));
        Submit.click();
        
        String title = driver.getTitle();
        System.out.println("Page title is: "+title);
        
        String CurrURL = driver.getCurrentUrl();
        System.out.println(CurrURL);
	}
}
