package Practice;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiceSelenium {
	static WebDriver driver;

	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try{
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("IQOO Neo 10");
			driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
			js.executeScript("window.scrollBy(0, 500);");
			driver.findElement(By.xpath("//img[@alt=\"iQOO Neo 10 (Inferno Red, 12GB RAM, 256GB Storage) | Snapdragon 8s Gen 4 Processor & SuperComputing Chip Q1 | 7000 mAh Bat...\"]")).click();
			String originalWindow = driver.getWindowHandle();
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			Set<String> windowHandles = driver.getWindowHandles();
            for (String handle : windowHandles) {
                if (!handle.equals(originalWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }
			js.executeScript("window.scrollBy(0,500);");
			driver.findElement(By.xpath("//input[@aria-labelledby=\"size_name_3-announce\"]"));
			driver.navigate().refresh();
			Thread.sleep(10000);
			driver.quit();
		}
		catch(Exception e){
			Thread.sleep(4000);
			driver.quit();
		}
		
	}
}