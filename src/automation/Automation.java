/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automation;

/**
 *
 * @author Sara
 */
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class Automation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.id("input")).sendKeys("Mobiles ");
        driver.findElement(By.id("icon")).click();
        // test case when user enter nothing in the search bar
        driver.findElement(By.id("input")).sendKeys("");
        driver.findElement(By.id("icon")).click();
                
                //input id search search button id icon
    }
    
}
