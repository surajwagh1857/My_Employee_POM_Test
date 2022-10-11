package Employee_POM_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Test  {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = null;
			System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

			 driver = new ChromeDriver();
			driver.get("http://localhost:8082/sdnext/add.html");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
			TestData td=new TestData (driver);
			td.enterEmployeeName("suchita");
			td.enterEmployeeAge("27");
			td.enterEmployeeSalary("80");
			td.enterEmployeeAddress("Pune");
			td.clickOnSubmit();
			td.validation();
		}
		}


