package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class DesiredCapabilityExample {
    public static void main(String[] args) {
        ChromeOptions cp = new ChromeOptions();
        //cp.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(cp);
        driver.get("https://www.edso.in/");
        //getTitle
        String title=driver.getTitle();
        System.out.println(title);
        //getPageSource
        System.out.println(driver.getPageSource());
        //getCurrentUrl
        System.out.println(driver.getCurrentUrl());
       // driver.get("https://self-signed.badssl.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
