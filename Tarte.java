package Ningappa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarte {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://tartecosmetics.com/en_IN/home");

		// handled page overlay
	    driver.findElement(By.linkText("No thanks")).click();
		Thread.sleep(2000);
		
	    // 1.added first product into bag
		//works only for linktext n css 
	    WebElement product1 = driver.findElement(By.cssSelector("span.product-name-desktop"));
	    Thread.sleep(2000);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse2.executeScript("arguments[0].click()",product1);
		
		Thread.sleep(2000);
		WebElement we1 = driver.findElement(By.xpath("//*[@id='add-to-cart']"));
		Thread.sleep(2000);
		JavascriptExecutor jsadd = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jsadd.executeScript("arguments[0].click()",we1);
		
		//2. second product added into bag
		Thread.sleep(2000);
		driver.navigate().back();
	    WebElement product2 = driver.findElement(By.linkText("face tape™ foundation"));
		//WebElement product2 = driver.findElement(By.cssSelector("span.product-name-desktop:nth-of-type(1)"));
		//WebElement product2 = driver.findElement(By.cssSelector("a>span:nth-of-type(1)"));
	    Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js1.executeScript("arguments[0].click()",product2);
		
		Thread.sleep(2000);
		WebElement we2 = driver.findElement(By.xpath("//*[@id='add-to-cart']"));
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js2.executeScript("arguments[0].click()",we2);
		
		//3. 3rd product added into bag
		Thread.sleep(2000);
		driver.navigate().back();
	    WebElement product3 = driver.findElement(By.linkText("maracuja tinted moisturizer"));
		//WebElement product3 = driver.findElement(By.cssSelector("a>span:nth-of-type(2)"));

	    Thread.sleep(2000);
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js3.executeScript("arguments[0].click()",product3);
		
		Thread.sleep(2000);
		WebElement we3 = driver.findElement(By.xpath("//*[@id='add-to-cart']"));
		Thread.sleep(2000);
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js4.executeScript("arguments[0].click()",we3);
		
		//click on bag 
		driver.navigate().back();
		driver.findElement(By.cssSelector("span.minicart-quantity")).click();
		Thread.sleep(2000);
		//(//span[contains(text(),'shape tape™ concealer')])[5]/../../../../../td[6]/button
				
			
	    WebElement dlt = driver.findElement(By.linkText("shape tape™ concealer"));
	    String actualText = dlt.getText();
	    
	    String ExpectedText="shape tape™ concealer";
		if (actualText.equalsIgnoreCase(ExpectedText))
	    {
	    	//delete
	    }
	    
	   		
}
}