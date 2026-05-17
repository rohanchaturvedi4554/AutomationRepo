package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        List<WebElement> elements=driver.findElements(By.tagName("input"));
        for(WebElement e : elements)
            System.out.println(e.getText());

    }
}
