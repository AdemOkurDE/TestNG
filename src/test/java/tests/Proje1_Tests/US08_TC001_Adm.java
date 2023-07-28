package tests.Proje1_Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_TC001_Adm {

    @Test
    public void agentsPageVisitorTest(){
        UserHomepage visitorPage=new UserHomepage();

        //Go to qa.hauseheaven.com
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));

        //Cookies allow
        if (visitorPage.copyrightInFooter.isDisplayed()){
            visitorPage.cookiesAllowButton.click();
        }
        //Click on the Agents link
        visitorPage.linkMenuAgents.click();

        //We are verified to be on the Agents page
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://qa.hauseheaven.com/agents");

        //It is verified that the number of registered postings of the first real estate agent is displayed
        Assert.assertTrue(visitorPage.linkFirstAgent.isDisplayed());

        Assert.assertTrue(visitorPage.labelFirstAgentNumberOfProperties.isDisplayed());
        System.out.println("Ilk emlakci ilan sayi : "+visitorPage.labelFirstAgentNumberOfProperties.getText());

        //Verify that the first real estate agent's name, email and phone number appear
        Assert.assertTrue(visitorPage.linkFirstAgent.isDisplayed());
        System.out.println("Ilk emlakci adi : "+visitorPage.linkFirstAgent.getText());

        Assert.assertTrue(visitorPage.labelFirstAgentContactInfo.isDisplayed());
        System.out.println("Ilk emlakci detay-2 : "+visitorPage.labelFirstAgentContactInfo.getText());

        //click the view button for the first real estate agent's postings

        Actions actions = new Actions(Driver.getDriver());
        //Agent detaylarina javascript executor ile tiklayabildim!

        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", visitorPage.buttonFirstAgentDetail);

        //We verify that the For Sale link is visible and active
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", visitorPage.headerFirstAgentDetail);
        //jsExecutor.executeScript("arguments[0].scrollIntoView(true);", visitorPage.linkFirstAgentForRent);


        ReusableMethods.bekle(1);


        jsExecutor.executeScript("arguments[0].click();", visitorPage.linkFirstAgentForRent);
        ReusableMethods.bekle(1);
        Assert.assertTrue(visitorPage.linkFirstAgentForRent.isEnabled());

        //We verify that the For Rent link is visible and active
        jsExecutor.executeScript("arguments[0].click();", visitorPage.linkFirstAgentForSale);
        ReusableMethods.bekle(1);
        Assert.assertTrue(visitorPage.linkFirstAgentForSale.isEnabled());

        // The page is close

        Driver.closeDriver();


    }


}
