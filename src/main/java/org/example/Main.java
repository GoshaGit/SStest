package org.example;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\tStart");
        //
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new HtmlUnitDriver(false);
        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("https://demo.opencart.com/");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());
        //
        driver.findElement(By.cssSelector("li.list-inline-item a.dropdown-toggle[href='']")).click();
        Thread.sleep(1000); // For Presentation
        System.out.println("\ta.dropdown-toggle.show clicked ");
        //
        driver.findElement(By.cssSelector("a[href*='account/register']")).click();
        Thread.sleep(1000); // For Presentation
        System.out.println("\tLogin clicked");
        //
        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.click();
        firstname.clear();
        firstname.sendKeys("Ihor");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tfirstname typed");
        //
        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.click();
        lastname.clear();
        lastname.sendKeys("Kondrashov");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tlastname typed");
        //
        WebElement email = driver.findElement(By.id("input-email"));
        email.click();
        email.clear();
        email.sendKeys("testmail@mail.com");
        Thread.sleep(1000); // For Presentation
        System.out.println("\temail typed");
        //
        WebElement password = driver.findElement(By.id("input-password"));
        password.click();
        password.clear();
        password.sendKeys("qwerty");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tpassword typed");
        //
        driver.findElement(By.cssSelector("input.form-check-input")).click();
        Thread.sleep(1000); // For Presentation
        System.out.println("\tbutton Yes clicked");
        //
        driver.findElement(By.cssSelector("input.form-check-input")).click();
        Thread.sleep(1000); // For Presentation
        System.out.println("\tbutton agree clicked");
        //
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1000); // For Presentation
        System.out.println("\tbutton register clicked");
        //
        Thread.sleep(1000); // For Presentation
        driver.quit();
        //
        System.out.println("\tDone");
    }
}
