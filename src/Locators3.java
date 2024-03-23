import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]
		WebDriver driver = new ChromeDriver();


		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[1]/input")).sendKeys("Surbhi");
		driver.findElement(By.xpath("//div[2]/input")).sendKeys("agarwalsurbhi555@gmail.com");
		driver.findElement(By.xpath("//div[3]/input")).sendKeys("Surbhi@123");
		driver.findElement(By.xpath("//div[4]/input[1]")).click();
		WebElement male= driver.findElement(By.xpath("//select"));
		Select select= new Select(male);
		select.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01/08/1998");
		driver.findElement(By.xpath("//div/following-sibling::input")).click();
		String sucessText=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(sucessText);
		
		
		
		
		





	}

}
