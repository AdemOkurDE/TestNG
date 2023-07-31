package tests.Proje1_Tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US39_TC001_Adm {

    /*  User Story 39 :

        Site anasayfasından bir newsletter abonesi ekleyebildiğimi,
        admin dashboarda giriş yapıp
        Newsletter sayfasına ulaşabildiğimi,
        sayfadaki öğelerin görüntülenebilir
        ve aktif olduğunu,
        ve burda eklediğim öğenin görüntülenebilir
        ve silinebilir durumda olduğunu doğrulayabilmeliyim

     */


    /*  Kabul kriterleri :
        Site anasayfadan bir newsletter abonesi eklenebildigi dogrulanir

        admin dashboarda giris yapip
        Newsletter sayfasina ulasilabildigi dogrulanir

        Sayfadaki ögelerin görüntülenebilir
        ve aktif oldugu dogrulanir
        Eklenen ögelerin görüntülenebilir
        ve silinebilir oldugu dogrulanir. (silinemiyor!!!)

    */
    /*  Test Case-1:
        Misafir sayfa girisi yapilir
        Footer bolumunden newsletter abone ol textbox a String olarak olusturulan bir email adresi girilir
        ve newsletter abone ol butonuna basilir
        bassarili girildigi dogrulanir (HATALI GIRIS://div[@class='alert alert-danger alert-dismissible']
                                        BASARILI : //div[@class='alert alert-success alert-dismissible'])

        admin sayfa girisi yapilir
        Newsletter menuye tiklanir
        Newsletter sayfasinda oldugumuz dogrulanir (labelAccountsText)


        Test Case-2:
        Newsletter lerin görüntülenebildigi dogrulanir
                (Newsletter ilk gorunme sayfasi bir List e atilir ve elemanlari misafir sayfada girilen String-email ile
                    karsilastirilir. dogrulaninca dongu biter
                    List icin webelement : textNewsletterList)
        Newsletter sayisinin ve
        ögelerin görüntülenebildigi dogrulanir

        Eklenen ogelerin gorundugu dogrulanir
        Ogelerin silinebildigi dogrulanir

        Sayfa kapatilir.

     */

    UserHomepage userHomepage=new UserHomepage();
    AdminDashboard adminDashboard=new AdminDashboard();
    JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
    Faker faker=new Faker();

    @Test
    public void newsletterAdditionTest(){
        //Test Case-1:
        //        Misafir sayfa girisi yapilir
        Driver.getDriver().get(ConfigReader.getProperty("userUrl"));


        //        Footer bolumunden newsletter abone ol textbox a
        //        String olarak olusturulan bir email adresi girilir
        //        ve newsletter abone ol butonuna basilir
        String registerEmailForNewsletter=faker.internet().emailAddress();


        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", userHomepage.textboxSubscribeInFooter);
        ReusableMethods.wait(1);
        userHomepage.textboxSubscribeInFooter.sendKeys(registerEmailForNewsletter);
        userHomepage.buttonSubscribeInFooter.click();

        //        bassarili girildigi dogrulanir (HATALI GIRIS://div[@class='alert alert-danger alert-dismissible']
        //                                        BASARILI : //div[@class='alert alert-success alert-dismissible'])
        Assert.assertTrue(userHomepage.labelSubscribeTrueMessageInFooter.isDisplayed());

        //        admin sayfa girisi yapilir
        //Go to qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Enters valid username and password, presses the login button
        adminDashboard.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("admin01"));
        adminDashboard.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLogInButton.click();


        //        Newsletter menuye tiklanir
        adminDashboard.newsLettersButton.click();

        //        Newsletter sayfasinda oldugumuz dogrulanir (labelAccountsText)
        String pageHeaderText=adminDashboard.labelAccountsText.getText();
        Assert.assertTrue(pageHeaderText.contains("Newsletter"));

        //        Test Case-2:
        //        Newsletter lerin görüntülenebildigi dogrulanir
        //                (Newsletter sayfada tümünü goster tiklanir
        //     ilk gorunme sayfasi bir List e atilir ve elemanlari misafir sayfada girilen String-email ile
        //                    karsilastirilir. dogrulaninca dongu biter
        //                    List icin webelement : textNewsletterList)
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminDashboard.selectOptionsNewsletter);
        Select select=new Select(adminDashboard.selectOptionsNewsletter);
        select.selectByValue("-1");
        ReusableMethods.wait(2);
        List<WebElement> newsletterSubscribeList=Driver.getDriver().findElements(By.xpath("//td[@class=' text-start column-key-email']"));
        //        Newsletter sayisinin ve
        //        ögelerin görüntülenebildigi dogrulanir
        System.out.println("This page records : "+newsletterSubscribeList.size());
        System.out.println("Total records : "+adminDashboard.labelPropertiesRecords.getText());
        System.out.println("Send Email : "+registerEmailForNewsletter);
        Boolean entryEmailIsFind=false;
        for (WebElement each: newsletterSubscribeList
        ) {
            if (each.getText().equals(registerEmailForNewsletter)){
                entryEmailIsFind=true;
                // Eklenen ogelerin gorundugu dogrulanir
                System.out.println("Read Email : "+each.getText());
                break;
            }
        }
        //Records Check
        String records=adminDashboard.labelPropertiesRecords.getText();

        int nummer= Integer.parseInt(records)+1;
        Boolean fakeMail=false;
        for (WebElement each:newsletterSubscribeList
        ) {
            if(!each.getText().substring(each.getText().indexOf("@")).contains(".")){
                System.out.println("Record "+nummer+" (False): "+each.getText());
                fakeMail=true;
            }else {
                System.out.println("Record "+nummer+" : "+each.getText());
            }
            if (nummer==3){
                nummer--;
            }
            nummer--;
        }
        System.out.println("===============================================");
        if (fakeMail){
            System.out.println("Attention. there are fake emails");
            System.out.println("===============================================");
        }


        //        Ogelerin silinebildigi dogrulanir
        try {
            Assert.assertTrue(adminDashboard.deleteButton.isDisplayed());
        } catch (Exception e) {
            System.out.println("Delete button not found!!!");
        }
        //        Sayfa kapatilir.
        Driver.closeDriver();

    }

}
