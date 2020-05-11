import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

@Test
    public void simple_function(){
        System.out.println("its working fine");
        WebDriver driver;
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
    }
}
