package seleniumDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Browser Driver\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//	       	  System.setProperty("webdriver.gecko.driver", "F:\\Browser Driver\\lib\\geckodriver.exe");
  //        WebDriver driver=new FirefoxDriver(); 

		// System.setProperty("webdriver.edge.driver", "F:\\Browser
		// Driver\\lib\\msedgedriver.exe");
		// WebDriver driver=new EdgeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.xpath("//body/div/div/div/div/div/div/span/div"));
		System.out.println(text.getText());

	}

}

/*
 * System.setProperty("webdriver.chrome.driver",
 * "F:\\Browser Driver\\lib\\chromedriver.exe"); WebDriver driver=new
 * ChromeDriver(); driver.get("https://www.facebook.com/login/");
 * driver.manage().window().maximize();
 * 
 * WebElement text =
 * driver.findElement(By.xpath("//body/div/div/div/div/div/div/span/div"));
 * System.out.println(text.getText());
 * 
 * }
 */
