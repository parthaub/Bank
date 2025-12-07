package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class septdef {
	
	 WebDriver driver;

@Given("Open browser")
public void open_browser() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();

}

@Given("Add URL")
public void add_url() {
   driver.get("file:///Users/parthadebnath/Desktop/Batch%2044/Automation%20/App/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
}

@When("Enter valid username")
public void enter_valid_username() {
	
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Batch44");
   
}

@When("Enter valid password")
public void enter_valid_password() {
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("student123@");
	
}

@When("Click login button")
public void click_login_button() {
    
	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
}

@When("Login successful and see logout button")
public void login_successful_and_see_logout_button() {
	
	boolean logstatus = driver.findElement(By.xpath("//*[text()=\"Logout\"]")).isDisplayed();
    System.out.println(logstatus);
}

@When("Enter invalid username")
public void enter_invalid_username() {
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("atch44");
}

@When("Enter invalid password")
public void enter_invalid_password() {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("tudent123@");
}

@When("Login fail and see error message")
public void login_fail_and_see_error_message() {
	try {
		boolean logstatus = driver.findElement(By.xpath("//*[text()=\"Logout\"]")).isDisplayed();
		System.out.println(logstatus);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
}
@When("Enter empty username")
public void enter_empty_username() {
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
}

@When("Enter empty password")
public void enter_empty_password() {
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
   
}
}

