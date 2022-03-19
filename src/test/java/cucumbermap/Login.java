package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.SeleniumOperations;

public class Login 
{
	@Given("^user opens \"(.*)\"browser with exe as \"(.*)\"$") 
	public void launchBrowser(String bname,String exe)
	  {
	    Object[] input=new Object[2];
	    input[0]=bname;
	    input[1]=exe;
	    SeleniumOperations.browserLaunch(input);
	  }
	@Given("^user opens URL as \"(.*)\"$")
	public void openApplication(String url)
	{
		Object[] input1=new Object[1];
	    input1[0]=url;
	    SeleniumOperations.openApplication(input1);
  }
	@When("user click on cancel login Window")
	public void cancleWindow()
	{
		 Object[] input2=new Object[1];
 	     input2[0]="//*[@class='_2KpZ6l _2doB4z']";
 	     SeleniumOperations.clickonElement(input2);
   	
	}
	@When("user move to on login")
	public void movetologin() throws InterruptedException
	{
		Object[] input3=new Object[1];
	    input3[0]="//*[@class='_1_3w1N']";
	    SeleniumOperations.login(input3);	
	}
	@When("user click on MyProfile")
	public void myProfile() throws InterruptedException
	{
		 Object[] input4=new Object[1];
 	     input4[0]="//*[@class='_3vhnxf'][1]";
 	     SeleniumOperations.myProfile(input4);
    }
	@When("^user enter username as \"(.*)\"$")
	public static void username(String uname)
	{
		Object[] input5=new Object[2];
	    input5[0]="//*[@class='_2IX_2- VJZDxU']";
	    input5[1]=uname;
	    SeleniumOperations.username(input5);
	    
	}
	@When("^user enter password as \"(.*)\"$")
	public static void password(String pname)
	{
		 Object[] input6=new Object[2];
 	    input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
 	    input6[1]=pname;
 	    SeleniumOperations.password(input6);	
	}
	@When("user click on login button")
	public static void loginbutton()
	{
		Object[] input7=new Object[1];
	    input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	    SeleniumOperations.loginbutton(input7); 
   	}
	@Then("^Application shows user logged successfully$")
	public void Application_shows_user_logged_successfully() throws InterruptedException 
	{
		Thread.sleep(3000);
		Object[] input8=new Object[2];
	     input8[0]="Shilpa Gavhane";
	     input8[1]="//*[text()='Shilpa Gavhane']";
	     SeleniumOperations.validationForlogin(input8);	
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

