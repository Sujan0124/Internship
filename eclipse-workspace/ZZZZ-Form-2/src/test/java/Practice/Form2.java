package Practice;import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Form2 {
	static WebDriver driver;
	static JavascriptExecutor js = (JavascriptExecutor) driver;
    public static void main(String[] args) {
    	
        System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        try {
            driver.get("https://forms.office.com/pages/responsepage.aspx?id=YmxbZhBzOU2auzKgy8O5D8sFEJIo67VBhgHuGitWBJ5UMEs5NkhSWEFPSE1PMFdOV0Q4U0pHSUtOTi4u&route=shorturl");
            
            // Step 1: Name field
            try {
                WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Enter your answer\"]"));
                name.sendKeys("It was good and nice experiance over-all");
            } catch (Exception e) {
                WebElement name = driver.findElement(By.xpath("//input[@placeholder=\"Enter your answer\"]"));
                captureScreenshotWithHighlight(driver, name);
                throw e;
            }
            
            // Step 2: Rating
            try {
                WebElement rating = driver.findElement(By.xpath("//span[@aria-label=\"4 Star\"]"));
                rating.click();
            } catch (Exception e) {
                WebElement rating = driver.findElement(By.xpath("//span[@aria-label=\"4 Star\"]"));
                captureScreenshotWithHighlight(driver, rating);
                throw e;
            }
            
            // Step 3: Date of Experience (Submit button)
            try {
            	js.executeScript("window.scroll(0,500);");
                WebElement DateofExp = driver.findElement(By.xpath("//button[@data-automation-id=\"submitButton\"]"));
                DateofExp.sendKeys("12/13/3121");
            } catch (Exception e) {
            	js.executeScript("window.scroll(0,500);");
                WebElement DateofExp = driver.findElement(By.xpath("//button[@data-automation-id=\"submitButton\"]"));
                captureScreenshotWithHighlight(driver, DateofExp);
                throw e;
            }
        
            String Title = driver.getTitle();
            System.out.println(Title);
      
            String CurrentURL = driver.getCurrentUrl();
            System.out.println(CurrentURL);
            
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
        
        driver.quit();
    }
    
    public static void captureScreenshotWithHighlight(WebDriver driver, WebElement element) {
        try {
            // Highlight the element with red border using JavaScript
            if (element != null) {
                
                js.executeScript("arguments[0].style.border='5px solid red'", element);
                js.executeScript("arguments[0].style.backgroundColor='rgba(255, 0, 0, 0.2)'", element);
            }
            
            // Small delay to ensure highlight is visible
            Thread.sleep(500);
            
            // Take screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\Screenshots\\error.png");
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
            System.out.println("Screenshot saved with error highlighted at: " + dest.getAbsolutePath());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}