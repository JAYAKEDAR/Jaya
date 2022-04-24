package com.hybridframework.projectobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='Logout.php']")
	WebElement logout;

	@FindBy(xpath = "//a[@href='CustomisedStatementInput.php']")
	WebElement customisedstatement;

	@FindBy(xpath = "//a[@href='MiniStatementInput.php']")
	WebElement MiniStatement;

	@FindBy(xpath = "//a[@href='BalEnqInput.php']")
	WebElement BalEnq;

	@FindBy(xpath = "//a[@href='PasswordInput.php']")
	WebElement chngPassword;

	@FindBy(xpath = "//a[@href='FundTransInput.php']")
	WebElement FundTrans;

	@FindBy(xpath = "//a[@href='Managerhomepage.php']")
	WebElement manager;

	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement newCustomer;

	@FindBy(xpath = "//a[@href='EditCustomer.php']")
	WebElement editCustomer;

	@FindBy(xpath = "//a[@href='DeleteCustomerInput.php']")
	WebElement deleteCustomer;

	@FindBy(xpath = "//a[@href='addAccount.php']")
	WebElement newAccount;

	@FindBy(xpath = "//a[@href='editAccount.php']")
	WebElement editAcount;

	@FindBy(xpath = "//a[@href='deleteAccountInput.php']")
	WebElement deleteAccount;

	@FindBy(xpath = "//a[@href='DepositInput.php']")
	WebElement deposit;

	@FindBy(xpath = "//a[@href='WithdrawalInput.php']")
	WebElement withdrawal;
	

	public void logout() {
		logout.click();

	}

	public void customisedstatement() throws InterruptedException {
		customisedstatement.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='fdate']")).sendKeys("02-03-2008");
		driver.findElement(By.xpath("//input[@name='tdate']")).sendKeys("03-04-2008");
		driver.findElement(By.xpath("//input[@name='amountlowerlimit']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@name='numtransaction']")).sendKeys("06");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

	}

	public void MiniStatement() {
		MiniStatement.click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

		

	}

	public void BalEnq() {
		BalEnq.click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

	}

	public void chngPassword() {
		chngPassword.click();
		driver.findElement(By.xpath("//input[@name='oldpassword']")).sendKeys("Kedar@123");
		driver.findElement(By.xpath("//input[@name='newpassword']")).sendKeys("kedar!123");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("kedar!123");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		

	}

	public void FundTrans() {
		FundTrans.click();
		driver.findElement(By.xpath("//input[@name='payersaccount']")).sendKeys("02-03-2008");
		driver.findElement(By.xpath("//input[@name='payeeaccount']")).sendKeys("03-04-2008");
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Reason");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

		

	}

	public void manager() {
		manager.click();

	}

	public void newCustomer() throws InterruptedException {
		newCustomer.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jaya Kedar");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("07-02-1998");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Bharat jyoti society , bibwewadi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("411037");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("8623831628");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("jayakedar15@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kedar@123");
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		
		Thread.sleep(6000);
		driver.close();
		


	}

	public void editCustomer() throws InterruptedException {
		editCustomer.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Jaya1234");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

		

	}

	public void deleteCustomer() throws InterruptedException {
		deleteCustomer.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Jaya1234");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();


		

	}

	public void newAccount() throws InterruptedException {
		newAccount.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Jaya1234");
		WebElement sb =  driver.findElement(By.xpath("//select[@name='selaccount']"));
		Select sb1=new Select(sb);
		sb1.selectByValue("Current");
		driver.findElement(By.xpath("//input[@name='inideposit']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@name='button2']"));

	}

	public void editAccount() throws InterruptedException {
		editAcount.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

	}

	public void deleteAccount() throws InterruptedException {
		deleteAccount.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

	}

	public void deposit() throws InterruptedException {
		deposit.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Reason");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();

	}

	public void withdrawal() throws InterruptedException {
		withdrawal.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("86523491356");
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("Reason");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
		
		

	}

}
