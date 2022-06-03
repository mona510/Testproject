package Programmingassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class question2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\crome driver\\chromedriver.exe");
	//Step-1
		//Browser open- by creating 
		WebDriver driver =new ChromeDriver();
		 Thread.sleep(5000);
		
	//Step-2
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	//Step-3
		driver.get(" http://jt-dev.azurewebsites.net/#/SignUp");
		Thread.sleep(3000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//span[@aria-label=\"Select box activate\"])[2]")).click();
		 List<WebElement> options = driver.findElements(By.xpath("(//li[@class=\"ui-select-choices-group\"])[2]"));
		 
		 for(WebElement o: options) {
			System.out.print(o.getText());
			if(o.getText().equals("English") && o.getText().equals("Dutch")){
				System.out.print("both values found in the dropdown");	
			}
		 }

		 driver.findElement(By.cssSelector("[id=\"name\"]")).sendKeys("Mona");
		 driver.findElement(By.id("orgName")).sendKeys("Test Org Name");
		 driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("monabhutekar5@gmail.com");
		 //Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]")).click();
		 driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		 Thread.sleep(2000);
		 driver.quit();
				

	}

	}


