package examples.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class thirdExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium code-
				//CREATE Driver object for Chrome Browser
				
				
				//invoke .exe file first
				System.setProperty( "webdriver.chrome.driver","C:\\Users\\Katarina\\Downloads\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String baseURL = "https://www.globalsqa.com/samplepagetest/";
				driver.get(baseURL);//URL in the browser
				WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2598-p2599-o1\"]/form/p/span/input"));
				// enter the file path onto the file-selection input field
		        uploadElement.sendKeys("C:\\Users\\Katarina\\Desktop\\interview 2021\\Katarina_Rakicevic_EnglishCV.docx");
		        driver.findElement(By.id("g2599-name")).sendKeys("Katarina Rakicevic");
		        driver.findElement(By.id("g2599-email")).sendKeys("katarinarakicevic1512@gmail.com");
		        driver.findElement(By.id("g2599-website")).sendKeys("https://github.com/katarinarakicevic");
		        Select expYears = new Select (driver.findElement(By.id("g2599-experienceinyears")));
		        expYears.selectByVisibleText("0-1");
		        //select automation check box
		        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[3]/input"));

		      //If the checkbox is unchecked then isSelected() will return false 
		      //and NOT of false is true, hence we can click on checkbox
		      if(!checkbox1.isSelected())
		      	checkbox1.click();
		      
		      //select manual check box
		        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[4]/input"));

		      //If the checkbox is unchecked then isSelected() will return false 
		      //and NOT of false is true, hence we can click on checkbox
		      if(!checkbox2.isSelected())
		      	checkbox2.click();
		        WebElement radioButton = driver.findElement(By.name("g2599-education"));
		        radioButton.click();
		        
		        
		       WebElement textArea= driver.findElement(By.id("contact-form-comment-g2599-comment"));
		        textArea.sendKeys("Automation Testing or Test Automation is a software testing technique that performs using special automated testing software tools to execute a test case suite.");
		        WebElement btnSubmit = driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button"));
		        btnSubmit.click();
		        
		        
		        //verify sent elements
		        
		        //file
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"wpcf7-f2598-p2599-o1\"]/form/p/span/input")).getText());
		        //name
		        
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[1]")).getText());
		        
		        //email
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[2]")).getText());
		        
		        //website 
		        
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[3]")).getText());
		        
		        //experience
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[4]")).getText());
		        //expertise
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[5]")).getText());
		        
		        //education
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[6]")).getText());
		        //comment
		        System.out.println(driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/blockquote/p[7]")).getText());
}
}
