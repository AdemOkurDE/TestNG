package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Deneme02 {

    @Test
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));
        //2- login linkine basin
        UserHomepage visitorPage = new UserHomepage();

        //qdPage.cookieAccept.click();
        visitorPage.linkSignIn.click();
        // 3- Kullanici email'i olarak valid email girin
        visitorPage.usernameTextbox.sendKeys(ConfigReader.getProperty("userName"));
        // 4- Kullanici sifresi olarak valid sifre girin
        visitorPage.passwordTextbox.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.bekle(1);

        visitorPage.cookiesAllowButton.click();
        ReusableMethods.bekle(2);
        // 5- Login butonuna basarak login olun
        visitorPage.loginButonu.click();
        // 6- Basarili olarak giris yapilabildigini test edin
        ReusableMethods.bekle(2);
        Assert.assertTrue(visitorPage.basariliGirisKontrolElementi.isDisplayed());

        Driver.closeDriver();
    }
}
