package testcases;

import basics.Base;
import org.testng.annotations.Test;

public class E2EScenario extends Base {
    @Test
    public void choosePopularRoute() {
        homePage.findRoute();
        homePage.selectArrivalDate();
        servicesPage = homePage.clickOnSearchBusButton();
    }

    @Test
    public void confirmTrip() {
        servicesPage.clickOnSelectSeat();
        servicesPage.selectSeatNum();
        servicesPage.clickOnCustomerDetails();
        servicesPage.fillCustomerData("6789125987", "salma@gmail.com");
        servicesPage.fillPassengerData("salma", "23");
        servicesPage.checkPayment();
    }
}

