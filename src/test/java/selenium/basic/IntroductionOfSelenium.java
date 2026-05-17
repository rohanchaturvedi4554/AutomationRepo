package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroductionOfSelenium {
    public static void main(String[] args) {
       // WebDriver driver=new ChromeDriver();
        ChromeOptions cp=new ChromeOptions();
        cp.setBinary("C:\\Users\\rohan\\Downloads\\chrome-win64.zip\\chrome-win64\\chrome.exe");
        cp.addArguments("--headless");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
    }
    }
