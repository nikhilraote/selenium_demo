import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumSearchTest {

    @Test
    public void seleniumDemo() throws InterruptedException {

        System.out.println("Starting Selenium Demo...");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.name("q"))
              .sendKeys("Selenium automation tutorial" + Keys.ENTER);

        System.out.println("Search executed successfully");

        Thread.sleep(5000);

        driver.quit();
    }
}