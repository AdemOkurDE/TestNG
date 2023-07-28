package tests.Proje1_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US18_TC001_Adm {

    @Test
    public void userHomepageBodySearchTest(){

        UserHomepage visitorPage=new UserHomepage();
        UserDashboard userPage=new UserDashboard();

    //Go to qa.hauseheaven.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

    //Clicking on the Sign In link opens the login page.
        visitorPage.linkSignIn.click();
        if (visitorPage.copyrightInFooter.isDisplayed()){
            visitorPage.cookiesAllowButton.click();
        }

    //Enter the valid username and userpassword and click the login button.
        visitorPage.usernameTextbox.sendKeys(ConfigReader.getProperty("userName"));
        visitorPage.passwordTextbox.sendKeys(ConfigReader.getProperty("userPassword"));
        visitorPage.loginButonu.click();

    //The registered username is displayed
        Assert.assertTrue(userPage.headerUserName.isDisplayed());

    //Search is done in the search section on the home page
        userPage.searchForLocation.sendKeys("Germany");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", userPage.searchResult);
        //userPage.searchResult.click();

    //Verify that the result text is displayed
        Assert.assertTrue(userPage.foundResults.isDisplayed());
        ReusableMethods.bekle(2);
    //page is closed
        Driver.closeDriver();



}


}
