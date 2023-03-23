package browser.command;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dummy {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

    try

    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//button[@id='alertBox']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert present");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
    } catch(
    Exception var4)

    {
        System.out.println(var4.getMessage());
        System.out.println("HI");
        driver.navigate().refresh();
    }
    }
}
