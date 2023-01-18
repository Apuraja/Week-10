package orangerhrmlive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
public class Firefox {
    public static void main(String[] args) {              // main method
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //storing url
        System.setProperty("webdriver.geko.driver","src/drivers/geckodriver.exe"); // setting webdriver
        WebDriver driver= new FirefoxDriver();  // creating object of Firefox webdriver
        driver.get(baseurl); // method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // timeout session
        String title = driver.getTitle();
        System.out.println("Title of the page :"+ title);  // printing title
        String url = driver.getCurrentUrl();
        System.out.println("Current url"+ url);  // printing url
        String source = driver.getPageSource();
        System.out.println("page source :"+ source);
        System.out.println("Title of the page :"+ url);
        WebElement emailIDField = driver.findElement(By.name("username")); //storing email
        emailIDField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin12");
        driver.findElement(By.className("oxd-button")).click();
        // driver.close();
    }
}

