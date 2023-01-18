package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrometest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";  // storing url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");  // setting webdriver
        WebDriver driver = new ChromeDriver();  // creating object of Chromedriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  // timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page :"+ title);  // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url"+ url);  // printing url
        String source = driver.getPageSource();
        System.out.println("page source :"+ source);
        System.out.println("Title of the page :"+ url);
        WebElement emailIDField = driver.findElement(By.id("user[email]")); //storing email
        emailIDField.sendKeys("Apupatel1985@yahoo.co.uk");
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Orange1$");
        driver.findElement(By.className("button")).click();
        // driver.close();*/
    }
}

