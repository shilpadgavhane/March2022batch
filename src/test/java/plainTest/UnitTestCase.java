package plainTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UnitTestCase 
{
public static void main(String[]args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","B:\\NewMarch2022FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");	
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//open url
	driver.get("https://flipkart.com");
	//cancel login window
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	//move to login
	Actions act=new Actions(driver);
	WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
	act.moveToElement(abc).build().perform();
	Thread.sleep(2000);
	//click on My profile
	driver.findElementByXPath("//*[@class='_3vhnxf'][1]").click();
    Thread.sleep(2000);
	//enter username
	driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9850948689");
	driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("shilpa");
	driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	
}




}

