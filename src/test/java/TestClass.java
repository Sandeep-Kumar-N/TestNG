import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass {

    WebDriver driver;
    @BeforeSuite
    void before_suite() {
        System.out.println("before_suite");
    }

    @BeforeTest
    void before_test() {
        System.out.println("before_test");
    }



    @BeforeClass
    void before_class() {
        System.out.println("before_class");
    }



    @BeforeMethod
    void before_method() {
        System.out.println("before_method");
        System.out.println("Opening a browser");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        WebDriverManager.chromedriver().version("81.0.4044.138").setup();
        driver = new ChromeDriver();
    }


    @Test()
    public void open_url(){
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
    }

    @Test(dependsOnMethods = "open_url")
    public void print_title() {
        System.out.println(driver.getTitle());
    }

    @Test(dependsOnMethods = "print_title",priority = 1)
    public void end_test() {
        System.out.println("end test");
    }


    @AfterSuite
    void After_suite() {
        System.out.println("After_suite");
    }

    @AfterTest
    void After_test() {
        System.out.println("After_test");
    }



    @AfterClass
    void After_class() {
        System.out.println("After_class");
    }



    @AfterMethod
    void After_method() {
        System.out.println("After_method");
        driver.quit();
    }
}
