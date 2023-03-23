package browser.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserComment {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\a842074\\Downloads\\conductor-master\\BrowserCommands\\driver\\chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.navigate().to("https://demoqa.com/dynamic-properties");
//        String title = driver.getTitle();
//        System.out.println(title);
//       String currentURl = driver.getCurrentUrl();
//        System.out.println(currentURl);
//        driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
//
//        Thread.sleep(3000);
//        driver.navigate().back();
//
//        String title1 = driver.getTitle();
//        System.out.println(title1);
//        String currentURl1 = driver.getCurrentUrl();
//        System.out.println(currentURl1);
//
//        driver.navigate().forward();
//        String title2 = driver.getTitle();
//        System.out.println(title2);
//        String currentURl2 = driver.getCurrentUrl();
//        System.out.println(currentURl2);

//        driver.navigate().refresh();






//        driver.get("https://www.agoda.com/en-in/");
//        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
//       String title = driver.getTitle();
//        System.out.println(title);
//       String currentURl = driver.getCurrentUrl();
//        System.out.println(currentURl);
//
//        driver.findElement(By.xpath("//button[text()=\"New Browser Tab\"]")).click();
////    driver.close();
//        driver.quit();
        driver.get("https://www.agoda.com/en-in/");
        driver.findElement(By.xpath("//div[@class='Box-sc-kv6pi1-0 ejwhzN']")).click();
        driver.findElement(By.xpath("//button[@class='Buttonstyled__ButtonStyled-sc-5gjk6l-0 brUBl']//span[text()='Sign in']")).click();


//        WebElement f = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement f = driver.findElement(By.xpath("//Iframe[@title='Universal login']"));
        Thread.sleep(3000);

        driver.switchTo().frame(f);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Create account']")).click();
        Thread.sleep(3000);

      driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("asdfgj");


    }
}
