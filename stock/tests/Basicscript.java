package Com.stock.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Basicscript {

	
	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver=new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("http://webapp.qedgetech.com");
      driver.findElement(By.id("btnreset")).click();
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("master");
	  driver.findElement(By.id("btnsubmit")).click();
	  driver.findElement(By.id("mi_a_suppliers")).click();
	  Sleeper.sleepTightInSeconds(2);
	  driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	  driver.findElement(By.id("x_Supplier_Number")).sendKeys("12345");
	  driver.findElement(By.id("x_Supplier_Name")).sendKeys("harish");
	  driver.findElement(By.id("x_Address")).sendKeys("madhapur");
	  driver.findElement(By.id("x_City")).sendKeys("hyd");
	  driver.findElement(By.id("x_Country")).sendKeys("india");
	  driver.findElement(By.id("x_Contact_Person")).sendKeys("kranthi");
	  driver.findElement(By.id("x_Phone_Number")).sendKeys("7799016716");
	  driver.findElement(By.id("x__Email")).sendKeys("harishnelanti1@gmail.com");
	  driver.findElement(By.id("x_Mobile_Number")).sendKeys("7799016716");
	  driver.findElement(By.id("x_Notes")).sendKeys("hi");
	  driver.findElement(By.id("btnAction")).click();
	  Sleeper.sleepTightInSeconds(2);
	  
	  driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
	  driver.findElement(By.xpath("html/body/div[18]/div[2]/div/div[1]/button[3]")).click();
	

	  

}
}