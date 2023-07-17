package com.automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Login {
	
	WebDriver driver;
	String url = "https://dev.portal.tavus.io/login";

  @BeforeTest
  public void Setup() {
	  
	  System.setProperty("webdriver.chrome.driver",
		      "/Applications/chromedriver_mac64/chromedriver");
	driver = new ChromeDriver();
	  driver.get(url);
      driver.manage().window().maximize();
      //Thread.sleep(5000);
  }
  
  @Test
  public void Loginapp() throws InterruptedException {
	  
	  WebElement Email = driver.findElement(By.id("bootstrap-input"));
      Email.sendKeys("prashant.sharma+1922@simubladetechnology.com");
      Thread.sleep(5000);
      
      WebElement Pass = driver.findElement(By.id("outlined-adornment-password"));
      Pass.sendKeys("123456");
      Thread.sleep(5000);

      WebElement Login = driver.findElement(By.xpath("//div[@class='iconButton']"));
      Login.click();
  }

  @AfterTest
  public void logout() {
	  
	  
	  
  }

}
