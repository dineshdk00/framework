package test2practice;

//import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class letcode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://letcode.in/test-practice");
      
       Actions a = new Actions(driver);
      WebElement gromming = driver.findElement(By.xpath("//a[text()=\"Grooming\"]")); 
      a.moveToElement(gromming).perform();
      WebElement testpra = driver.findElement(By.xpath("//a[text()=\" Test Practice \"]"));	
      testpra.click();
     WebElement signin = driver.findElement(By.xpath("//a[text()=\"Sign Up \"]"));
     signin.click();
     
      Set<String> windowhandles = driver.getWindowHandles();
      //set la irukurathua list add pandraram 
      //get vani switch pannikalam 
      System.out.println(windowhandles);
      List<String> list = new ArrayList<String>(windowhandles);
      
      driver.switchTo().window(list.get(1));
     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

      

   JavascriptExecutor js =(JavascriptExecutor) driver;
     //Thread.sleep(1000);
     js.executeScript("window.scrollBy(0,1000)");
     
      WebElement servicenow = driver.findElement(By.xpath("//a[text()=\"Get a ServiceNow ID\"]"));
      servicenow.click();
      
      WebElement firstname = driver.findElement(By.name("firstName"));
      firstname.sendKeys("dinesh");
      
      WebElement lastname = driver.findElement(By.name("lastName"));
      lastname.sendKeys("kumar");
      
       WebElement email = driver.findElement(By.name("email"));
       email.sendKeys("dineshdk@123");
       
       WebElement ctry = driver.findElement(By.id("country"));
       Select country = new Select(ctry);
       country.selectByValue("IN");
       
       WebElement pwd = driver.findElement(By.id("password"));
       pwd.sendKeys("Abcde123@");
       
       WebElement cnfmpwd = driver.findElement(By.id("confirmPassword"));
       cnfmpwd.sendKeys("Abcde123@");
       
      
      //JavascriptExecutor js =(JavascriptExecutor) driver;
      //Thread.sleep(1000);
      //js.executeScript("window.scrollBy(0,5000)");
      
      //System.out.println(driver.getCurrentUrl());
      
      
     
     
     
     
     
     
     
     //Set<String> handles = driver.getWindowHandles();
     //Iterator<String> it = handles.iterator();
     //String parentid = it.next();
     //String childid =it.next();
     //driver.switchTo().window(childid);
     //switch to frame 
     //driver.switchTo().frame(0);
     //String parentHandle = driver.getWindowHandle();
     //for (String handle : driver.getWindowHandles()) {
       //  if (!handle.equals(parentHandle)) {
         //    driver.switchTo().window(handle);
           //  break;
         }
     

     // Switch to frame (if needed)
     // driver.switchTo().frame(0);

     // Enter email
     //WebElement emailInput = driver.findElement(By.id("email"));
     //emailInput.sendKeys("dinesh");

     // Close the driver
     //driver.quit();
     //WebElement emailbtn = driver.findElement(By.name("email"));
     //emailbtn.sendKeys("dinesh");
     
	}


