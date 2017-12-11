package calculatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {
	WebDriver driver;

	public void launchBrowser() throws Throwable{
		System.setProperty("webdriver.chrome.driver","D:\\t07\\Browser Drivers\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(2000);
	}
	public String accApp() throws Throwable{
		
		String a="Angular Calculator";
		
		driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(12000);
		
		
		String s=driver.findElement(By.xpath("html/body/div[3]/div/h3")).getText();
		if(a.equals(s)==true){
			return "title test is pass";
		}
		else{
			return "title test is fail";
		}
	}
public String sum() throws Throwable{
		
		String a="15";
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(0);
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		String s=driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		
		if(a.equals(s)==true){
			return "sum test is pass";
		}
		else{
			return "sum test is fail";
		}
	}
public String division() throws Throwable{
	
	String a="2";
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(1);
	driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	Thread.sleep(5000);
	String s=driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	
	if(a.equals(s)==true){
		return s+"	division test is pass";
	}
	else{
		return s+"	division test is fail";
	}
}

}
