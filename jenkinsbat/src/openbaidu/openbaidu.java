package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class openbaidu {

	static public WebDriver driver;
	static String url;
	@BeforeClass
	public static void a1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		url="https://www.baidu.com/";
	}
	@Test
	  public void f() {
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("nihao");
		driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
	  }
}
