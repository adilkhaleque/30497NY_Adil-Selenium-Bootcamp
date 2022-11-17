package system.Authentication;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import parabank_app_library.AccountServicesPage;
import parabank_app_library.HomePage;
import parabank_app_library.RegistrationPage;
import utils.GenerateData;

import java.awt.*;
import java.io.IOException;

public class TestAuthentication extends BasePage {

//    @Test
//    public void testRegisterNewAccount() throws AWTException, IOException {
//        HomePage homePage = new HomePage();
//        GenerateData generateData = new GenerateData();
//
//        String[] testData = excel.readStringArray("AccountRegisteredSuccessfully");
//
//        String firstName = generateData.firstName();
//        String lastName = generateData.lastName();
//        String streetAddress = generateData.streetAddress();
//        String city = generateData.city();
//        String state = generateData.state();
//        String zip = generateData.zipCode();
//        String phoneNumber = generateData.mobilePhone();
//        String ssn = generateData.ssn();
//        String username = generateData.email().split("@")[0];
//        String password = generateData.password();
//
//        RegistrationPage registrationPage = homePage.clickRegisterNewAccountButton();
//        registrationPage.fillRegistrationAccountForm(firstName, lastName, streetAddress, city, state, zip, phoneNumber,
//                ssn, username, password);
//
//        AccountServicesPage accountServicesPage = registrationPage.submitAccountRegistrationForm();
//
//        Assert.assertEquals(accountServicesPage.getAccountRegistrationMessage(), testData[0]);
//    }
}
