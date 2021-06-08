import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumVienas {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vi\\Documents\\Pamoka\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String bazineNuoroda = "https://the-internet.herokuapp.com/";
        driver.get(bazineNuoroda);
        driver.manage().window().setSize(new Dimension(1050, 748));
        driver.findElement(By.linkText("A/B Testing")).click();
        sleep(1000);
        driver.get(bazineNuoroda);
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.cssSelector(".example > button")).click();
        driver.findElement(By.cssSelector(".example > button")).click();
        driver.findElement(By.cssSelector(".added-manually:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".added-manually:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".added-manually")).click();
        sleep(1000);
        driver.get(bazineNuoroda);
    }
}
