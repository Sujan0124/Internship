import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DupForm {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://forms.office.com/pages/responsepage.aspx?id=YmxbZhBzOU2auzKgy8O5D8sFEJIo67VBhgHuGitWBJ5URFFSUjBVSkg3WkdFR0hRNzM3OUQwTTA0RC4u&route=shorturl");
        WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Enter your answer']"));
            Name.sendKeys("Subbaiah");
            System.out.println("Name field filled successfully");
        

        WebElement Age = driver.findElement(By.xpath("//input[@placeholder='Number must be between 18 ~ 60']"));
            Age.sendKeys("20");
            System.out.println("Age field filled successfully");
        
        WebElement Date=driver.findElement(By.xpath("//div[@class=\"ms-TextField-wrapper\"]//input"));
        	Date.sendKeys("08/15/2020");
        	System.out.println("Date field filled successfully");
            
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form-main-content1\"]/div/div/div[2]/div[3]/div/button"));
        submit.click();
        
        Thread.sleep(3000);
        
        driver.quit();
        
	}     
    }
    
