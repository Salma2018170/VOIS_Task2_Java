package pages;

import basics_funcations.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicesPage extends BasePage {
    WebDriver driver;
    //Locator
    By selectSeatButton = By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]");
    By seatNum = By.xpath("//*[@id=\"Forward118\"]");
    By customerDetailsButton = By.id("Forwardprofile-tab");
    By mobileNoField = By.id("mobileNo");
    By emailField = By.id("email");
    By nameField = By.id("passengerNameForward0");


    By ageField = By.id("passengerAgeForward0");
    By dropDownGender = By.id("genderCodeIdForward0");
    By dropDownConcession = By.id("concessionIdsForward0");
    By paymentButton=By.id("PgBtn");

    public ServicesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnSelectSeat() {
        driver.findElement(selectSeatButton).click();
    }

    public void selectSeatNum() {
        waitForLocator(seatNum);
        driver.findElement(seatNum).click();


    }

    public void clickOnCustomerDetails() {
        driver.findElement(customerDetailsButton).click();
    }

    public void fillCustomerData(String mobileNum, String email) {
        driver.findElement(mobileNoField).sendKeys(mobileNum);
        driver.findElement(emailField).sendKeys(email);


    }

    public void fillPassengerData(String name, String age) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(ageField).sendKeys(age);
        WebElement dropDownGenderElement = driver.findElement(dropDownGender);
        selectFromDropDown(dropDownGenderElement).selectByValue("25");
        driver.switchTo().alert().accept();
        WebElement dropDownConcessionElement = driver.findElement(dropDownConcession);
        selectFromDropDown(dropDownConcessionElement).selectByValue("1466060086837");
    }
    public void checkPayment(){
        driver.findElement(paymentButton).click();
    }
}
