package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US38_TC001_Adm {


    @Test
    public void adminRealEstateTypesMenuTest() {

        AdminDashboard adminPage = new AdminDashboard();
        UserDashboard userPage = new UserDashboard();

        //User goes to admin login page
        //Go to qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Enters valid username and password, presses the login button
        adminPage.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("admin01"));
        adminPage.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.adminLogInButton.click();

        //Verifies that you are on the admin page
        Assert.assertTrue(adminPage.labelAccountsText.isDisplayed());

        //Click on Real Estate menu
        adminPage.realEstateButton.click();


        //Click on the Types link that opens under it and go to the Types page.
        adminPage.realEstateTypeButton.click();

        //Verifies that you're on the Types page


        //Verifies that the number of Types appears
        //Types verifies that other elements on the page are visible and active
        //Click on add new types button
        //Enters appropriate values for new types
        //Verifies that Types have been created
        //Clicks the Types edit button
        //Edits Types and verifies changes
        //Clicks the delete type button, clicks the confirm button and deletes the types
        //Types verifies deleted

        ReusableMethods.bekle(5);
        //closes the page
        Driver.closeDriver();

    }

}
