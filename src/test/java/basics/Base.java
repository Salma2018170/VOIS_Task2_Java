package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.ServicesPage;

public class Base {
    WebDriver driver;
    //Pages
    protected HomePage homePage;
    protected ServicesPage servicesPage;
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        homePage=new HomePage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
