package calculatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestManager extends OperationalMethods {
	
	


public String percent() throws Throwable{
	
	String a="0.5";
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(2);
	driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	Thread.sleep(5000);
	String s=driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	
	if(a.equals(s)==true){
		return s+"   percent test is pass";
	}
	else{
		return s+" 	percent test is fail";
	}
}
public String multiplication() throws Throwable{
	
	String a="50";
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(3);
	driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	Thread.sleep(5000);
	String s=driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	
	if(a.equals(s)==true){
		return s+"	multiplication test is pass";
	}
	else{
		return s+"	multiplication test is fail";
	}
}
public String subtraction() throws Throwable{
	
	String a="5";
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("10");
	driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("5");

	new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(4);
	driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
	Thread.sleep(5000);
	String s=driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
	
	if(a.equals(s)==true){
		return s+"	subtraction test is pass";
	}
	else{
		return s+"	subtraction test is fail";
	}
}

public void close(){
	driver.close();
}
}
