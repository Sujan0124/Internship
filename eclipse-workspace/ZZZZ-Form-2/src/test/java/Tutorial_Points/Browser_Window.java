package Tutorial_Points;

import java.util.Set;

import org.openqa.selenium.WebElement;

public class Browser_Window extends Common_Method {

	public static void NewTab() {
		url("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
	    
	    try {

	        String parent = dr.getWindowHandle();

	        WebElement  newwindow = find("//button[@onclick=\"window.open('new-tab-sample.php', '_blank')\"]");
	        newwindow.click();

	        s(2000);

	        Set <String> allWindows = dr.getWindowHandles();

	        for (String win : allWindows) {
	            if (!win.equals(parent)) {
	                dr.switchTo().window(win);
	                System.out.println("Switched to CHILD window");
	            }
	        }

	        dr.close();

	        dr.switchTo().window(parent);

	        q();

	    } catch (Exception e) {
	        ss("windowError");
	        q();
	    }
	}
	
	public static void NewWindow() throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		try {
			String parent = dr.getWindowHandle();
			WebElement clicknew = find("//button[@onclick=\"PopupCenter('new-window.php','xtf','900','500');\"]");
			clicknew .click();
			
			Set<String>windowsss = dr.getWindowHandles();
			for(String win:windowsss) {
				if(!win.equals(parent)) {
					dr.switchTo().window(win);
					System.out.println("Switched to Chilc Window");
				}
			}
			dr.manage().window().maximize();
			System.out.println("Maximised the child window");
			String title = dr.getTitle();
			System.out.println(title);
			s(5000);
			q();
		}catch(Exception e) {
			s(10000);
			q();
		}	
	}
	public static void newwinMessage() throws InterruptedException {
		url("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		try{
		WebElement newmsg = find("//button[@onclick=\"PopupCenter('new-tab-message.php','xtf','900','500');\"]");
		
			newmsg.click();
		String parent = dr.getWindowHandle();
		Set<String>windows = dr.getWindowHandles();
		for(String win:windows) {
			if(!win.equals(parent)) {
				dr.switchTo().window(win);
				System.out.println("Switched to Child window");
			}
			dr.manage().window().maximize();
			String title = dr.getTitle();
			System.out.println(title);
			s(5000);
			q();
			}
		}catch(Exception e){
			s(10000);
			q();
		}
	}
		public static void main(String[] args) throws InterruptedException {
		    //NewTab();
		    //NewWindow();
		    newwinMessage();
		}

	}


