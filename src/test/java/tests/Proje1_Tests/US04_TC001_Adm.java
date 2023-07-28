package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04_TC001_Adm {

    @Test
    public void visitorHomepageFooterVerifyTest(){

        //go to qa.hauseheaven.com page
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        UserHomepage visitorPage= new UserHomepage();

        if (visitorPage.copyrightInFooter.isDisplayed()){
            visitorPage.cookiesAllowButton.click();
        }

        //Located in the footer section;
        //Contact Info, About us, Contact us, Terms & Conditions,  are "visible" and "active".
        Assert.assertTrue(visitorPage.footerContactInfo.isDisplayed());

        Assert.assertTrue(visitorPage.aboutUsButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.aboutUsButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.contactUsButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.contactUsButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.TermsAndConditionsButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.TermsAndConditionsButtonInFooter.isEnabled());

        //All properties,Houses for sale,Houses for rent Blog,  are "visible" and "active".

        Assert.assertTrue(visitorPage.allPropertiesButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.allPropertiesButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.housesForSaleButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.housesForSaleButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.houseForRentButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.houseForRentButtonInFooter.isEnabled());

        //News-1,News-2,News-3,News-4,News-5,  are "visible" and "active".

        Assert.assertTrue(visitorPage.newsOneButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.newsOneButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.newsTwoButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.newsTwoButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.newsThreeButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.newsThreeButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.newsFourButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.newsFourButtonInFooter.isEnabled());

        Assert.assertTrue(visitorPage.newsFiveButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.newsFiveButtonInFooter.isEnabled());

        //Google Play Store,Apple Store,Subscribe, are "visible" and "active".

        Assert.assertTrue(visitorPage.googlePlayIconInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.googlePlayIconInFooter.isEnabled());

        Assert.assertTrue(visitorPage.appleStoreIconInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.appleStoreIconInFooter.isEnabled());

        Assert.assertTrue(visitorPage.buttonSubscribeInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.buttonSubscribeInFooter.isEnabled());


        //Copyright,Facebook,Twitter,Instagram,LinkedIn,Pinterest are "visible" and "active".

        Assert.assertTrue(visitorPage.copyrightInFooter.isDisplayed());

        Assert.assertTrue(visitorPage.linkFacebookInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.linkFacebookInFooter.isEnabled());

        Assert.assertTrue(visitorPage.linkTwitterInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.linkTwitterInFooter.isEnabled());

        Assert.assertTrue(visitorPage.linkInstagramInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.linkInstagramInFooter.isEnabled());

        Assert.assertTrue(visitorPage.linkLinkedInInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.linkLinkedInInFooter.isEnabled());

        Assert.assertTrue(visitorPage.linkPinterestInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.linkPinterestInFooter.isEnabled());

        //The page is closed
        Driver.closeDriver();

    }
}
