package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAmazontodaydeals {
	@FindBy (xpath="//div[@id=\"nav-xshop\"]/ul/li[3]")
	WebElement todaysdelas;
	static WebDriver dr;
	
	public OpenAmazontodaydeals(WebDriver  dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void click() {
		// TODO Auto-generated method stub
		todaysdelas .click();
	}

}
