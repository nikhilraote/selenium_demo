import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAutomationTest {

    @Test
    public void loginTest() throws InterruptedException {

        System.out.println("Opening automation login page...");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("tomsmith");

        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(5000);

        System.out.println("Login successful");

        Thread.sleep(5000);

        driver.quit();
    }
}