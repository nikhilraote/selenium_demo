import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumSearchTest {

    @Test
    public void seleniumDemo() throws InterruptedException {

        System.out.println("Starting Selenium Demo...");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Selenium automation tutorial");

        Thread.sleep(2000);

        driver.findElement(By.name("q")).submit();

        Thread.sleep(3000);

        driver.findElement(By.xpath("(//h3)[1]")).click();

        Thread.sleep(5000);

        System.out.println("First result opened successfully");

        driver.quit();
    }
}
