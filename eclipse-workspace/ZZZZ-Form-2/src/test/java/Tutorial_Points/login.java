package Tutorial_Points;

import org.openqa.selenium.WebElement;

public class login extends Common_Method  {
	public static void main(String[] args) throws InterruptedException {
		try{url("https://www.tutorialspoint.com/selenium/practice/login.php");
		WebElement Newuser = find("//div[@class=\"mt-2 d-flex justify-content-end\"]/a");
		Newuser .click();
		
		s(3000);
		WebElement Fname = find("//input[@id=\"firstname\"]");
		Fname.sendKeys("John");
		
		WebElement Lname = find("//input[@id=\"lastname\"]");
		Lname.sendKeys("Connor");
		
		WebElement Uname = find("//input[@placeholder=\"UserName\"]");
		Uname.sendKeys("@s_k_y_n_e_t");
		
		WebElement Pass = find("//input[@placeholder=\"Password\"]");
		Pass.sendKeys("**************");
		
		WebElement reg = find("//input[@value=\"Register\"]");
		reg.click();
		s(2000);
		WebElement backto= find("//a[@class=\"btn btn-primary ms-4\"]");
		backto.click();
		
		WebElement uname= find("//input[@placeholder=\"UserName\"]");
		uname.sendKeys("@s_k_y_n_e_t");
		
		WebElement pass = find("//input[@placeholder=\"Password\"]");
		pass.sendKeys("**************");
		
		WebElement login = find("//input[@value=\"Login\"]");
		login.click();
		s(5000);
		q();
		}catch(Exception e) {
			ss("loginError");
			s(10000);
			q();
		}
	}

}
