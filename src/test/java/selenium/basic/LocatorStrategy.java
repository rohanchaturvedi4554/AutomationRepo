package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class LocatorStrategy {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //By ID
        //driver.findElement(By.id("login1")).sendKeys("Harsh");

        //By Name
        //driver.findElement(By.name("login")).sendKeys("Ravi");

        //By className
        //driver.findElement(By.className("email-input")).sendKeys("Rohan");

        //By linkText
        //driver.findElement(By.linkText("Get a new Rediffmail ID")).click();

        //By partialLinkText
        //driver.findElement(By.partialLinkText("Rediffmail ID")).click();

        //By tagName
        //List<WebElement> allElements=driver.findElements(By.tagName("a"));
        //System.out.println(allElements.size());

        //cssSelector with Id Attribute - both ways are working same
       // driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("Samarth");
        //driver.findElement(By.cssSelector("input#login1]")).sendKeys("Samarth");

        //cssSelector with class attribute
        //driver.findElement(By.cssSelector("input[class='email-input']")).sendKeys("Shital");
        //driver.findElement(By.cssSelector("input.email-input")).sendKeys("Shital");

        //xpath : Relative Xpath use krte hai isme double forward slash(//) use hota hai
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kalyani");

        //text() function in xpath
        //driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        //and/or in xpath
        //driver.findElement(By.xpath("//input[@id='password' and name='passwd']")).sendKeys("Kalyani");
        //driver.findElement(By.xpath("//input[@id='password' or name='pass']")).sendKeys("Kalyani");

        //starts-with() in xpath
        //driver.findElement(By.xpath("//a[starts-with(text(),'Get a new')]")).click();
        //driver.findElement((By.xpath("//input[starts-with(@id,'log')]"))).sendKeys("Test Data");

        //Contains()
        driver.findElement((By.xpath("//input[contains(@id,'in1')]"))).sendKeys("Happy");

    }
}
