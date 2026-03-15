import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikipediaSearchTest {

    @Test
    public void wikipediaDemo() throws InterruptedException {

        System.out.println("Starting Wikipedia Selenium Demo...");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Wikipedia
        driver.get("https://www.wikipedia.org");

        Thread.sleep(4000); // wait so students see homepage

        // Type search
        driver.findElement(By.id("searchInput"))
              .sendKeys("Selenium software");

        Thread.sleep(2000); // pause to show text typed

        // Press Enter
        driver.findElement(By.id("searchInput"))
              .sendKeys(Keys.ENTER);

        Thread.sleep(6000); // stay on results page for demo

        System.out.println("Wikipedia search completed.");

        driver.quit();
    }
}