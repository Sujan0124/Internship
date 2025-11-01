package Tutorial_Points;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Alert extends Common_Method {
    public static void main(String[] args) throws InterruptedException {
        url("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        try {
            WebElement alert = find("//div[@class=\"d-flex justify-content-between\"]/button");
            alert.click();

            WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            dr.switchTo().alert().accept();

            WebElement after5 = find("//div[@class=\"d-flex justify-content-between mt-4\"]/button[@onclick=\"myMessage()\"]");
            after5.click();

            wait.until(ExpectedConditions.alertIsPresent());
            dr.switchTo().alert().accept();
            
            WebElement clickk = find("//button[@onclick=\"myDesk()\"]");
            clickk .click();
            
            wait.until(ExpectedConditions.alertIsPresent());
            dr.switchTo().alert().accept();
            
            WebElement alertsend = find("//button[@onclick=\"myPromp()\"]");
            alertsend.click();
            
            wait.until(ExpectedConditions.alertIsPresent());
            dr.switchTo().alert().sendKeys("Terminator");
            dr.switchTo().alert().accept();
            s(5000);
            q();

        } catch (Exception e) {
            s(10000);
            q();
        }
    }
}
