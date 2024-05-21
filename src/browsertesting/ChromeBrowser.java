package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //1.1 - Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //1.2 -Open url into browser
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //1.3 - Get the title of the page
        System.out.println("The title of the page : " + driver.getTitle());

        //1.4 - Get the current url
        System.out.println("The url is : " + driver.getCurrentUrl());

        //1.5 - Get the page source
        System.out.println("the page source is : " + driver.getPageSource());

        //1.6 - Navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //1.7 - Print the current url
        System.out.println("The current url is : " + driver.getCurrentUrl());

        //1.8 - Navigate back to homepage
        driver.navigate().back();
        System.out.println("Get current url : " + baseUrl);

        //1.9 - Navigate to the login page
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //1.10 Print the current url
        System.out.println("The current url is : " + driver.getCurrentUrl());

        //1.11 - Refresh the page
        driver.navigate().refresh();

        //1.12 - Enter the email to Email Field
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("beenarani5504@gmail.com");

        //1.13 - Enter the password to password field.
        WebElement passwordfield = driver.findElement(By.id("Password"));
        passwordfield.sendKeys("Password");

        //1.14 - Click on Login Button.
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();

        //1.15 - 15. Close the browser.
        driver.quit();
    }
}
