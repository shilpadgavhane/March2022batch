package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
  
	public static void browserLaunch (Object[]inputParameters)
  {
	  try
	  {
	  String browserName=(String) inputParameters[0];
	  String exe=(String) inputParameters[1];
	  
      if(browserName.equalsIgnoreCase("chrome"))
      {
    	System.setProperty("webdriver.chrome.driver", exe);
        driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      }
      else if(browserName.equalsIgnoreCase("Firefox"))
      {
    	System.setProperty("webdriver.gecko.driver", exe);
        driver=new FirefoxDriver();
      	driver.manage().window().maximize();
      	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      }
	  }catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  }
  
  //open app
  public static void openApplication (Object[]inputParameters)
  {
	  try
	  {
    String url=(String)inputParameters[0];
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
  }catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  //click on element
  public static void clickonElement(Object[]inputParameters)
  {
	  try
	  {
	  String xpath=(String)inputParameters[0];
	    driver.findElement(By.xpath(xpath)).click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
     catch(Exception e)
  {
	  System.out.println(e);
  }
}
  //move to login
  public static void login(Object[]inputParameters) throws InterruptedException
  {
	  try 
	  {
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  String xpath=(String)inputParameters[0];
	  Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(xpath));
		act.moveToElement(abc).build().perform();
		Thread.sleep(2000);
	     }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  //click on my profile
  public static void myProfile(Object[]inputParameters) throws InterruptedException
  {
	  try 
	  {
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    String xpath=(String)inputParameters[0];
	    driver.findElement(By.xpath(xpath)).click();
	    Thread.sleep(2000);
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  //enter username
  public static void username(Object[]inputParameters)
  {
	  try
	  {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  String xpath=(String)inputParameters[0];
	  String abc=(String)inputParameters[1];
	    driver.findElement(By.xpath(xpath)).sendKeys(abc);
	  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  //enter password
  public static void password(Object[]inputParameters)
  {
	  try
	  {
	  String xpath=(String)inputParameters[0];
	  String abc=(String)inputParameters[1];
	    driver.findElement(By.xpath(xpath)).sendKeys(abc); 
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  //click on login
  public static void loginbutton(Object[]inputParameters) 
  {
	  try {
	  String xpath=(String)inputParameters[0];
	  driver.findElement(By.xpath(xpath)).click();
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }
  }
  public static void validationForlogin(Object[]inputParameters) 
  {   try 
      {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      String givenText=(String)inputParameters[0];
	  String xpath=(String)inputParameters[1];
	  String actualText=driver.findElement(By.xpath(xpath)).getText();
	  
	  if(givenText.equalsIgnoreCase(actualText))
	  {
		System.out.println("Test Case Pass"); 
		  
	  }else 
	  {
		  System.out.println("Test Case Fail"); 
	  }
	  }catch(Exception e)
        {
		  System.out.println(e);
	    }
	  }
  
  
      public static void main(String[]args) throws InterruptedException
       {
    	   Object[] input=new Object[2];
    	    input[0]="chrome";
    	    input[1]="B:\\NewMarch2022FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
    	    SeleniumOperations.browserLaunch(input);
      
    	   Object[] input1=new Object[1];
    	    input[0]="chrome";
    	    input1[0]="https://flipkart.com";
    	    SeleniumOperations.openApplication(input1);
      
    	  Object[] input2=new Object[1];
    	    input[0]="chrome";
    	    input2[0]="//*[@class='_2KpZ6l _2doB4z']";
    	    SeleniumOperations.clickonElement(input2);
      
    	    Object[] input3=new Object[1];
    	    input[0]="chrome";
    	    input3[0]="//*[@class='_1_3w1N']";
    	    SeleniumOperations.login(input3);
      
    	   Object[] input4=new Object[1];
    	    input[0]="chrome";
    	    input4[0]="//*[@class='_3vhnxf'][1]";
    	    SeleniumOperations.myProfile(input4);
       
    	    Object[] input5=new Object[2];
    	    input5[0]="//*[@class='_2IX_2- VJZDxU']";
    	    input5[1]="9850948689";
    	    SeleniumOperations.username(input5);
    	    
    	    Object[] input6=new Object[2];
    	    input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
    	    input6[1]="shilpa";
    	    SeleniumOperations.password(input6);
    	    
    	    Object[] input7=new Object[1];
    	    input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
    	    SeleniumOperations.loginbutton(input7); 
       
       
       
       }
  
  
  
  
  
  
}
