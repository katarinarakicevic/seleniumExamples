package examples.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class firstExample {
	
	
public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//selenium code-
					//CREATE Driver object for Chrome Browser
					
					
					//invoke .exe file first
					System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					String baseURL = "https://www.globalsqa.com/demo-site/select-elements/#Serialize";
					driver.get(baseURL);//URL in the browser
					
					// Prepare list of selectable Items
					driver.switchTo().frame(0);
					  List<WebElement> selectableItems = driver.findElements(By.xpath("//*[@id=\"selectable\"]"));

					  // Build the select Item action.
					  Actions toSelect = new Actions(driver);
					  toSelect.keyDown(Keys.CONTROL)
					  .click(selectableItems.get(0))
				       .click(selectableItems.get(2))
				       .click(selectableItems.get(5))
				       .keyUp(Keys.CONTROL)
				       .build()
				       .perform();
			        System.out.println(driver.findElement(By.id("feedback")).getText());
			        
					
					
					 
				
}
}
