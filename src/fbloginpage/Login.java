package fbloginpage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://WWW.fb.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("EnterUserName");
		driver.findElement(By.id("pass")).sendKeys("EnterPassword");
		//driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		Select birthday = new Select(driver.findElement(By.xpath("//*[@name=\"birthday_day\"]")));
		birthday.selectByValue("19");
		
		//List<WebElement> = driver.findElementsByXPath("//*[@name=\"birthday_day\"]");
		
		
// to put the code in git we will do the following.
		/*1.CReate new project:- this fbproject
		 * 2 create local(git) repository
		 * 3.Add file to staging
		 * 4. commit changes to local.
		 * 5.Push Changes to master.
		 * 
		 */
		
			
		
		
	}

	

}
