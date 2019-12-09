package Facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginautomation {
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement uname=driver.findElement(By.id("email"));
		
		uname.sendKeys("mpremsai");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.id("loginbutton")).click();
			String title= driver.getTitle();
			System.out.println("the title of the page is /n:"+title);
			driver.quit();
	}

}
