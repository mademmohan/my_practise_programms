package MohanQA.DemoMaven;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mavendemo {
	public static WebDriver dr;

	@Test(enabled=false)
	public void eportal() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse/Driversdata/chromedriver.exe");

		dr = new ChromeDriver();
		dr.get("https://google.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@name='q']")).sendKeys("testng");
		Thread.sleep(5000);
		List<WebElement> data = dr.findElements(By.xpath("//ul[@role='listbox']//span"));
		for (WebElement list : data) {
			System.out.println(list.getText());
			if (list.getText().equalsIgnoreCase("testng listeners")) {
				list.click();
			}
		}
		Actions act= new Actions(dr);
		act.sendKeys(Keys.CONTROL, "ENTER");
		dr.quit();

	}
	@Test
	public void windowHandle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/Eclipse/Driversdata/chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//div[contains(@itemprop,'articleBody')]/a)[1]")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//div[contains(@itemprop,'articleBody')]/a)[2]")).click();
		String Parent= dr.getWindowHandle();
		
		Set<String> allwindows=dr.getWindowHandles();
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext())
		{
			String childwindow=itr.next();
			
		}
		
		
		
/*		String Parent= dr.getWindowHandle();
		Set<String> widows=dr.getWindowHandles();
		
		Iterator<String> itr= widows.iterator();
		
		while(itr.hasNext())
		{
			
			String childwindow= itr.next();
			
			if (!Parent.equals(childwindow)) {
				dr.switchTo().window(childwindow);
			}
			String currentwindow= dr.getTitle();
			
			Thread.sleep(3000);
			dr.switchTo().window(Parent);*/
			
		}
	}


