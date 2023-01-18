package herokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class Multibrowser {
    static String browser = "Chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";    // storing url
    static WebDriver driver;
    public static void main(String[] args) {
        browser = "Firefox";

        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting webdriver
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.geko.driver", "src/drivers/geckodriver.exe");  // setting webdrive
            driver = new FirefoxDriver();// creating object of chrome webdriver

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); // setting webdriver
            driver = new EdgeDriver(); // creating object of chrome webdriver

        } else {
            System.out.println(" not valid browser");
        }
        driver.get(baseurl);
        driver.manage().window().maximize(); // maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //timeout session
        String titel = driver.getTitle(); // storing title
        System.out.println("Title of the page : " + titel); // printing title  in concol
        String url = driver.getCurrentUrl(); // getting url
        System.out.println("Current url : " + url); //
        String source = driver.getPageSource();
        System.out.println("page source :"+ source);
        System.out.println("Title of the page :"+ url);
        WebElement emailIDField = driver.findElement(By.name("username")); //storing email
        emailIDField.sendKeys("tomsmith");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        //  driver.close();
    }
}


