package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class AssignmentLocator {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();

        // Launch Chrome browser and open https://www.saucedemo.com/.
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        /* By id
           Find the username field and enter "standard_user".
           Find the password field and enter "secret_sauce". */

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        /* By name
           Locate the login button and click it. */

        driver.findElement(By.id("login-button")).click();

        /* By className
           Get the title of the first product using class name "inventory_item_name" and print it.*/

        WebElement firstProduct=driver.findElement(By.className("inventory_item_name"));
        System.out.println("First Product Title : " + firstProduct.getText());

        /* By tagName
           Count how many <div> tags are present on the page and print the count. */

        List<WebElement> allDiv = driver.findElements(By.tagName("div"));
        System.out.println("Total div count : " + allDiv.size());

        /* By linkText
           Click on "Twitter" link in the footer. */

        //driver.findElement(By.linkText("Twitter")).click();

        /* By partialLinkText
           Click on "Face" (partial text for “Facebook”) link in the footer. */

        //driver.findElement(By.partialLinkText("Face")).click();

        /* By cssSelector
           Add the first item to the cart using CSS selector
           Example: button.btn_primary.btn_small.btn_inventory */

        driver.findElement(By.cssSelector("button.btn_primary.btn_small.btn_inventory")).click();

        /*By xpath
          Click on the cart icon using XPath and print the current page URL.*/

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        System.out.println("Current Url : " + driver.getCurrentUrl());
    }
}

