package hometask_Selenium01;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;


public class ButtonsClicking {
     public static WebDriver driver = new ChromeDriver();

     public static By allWindowsButton = By.cssSelector("#contentblock > section > div:nth-child(4) > div > div > button");

    public static void main(String[] args) {

        driver.manage().window().maximize();
        driver.get("http://www.leafground.com/pages/Window.html");

        driver.findElement(allWindowsButton).click();


        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList tabs = new ArrayList (driver.getWindowHandles());


        System.out.println("Titles of all Windows: ");
        for (int i = 0; i < tabs.size(); i++) {
            driver.switchTo().window((String) tabs.get(i));
            System.out.println( driver.getTitle());

        }

        driver.manage().window().maximize();
        System.out.println("\nButton title 1 is: "+ driver.findElement(By.id("home")).getText());
        System.out.println("Button title 2 is: "+ driver.findElement(By.id("position")).getText());
        System.out.println("Button title 3 is: "+ driver.findElement(By.id("color")).getText());

        driver.quit();


    }





}
