package tests.Proje1_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import pages.UserDashboard;
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
        UserDashboard userDashboard=new UserDashboard();

        //qdPage.cookieAccept.click();
        visitorPage.linkSignIn.click();
        // 3- Kullanici email'i olarak valid email girin
        userDashboard.userNameInput.sendKeys(ConfigReader.getProperty("userName"));
        // 4- Kullanici sifresi olarak valid sifre girin
        visitorPage.passwordTextBoxyusuf.sendKeys(ConfigReader.getProperty("userPassword"));
        ReusableMethods.bekle(1);

        visitorPage.cookiesAllowButton.click();
        ReusableMethods.bekle(2);
        // 5- Login butonuna basarak login olun
        visitorPage.loginButtonyusuf.click();
        // 6- Basarili olarak giris yapilabildigini test edin
        ReusableMethods.bekle(2);
        //Assert.assertTrue(visitorPage.basariliGirisKontrolElementi.isDisplayed());

        Driver.closeDriver();
    }
}
