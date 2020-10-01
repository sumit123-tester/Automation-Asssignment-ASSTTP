package com.asstp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	 public static WebDriver driver;
	
	public static Properties prop;


	public Testbase() 
	{
		try
		{
			prop  = new Properties();
			
			FileInputStream f1=new FileInputStream("C:\\Users\\Local User\\workspace\\ASSTTP1\\src\\main\\java\\com\\asstp\\config\\config.properties");
			
				prop.load(f1);
				
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
				
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Local User\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
				}
	}


		
		
		
			
		
	
