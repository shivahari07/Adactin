package particals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basemodel.BaseClass;

public class PraticesNode extends BaseClass{
	public static void main(String[] args) throws InterruptedException  {
		driver= Launchinbrowser("Chrome");
		
		driver=geturl("https://phptravels.com/");
		
		WebElement cc=driver.findElement(By.xpath("//span[text()='PHPTRAVELS']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",cc);
		Thread.sleep(2000);
		WebElement rr=driver.findElement(By.xpath("//a[contains(@class,'bg-light col-2 rounded-5 waves-effect')][3]"));
		clickElement(rr);
		
		windows();                         // Window Handles
		
		WebElement pp=driver.findElement(By.xpath("//div[text()='Videos']"));
		clickElement(pp);
		
		WebElement home=driver.findElement(By.xpath("//a[@id='endpoint']"));
		clickElement(home);
		Thread.sleep(2000);
		shift(0);                                                          // Multiple Tap
		
		WebElement fir= driver.findElement(By.xpath("//a[@class='bg-light col-2 rounded-5 waves-effect'][4]"));
		clickElement(fir);
		Thread.sleep(2000);
		shift(0);
		
		
		WebElement yy= driver.findElement(By.xpath("//div[@class='row g-3']/descendant::div[4]/child::a"));  //Dynamic Xpath
		js.executeScript("arguments[0].scrollIntoView();",yy);
		Thread.sleep(2000);
		clickElement(yy);
		
		WebElement ft= driver.findElement(By.name("first_name"));
		write (ft, "Hari");
		
		WebElement lt= driver.findElement(By.name("last_name"));
		write(lt, "Haran");
		
		WebElement bs=driver.findElement(By.name("business_name"));
		write(bs,"Acadamy");
		
		
		
		
		 
		
     
	}

}
