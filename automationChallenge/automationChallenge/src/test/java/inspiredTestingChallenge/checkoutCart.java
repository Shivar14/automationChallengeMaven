package inspiredTestingChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkoutCart {

    public static void main(String[] args) {
        //Invoking the Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Allowing wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Getting to the website
        driver.get("https://www.takealot.com/");

        //Accepting the cookies on the page
        driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();

        //Clicking on checkout cart button
        driver.findElement(By.cssSelector(".mini-cart-button")).click();




    }

}