import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form1test {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://forms.office.com/pages/responsepage.aspx?id=YmxbZhBzOU2auzKgy8O5D8sFEJIo67VBhgHuGitWBJ5URFFSUjBVSkg3WkdFR0hRNzM3OUQwTTA0RC4u&route=shorturl");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        try {
            WebElement Name = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Enter your answer']")));
            Name.sendKeys("Subbaiah");
            System.out.println("✅ Name field filled successfully");
        } catch (Exception e) {
            System.out.println("❌ Failed at Name field: " + e.getMessage());
        }

        try {
            WebElement Age = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Number must be between 18 ~ 60']")));
            Age.sendKeys("20");
            System.out.println("✅ Age field filled successfully");
        } catch (Exception e) {
            System.out.println("❌ Failed at Age field: " + e.getMessage());
        }
        try {
        	WebElement Date= wait.until(ExpectedConditions.visibilityOfElementLocated(
        				By.xpath("//div[@class=\"ms-TextField-wrapper\"]//input")));
        	Date.sendKeys("08/15/2020");
        	System.out.println("✅ Date field filled successfully");
        }catch(Exception e){
        	System.out.println("❌ Failed at Date field: " + e.getMessage());
        }
        //driver.quit();
        
    }
}
