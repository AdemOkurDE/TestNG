package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_TC001_Adm {

    @Test
    public void visitorAnasayfaHeaderAlaniTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        UserHomepage visitorPage= new UserHomepage();

        Assert.assertTrue(visitorPage.logoHome.isDisplayed());
        Assert.assertTrue(visitorPage.logoHome.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuHome.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuHome.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuListing.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuListing.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuProjects.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuProjects.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuAgents.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuAgents.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuBlog.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuBlog.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuContact.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuContact.isEnabled());

        Assert.assertTrue(visitorPage.linkMenuSingUp.isDisplayed());
        Assert.assertTrue(visitorPage.linkMenuSingUp.isEnabled());

        Assert.assertTrue(visitorPage.linkAddProperty.isDisplayed());
        Assert.assertTrue(visitorPage.linkAddProperty.isEnabled());

        Assert.assertTrue(visitorPage.linkSignIn.isDisplayed());
        Assert.assertTrue(visitorPage.linkSignIn.isEnabled());

        Assert.assertTrue(visitorPage.linkWishlist.isDisplayed());
        Assert.assertTrue(visitorPage.linkWishlist.isEnabled());


        visitorPage.linkMenuHome.click();

        ReusableMethods.bekle(1);
    Driver.closeDriver();
    }

}
