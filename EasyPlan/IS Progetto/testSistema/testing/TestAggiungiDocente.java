package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAggiungiDocente {

	public static final String PATH= "C:\\Users\\Franc\\Desktop\\GoogleDriver\\" + "chromedriver.exe";
	public static final String URL="http://localhost:8080/IS_Progetto/Homepage.html";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",PATH );
		WebDriver driver = new ChromeDriver();
		
	      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      //Launch website
	      driver.navigate().to(URL);
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("./html/body/nav/div/div[2]/ul/li/a")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"username\"]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
	      
	      driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin");
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/form/div[3]/button")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"laureaScelta2\"]")).click();
	    //Curriculum di Cloud Computing
	      driver.findElement(By.xpath("/html/body/div[1]/div[1]/form[1]/button")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/fieldset/input[1]")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[2]/div[3]/div[5]/button/span")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[3]/div[2]/input")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[3]/div[2]/input")).sendKeys("Docente");
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[3]/div[3]/input")).click();
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[3]/div[3]/input")).sendKeys("www.prova.it");
	      
	      driver.findElement(By.xpath(" /html/body/div[1]/div/fieldset[1]/fieldset/form[1]/div/div/div/div[6]/button")).click();
	     
	      //Close the Browser.
	      driver.close();
	}
}
