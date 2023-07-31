package tests.Proje1_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_TC001_Adm {

    @Test
    public void visitorHomepageHeaderMenuVerifyTest(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        Actions actions =new Actions(Driver.getDriver());

        //go to qa.hauseheaven.com page

        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        UserHomepage visitorPage= new UserHomepage();

        if (visitorPage.copyrightInFooter.isDisplayed()){
            visitorPage.cookiesAllowButton.click();
        }

        //Located in the header section;
        //Home, Listing, Projects, Agents, Blog, Contact, Sign Up menus are "visible".
        //Home, Listing, Projects, Agents, Blog, Contact, Sign Up menus are "active".

        // Logo link Visibility and is link active Check
        Assert.assertTrue(visitorPage.logoHome.isDisplayed());
        jsExecutor.executeScript("arguments[0].click();",visitorPage.logoHome);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.hauseheaven.com"));

        // Home link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuHome.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuHome).build().perform();
        visitorPage.linkMenuHome.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.hauseheaven.com"));

        // Listing link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuListing.isDisplayed());
        //jsExecutor.executeScript("arguments[0].click();",visitorPage.linkMenuListing);
        actions.moveToElement(visitorPage.linkMenuListing).build().perform();
        visitorPage.linkMenuListing.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("properties"));

        // Projects link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuProjects.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuProjects).build().perform();
        visitorPage.linkMenuProjects.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("projects"));

        // Agents link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuAgents.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuAgents).build().perform();
        visitorPage.linkMenuAgents.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("agents"));

        // Blog link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuBlog.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuBlog).build().perform();
        visitorPage.linkMenuBlog.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blog"));

        // Contact link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuContact.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuContact).build().perform();
        visitorPage.linkMenuContact.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("contact"));

        // SingUp link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkMenuSingUp.isDisplayed());
        actions.moveToElement(visitorPage.linkMenuSingUp).build().perform();
        visitorPage.linkMenuSingUp.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

        // AddProperty link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkAddProperty.isDisplayed());
        actions.moveToElement(visitorPage.linkAddProperty).build().perform();
        visitorPage.linkAddProperty.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

        // SignIn link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkSignIn.isDisplayed());
        actions.moveToElement(visitorPage.linkSignIn).build().perform();
        visitorPage.linkSignIn.click();
        jsExecutor.executeScript("arguments[0].click();",visitorPage.linkSignIn);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

        ReusableMethods.wait(1);
        // Wishlist link Visibility and is link active Check
        Assert.assertTrue(visitorPage.linkWishlist.isDisplayed());
        jsExecutor.executeScript("arguments[0].click();",visitorPage.linkWishlist);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("wishlist"));
        ReusableMethods.wait(1);

        // Close the page
        Driver.closeDriver();

    }

}
