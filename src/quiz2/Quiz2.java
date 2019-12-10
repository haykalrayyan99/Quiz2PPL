/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 *
 * @author asus
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver=null;
    
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", 
                "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
        
        WebElement user_name = driver.findElement(By.name("user_name"));
        user_name.sendKeys("admin");
        user_name.sendKeys(Keys.ENTER);
        
        WebElement user_password = driver.findElement(By.name("user_password"));
        user_password.sendKeys("admin");
        user_password.sendKeys(Keys.TAB);
        
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        
        Thread.sleep(10000);
        
        driver.findElement(By.className("default-avatar")).click();
        
        
    }
    
}

