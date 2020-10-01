package com.asstp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.asstp.base.Testbase;
import com.asstp.pages.Dashboardpage;
import com.asstp.pages.LoginPage;



public class LoginpageTest extends Testbase 
{
	 LoginPage loginpage;
	Dashboardpage dashboardpage;
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		  loginpage=new LoginPage();
	}
	
	@Test
	public void logintest()
	{
		dashboardpage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
