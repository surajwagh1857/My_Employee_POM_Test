package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	static WebDriver driver=null;
	@Given("^user launched chorme browser$")
	public void user_launched_chorme_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Browser Lounched successfully..");
	}

	@Given("^user opened demosite url$")
	public void user_opened_demosite_url() throws Throwable {
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(2000);
		System.out.println("Demosite url opened successfully..");
	}

	@When("^user enters all Credentials$")
	public void user_enters_all_Credentials() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("address")).sendKeys("kolhapur");
		driver.findElement(By.id("salary")).sendKeys("35");
		System.out.println("user enters all Credentials successfully..");
	}

	@When("^user clickes on submit$")
	public void user_clickes_on_submit() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		System.out.println("user enters submit successfully..");
	}

	@Then("^information  page should be displayed$")
	public void information_page_should_be_displayed() throws Throwable {
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println("User is moved successfully on Expected information  page...  ");
		Thread.sleep(4000);
           driver.close();
	}

}
