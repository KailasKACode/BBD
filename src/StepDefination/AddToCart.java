package StepDefination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart {

	@Given("^Search product on search bar$")
	public void search_product_on_search_bar() throws AWTException, InterruptedException {
		Robot bot = new Robot();
		Constants.driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("fastrack watches men");
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}

	@When("^click on add to cart$")
	public void click_on_add_to_cart() throws InterruptedException {
		Constants.driver.findElement(By.xpath("//a[contains(text(),'NG1474SM01 Party Analog Watch  - For Men')]"))
				.click();
		Thread.sleep(5000);
		String parent = Constants.driver.getWindowHandle();
		System.out.println(parent);
		Set<String> li = Constants.driver.getWindowHandles();
		for (String child : li) {
			if (!parent.equals(child)) {
				Constants.driver.switchTo().window(child);
				Constants.driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
			}

		}
	}

	@Then("^product should added on cart$")
	public void product_should_added_on_cart() {
	}

}
