package seleniumDemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CabBookingOnMakeMytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chCabs']")).click();
		Thread.sleep(5000);

		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isEnabled());
		Thread.sleep(3000);

		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected());
		Thread.sleep(3000); 

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span")).click();
		Thread.sleep(5000);

		

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/label/span")).click();
		Thread.sleep(5000);

		WebElement Dr = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"));
		Dr.sendKeys("Pune");
		Thread.sleep(5000);
        Dr.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
		Dr.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
		

		 WebElement from= driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		from.sendKeys("Delhi");
		Thread.sleep(5000);
        from.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[3]/label/span")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Tue Dec 20 2022')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Tue Dec 27 2022')]")).click();
		Thread.sleep(5000);  
		
		WebElement To =driver.findElement(By.xpath("//span[normalize-space()='PICKUP-TIME']"));
		To.click();
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/ul[1]/li[7]")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),'DROP-TIME')]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/ul[1]/li[1]")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		
		
/*		To.sendKeys(Keys.ARROW_DOWN);
		To.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		    //OR
		Select s=new Select(To);
		s.selectByVisibleText("01:00AM");
 *           //OR
		List<WebElement> alloptions = s.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.equals("01:00AM"))
			{
				option.click();
				break;         
			}                  
		}*/
		



	}

}
