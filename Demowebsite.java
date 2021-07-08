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
				
				
				
						
	}

}
