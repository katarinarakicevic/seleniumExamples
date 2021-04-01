package examples.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	
import org.openqa.selenium.WebDriver;
	
import org.openqa.selenium.chrome.ChromeDriver;
	
	public class promptExample {
		
		
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//selenium code-
						//CREATE Driver object for Chrome Browser
						
						
						//invoke .exe file first
						System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						String baseURL = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
						driver.get(baseURL);//URL in the browser
						driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
						Alert alert = driver.switchTo().alert();
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
						alert.sendKeys("Katarina Rakicevic"); 
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
						alert.accept(); 
						//verify text enteded in the prompt
						System.out.println(driver.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText());
						     

}
	}
