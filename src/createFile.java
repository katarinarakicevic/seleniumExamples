package examples.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourthExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code-
				//CREATE Driver object for Chrome Browser
				
				
				//invoke .exe file first
				System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String baseURL = "https://www.seleniumeasy.com/test/generate-file-to-download-demo.html";
				driver.get(baseURL);//URL in the browser
				
				WebElement textArea= driver.findElement(By.id("textbox"));
				 textArea.sendKeys("Katarina Rakicevic Amidzina 15 Cacak");
				 WebElement button=driver.findElement(By.id("create"));
				 button.click();
				 driver.findElement(By.linkText("Download")).click();

}
}
