package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// for opening the GURU Demo website
				
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-16.0.1\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://demo.guru99.com/insurance/v1/index.php");
				
				
				// trying to register with email and password and the close browser
				
				WebElement register = driver.findElement(By.linkText("Register"));
				register.click();
				
				WebElement email = driver.findElement(By.id("user_user_detail_attributes_email"));
				email.sendKeys("bhaskar123@gmail.com");
				
				WebElement password = driver.findElement(By.id("user_user_detail_attributes_password"));
				password.sendKeys("bhaskar1");


				WebElement confirmpassword = driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));
				confirmpassword.sendKeys("bhaskar1");
				
				WebElement create = driver.findElement(By.name("submit"));
				create.click();
				
						
				
		// trying to login with given details
				
				WebElement EMAIL = driver.findElement(By.id("email"));
				EMAIL.sendKeys("bhaskar123@gmail.com");
				
				WebElement PASS = driver.findElement(By.id("password"));
				PASS.sendKeys("bhaskar1");
				
				WebElement login = driver.findElement(By.name("submit"));
				login.click();
				
				
				
				// opening the edit profile page and editing details
				
				WebElement editprofile = driver.findElement(By.linkText("Edit Profile"));
				editprofile.click();
		
		//checking for updating user details
				
				WebElement surname = driver.findElement(By.id("user_surname"));
				surname.sendKeys("penmethsa");
				
				WebElement firstname = driver.findElement(By.id("user_firstname"));
				firstname.sendKeys("bhaskar");
				
				WebElement updateprofile = driver.findElement(By.name("commit"));
				updateprofile.click();
				
				// logging out
				
				WebElement logout = driver.findElement(By.xpath("//input[@class='btn btn-danger']"));
						logout.click();
				
						
	}

}
