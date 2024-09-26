package pages;

import basics_funcations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    WebDriver driver;
    //locator
    By targetRoute= By.xpath("//a[text()=' Chikkamagaluru - Bengaluru']");
    By arrivalDateField=By.xpath("//a[text()='29']");
    By searchBusButton=By.xpath("//*[contains(text(),'Search for Bus')]");
    public HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void findRoute(){
        WebElement routElement= driver.findElement(targetRoute);
        waitForElement(routElement);
        routElement.click();
    }
    public void selectArrivalDate(){
        driver.findElement(arrivalDateField).click();
    }
    public ServicesPage clickOnSearchBusButton(){
        driver.findElement(searchBusButton).click();
        return new ServicesPage(driver);
    }
}
