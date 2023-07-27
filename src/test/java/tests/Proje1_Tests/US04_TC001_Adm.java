package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US04_TC001_Adm {

    @Test
    public void visitorAnasayfaFooterBolumuTesti(){
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        UserHomepage visitorPage= new UserHomepage();

        Assert.assertTrue(visitorPage.allPropertiesButtonInFooter.isDisplayed());
        Assert.assertTrue(visitorPage.allPropertiesButtonInFooter.isEnabled());





        Driver.closeDriver();

    }
}
