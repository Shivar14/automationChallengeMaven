package inspiredTestingChallenge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addProductTwice {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Getting to the website
        driver.get("https://www.takealot.com/");

        //Accepting the cookies on the page
        driver.findElement(By.className("cookies-banner-module_dismiss-button_24Z98")).click();

        //Clicking on search bar to enter a product name and search
        driver.findElement(By.className("search-field")).sendKeys("PS5 Console");

        //Typing in search bar to search for product
        driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);

        //Adding product to the cart
        driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();

        //Adding product again to the cart
        driver.findElement(By.cssSelector(".add-to-cart-button:first-of-type")).click();

        //Clicking on cart, to view product in the cart
        driver.findElement(By.cssSelector(".mini-cart-button")).click();

    }

}