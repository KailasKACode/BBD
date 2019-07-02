package StepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Step {
	@Given("^Open the browser and launch the application$")
	public void open_the_browser_and_launch_the_application() {
		// driver = new ChromeDriver();
		System.out.println("Browser will be open");
		Constants.driver.get("https://www.flipkart.com/");

	}

	@When("^Enter Username and password$")
	public void enter_Username_and_password(DataTable table) {
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("Enter User & password size " +data.size());
			
			Constants.driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(data.get(0).get("username"));
			Constants.driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get("password"));	
		
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws InterruptedException {
		Constants.driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).click();
		
		Thread.sleep(3000);
	}
	
	@Given("^should be login user$")
	public void should_be_login_user() {
	  System.out.println("should be login this method");
	  
	
	}

	@When("^hovor the mouse on login$")
	public void hovor_the_mouse_on_login() throws InterruptedException {
		System.out.println("Hi");
		Thread.sleep(3000);
		Actions action = new Actions(Constants.driver);
		action.moveToElement(Constants.driver.findElement(By.xpath("//div[@class='_1jA3uo'][1]/descendant::*[6]")))
				.build().perform();
		Thread.sleep(3000);

	}

	@Then("^click on logout button$")
	public void click_on_logout_button() throws InterruptedException {
		Constants.driver.findElement(By.xpath("//a[@class='_2k68Dy']//div[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);
		//Constants.driver.close();
	}



}
