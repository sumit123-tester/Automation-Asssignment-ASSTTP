package com.asstp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.asstp.base.Testbase;

public class LoginPage extends Testbase {

	@FindBy(name="username")
	WebElement  username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="save_button")
	WebElement sign;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Dashboardpage login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		sign.click();
		
		return new Dashboardpage();
	}
	
}
