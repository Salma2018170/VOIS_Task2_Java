package basics_funcations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    //
    //30
    private static final Duration DURATION=Duration.ofSeconds(60);
    public BasePage(WebDriver driver){

        this.driver=driver;
    }
    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,DURATION);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForLocator(By locator){
        WebDriverWait wait = new WebDriverWait(driver, DURATION);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public Select selectFromDropDown(WebElement element){
        Select select=new Select(element);
        return select;
    }
}
