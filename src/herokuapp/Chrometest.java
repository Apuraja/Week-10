package herokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Chrometest {
    public static void main(String[] args) {   // main method
        String baseurl = "http://the-internet.herokuapp.com/login";  // storing url
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
        WebElement emailIDField = driver.findElement(By.name("username")); //storing email
        emailIDField.sendKeys("tomsmith");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        // driver.close();*/
    }
    }
