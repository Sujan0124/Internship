package Tutorial_Points;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mphasis_GeeksforGeeks extends Common_Method {

    public static void main(String[] args) throws InterruptedException {

        try {
            System.setProperty("webdriver.edge.driver","C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");

            dr = new EdgeDriver ();
            dr.manage().window().maximize();
            dr.get("https://www.geeksforgeeks.org/");
            WebDriverWait wt =  new WebDriverWait(dr,Duration.ofSeconds(10)); 
            WebElement  login = dr.findElement(By .xpath("//div[@style=\"min-width: 73px;\"]/button"));
            login.click();
            
            
            WebElement username = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username or Email\"]")
            		));
            		
            username.sendKeys("invalidUsername");

            WebElement Pass = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter password\"]")
            		));
            Pass.sendKeys("wrong_pass");

            WebElement submit = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"notSocialLoginBtnText\"]")
            		));
            submit.click();
            
            s(2000);
            String errcon =wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"alert alert-danger\"]")
            		)).getText();
            System.out.println(errcon);
            s(5000);
            dr.quit();
        } catch(Exception e) {
            s(10000);
        }
    }
}
