package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepOutline {

static WebDriver driver;


@Given("^User launch the chrome browser$")
public void user_launch_the_chrome_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver",
			"C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

	driver = new ChromeDriver();
	Thread.sleep(2000);
	System.out.println("Browser Lounched successfully..");
}

@Given("^User opened Demosite URL$")
public void user_opened_Demosite_URL() throws Throwable {
	driver.get("http://localhost:8082/sdnext/add.html");
	Thread.sleep(2000);
}

@When("^User enters Username \"([^\"]*)\",Age \"([^\"]*)\",Salary \"([^\"]*)\" and Address \"([^\"]*)\"$")
public void user_enters_Username_Age_Salary_and_Address(String name, String age, String salary, String address) throws Throwable {
	driver.findElement(By.id("name")).sendKeys(name);
	driver.findElement(By.id("age")).sendKeys(age);
	driver.findElement(By.id("salary")).sendKeys(salary);
	driver.findElement(By.id("address")).sendKeys(address);
	System.out.println("user enters all Credentials successfully..");
	WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
	submit.click();
	Thread.sleep(2000);
	System.out.println("user enters submit successfully..");

	
}

@When("^User clicks on Submit button$")
public void user_clicks_on_Submit_button() throws Throwable {
	WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
	submit.click();
	Thread.sleep(2000);
	System.out.println("user enters submit successfully..");
}

@Then("^Data Shuold be added in database$")
public void data_Shuold_be_added_in_database() throws Throwable {
	String expected = "http://localhost:8082/sdnext/add.html";
	String actual = driver.getCurrentUrl();
	Assert.assertEquals(actual, expected);
	System.out.println("User is moved successfully on Expected information  page...  ");
}
}


