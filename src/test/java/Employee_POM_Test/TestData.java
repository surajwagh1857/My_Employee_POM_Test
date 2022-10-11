package Employee_POM_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestData {
	
		WebDriver driver;
//			@FindBy(name="id")
//			private WebElement employeeId;

			@FindBy(name="name")
			private WebElement employeeName;
			
			@FindBy(name="age")
			private WebElement employeeAge;
			
			@FindBy(name="salary")
			private WebElement employeeSalary;
			
			@FindBy(name="address")
			private WebElement employeeAddress;
			
			@FindBy(xpath="//*[@id=\"command\"]/table/tbody/tr[6]/td/input")
			private WebElement submit;
			
			
			
			
			
		// we can inculcate encapsulation concept by using private data member and public 
			//constructor and public method declaration

				
		public TestData(WebDriver driver) {
			super();
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}

		public void enterEmployeeName(String EName) throws InterruptedException {
			employeeName.sendKeys(EName);
			Thread.sleep(2000);
		}

		public void enterEmployeeAge(String EAge ) throws InterruptedException {
			employeeAge.sendKeys(EAge);
			 Thread.sleep(2000);
		}
		
		public void enterEmployeeSalary(String ESalary ) throws InterruptedException {
			employeeSalary.sendKeys(ESalary);
			 Thread.sleep(2000);
		}
		public void enterEmployeeAddress(String EAddress ) throws InterruptedException {
			employeeAddress.sendKeys(EAddress);
			 Thread.sleep(2000);
		}
		
		
		
		
		public void clickOnSubmit () throws InterruptedException {
			submit.click();
			Thread.sleep(2000);
		}

		public void validation () {
			String actTxt= "http://localhost:8082/sdnext/add.html";
			String expectedTxt="http://localhost:8082/sdnext/add.html";
		
			
			if (actTxt.equals(expectedTxt)) {
				System.out.println("validation is successfull...!");
			}else {
				System.out.println("validation is unsuccessfull...!");
			}
			
			
		}
			
		}

