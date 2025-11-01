package Tutorial_Points;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Common_Method {

     static WebDriver dr;
    static WebDriverWait wt;
    static JavascriptExecutor js;

    public static void url(String URL) {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\msedgedriver.exe");

        dr = new EdgeDriver();
        dr.manage().window().maximize();
        dr.get(URL);

       js= (JavascriptExecutor)dr;
        wt = new WebDriverWait(dr, Duration.ofSeconds(10));
    }
	public static WebElement find(String xpath) {
		return dr.findElement(By.xpath(xpath));
	}
	public static void q(){
		dr.quit();
	}
	public static void s(int num) throws InterruptedException {
		Thread.sleep(num);
	}
	public static void ss(String name) {
	    try {
	        TakesScreenshot ts = (TakesScreenshot) dr;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("C:\\Users\\sujan\\eclipse-workspace\\ZZZZ-Form-1\\Screenshots"+ name + ".png");
	        Files.copy(src.toPath(), dest.toPath());
	        System.out.println("Screenshot captured: " + dest.getAbsolutePath());
	    } catch (Exception e) {
	        System.out.println("Screenshot failed: " + e.getMessage());
	    }
	}

		
}
