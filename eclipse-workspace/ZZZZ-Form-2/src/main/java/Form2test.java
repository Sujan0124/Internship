import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Form2test {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");
		  	
	        WebDriver driver = new EdgeDriver();
	        //JavascriptExecutor js = (JavascriptExecutor) driver;
	        driver.manage().window().maximize();
	        driver.get("https://forms.office.com/pages/responsepage.aspx?id=YmxbZhBzOU2auzKgy8O5D8sFEJIo67VBhgHuGitWBJ5UMEs5NkhSWEFPSE1PMFdOV0Q4U0pHSUtOTi4u&route=shorturl");
	        
	        WebElement Feedback_Text = driver.findElement(By.xpath("//div[@class=\"-a-62 lrp-text-container\"]//input"));
	        Feedback_Text.sendKeys("Lebron James");
	        
	        WebElement Rating = driver.findElement(By.xpath("//div[@class=\"-a-83\"]/div[4]//label/span"));
	        Rating.click();
	        
	        WebElement Date = driver.findElement(By.xpath("//div[@class=\"ms-TextField-fieldGroup fieldGroup-270\"]/input"));
	        Date.sendKeys("12/08/2020");
	        
	        
	        
	        WebElement Submit = driver.findElement(By.xpath("//*[@id=\"form-main-content1\"]/div/div/div[2]/div[3]/div/button"));
	        Submit.click();
	        
	        Thread.sleep(5000);
	        driver.quit();
	}
}


