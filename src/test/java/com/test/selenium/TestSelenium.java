package com.test.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestSelenium {
	@Test //This is Junit annotation
    public void testLogin()
	{
		WebDriver driver = new FirefoxDriver();
         driver.get("http://localhost:8080/webnew");
         //driver.findElement(By.linkText(“REGISTER”)).click();
         
         WebDriverWait wait = new WebDriverWait(driver, 4000);
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username"))));

         driver.findElement(By.name("username")).sendKeys("Govind");
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("password"))));

         driver.findElement(By.name("password")).sendKeys("Singh");
         wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("submit"))));
         driver.findElement(By.name("submit")).click();

//         Select select = new Select(driver.findElement(By.name(“country”)));
//
//        select.selectByVisibleText(“ANGOLA”);

         driver.close();

        // driver.quit();


	}

}
