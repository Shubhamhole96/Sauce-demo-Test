import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//set up browser
		WebDriverManager.firefoxdriver().setup();
		
		//create instanc e of edge browser
		
		WebDriver driver = new FirefoxDriver();
		
		// naviget to google
		
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		 WebElement username=driver.findElement(By.id("user-name"));
	        Thread.sleep(2000);
	        username.sendKeys("standard_user");
	        
	        WebElement password=driver.findElement(By.id("password"));
	        Thread.sleep(2000);
	        password.sendKeys("secret_123");
	        
	        WebElement login=driver.findElement(By.id("login-button"));
	        login.sendKeys("login-button");
	        login.click();
	        Thread.sleep(2000);
	
	        
	        //Purchase Start here
	        WebElement addToCart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	        addToCart.sendKeys("add-to-cart-sauce-labs-backpack");
	        addToCart.click();
	        Thread.sleep(2000);
	        
	        //Purchase Shirt here
	        WebElement addToCart_1=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	        addToCart_1.sendKeys("add-to-cart-sauce-labs-bolt-t-shirt");
	        addToCart_1.click();
	        Thread.sleep(2000);
	        
	        // Cart open
	         driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
	       // cartOpen.sendKeys("shopping_cart_link");
	       // cartOpen.click();
	        Thread.sleep(2000);
	        
	        //continue shopping
	         WebElement checkout = driver.findElement(By.id("checkout"));
	         checkout.sendKeys("checkout");
	         checkout.click();
	         Thread.sleep(3000);
	         
	         //first name
	         WebElement firstName = driver.findElement(By.id("first-name"));
	         Thread.sleep(1000);
	         firstName.sendKeys("N");
	         
	         // Last Name
	         WebElement lastName = driver.findElement(By.id("last-name"));
	         Thread.sleep(1000);
	         lastName.sendKeys("B");
	         
	         
	         //postel code
	         WebElement postelCode = driver.findElement(By.id("postal-code"));
	         Thread.sleep(1000);
	         postelCode.sendKeys("413102");
	         
	         
	         
	         //submit
	         driver.findElement(By.xpath("//*[@class=\"submit-button btn btn_primary cart_button btn_action\"]")).click();
	         Thread.sleep(3000);
	         
	         //finish
	         WebElement finish = driver.findElement(By.id("finish"));
	         finish.sendKeys("finish");
	         finish.click();
	         Thread.sleep(3000);
	         
	         //back to home
	         WebElement backtohome = driver.findElement(By.id("back-to-products"));
	         backtohome.sendKeys("back-to-products");
	         backtohome.click();
	         Thread.sleep(3000);
	       
	        
			
	        // open menu 
	        WebElement open=driver.findElement(By.id("react-burger-menu-btn"));
	        open.sendKeys("react-burger-menu-btn");
	        open.click();
	        Thread.sleep(3000);
	        
	        // reset app state
	        
	        
	        WebElement reset=driver.findElement(By.id("reset_sidebar_link"));
	        reset.sendKeys("reset_sidebar_link");
	        reset.click();
	        Thread.sleep(3000);
	        

	}

}
