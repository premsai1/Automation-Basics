package Facebook.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationDemo {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver",
				"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("back is done");
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("forward is done");
		
		driver.navigate().refresh();
		System.out.println("Page is refreshed ");

}
}
