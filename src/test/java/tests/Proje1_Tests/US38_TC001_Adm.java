package tests.Proje1_Tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class US38_TC001_Adm {

    /*  User Story 38 :

        admin dahsboarda giriş yapıp Real Estate başlığının altındaki
        Types sayfasına ulaşabildiğimi
        ve bu sayfadaki Types 'lerin görüntülenebildiğini,
        Types sayısının görüntülenebilidğini,
        sayfadaki öğelerin görüntülenebilir
        ve aktif olduğunu,
        yeni Types ekleyip,
        düzeneleyip
        silebildiğimi doğrulayabilmeliyim

     */

    /*  Kabul kriterleri :
        Kullanici admin bolumunde Real Estate altindaki
        Types sayfasina ulasalbilmelidir
        Sayfadaki Typesleri goruntuleyebilmelidir
        Sayfadaki diger ogeleri goruntuleyebilmelidir
        Yeni Types ekleyebilmelidir
        Varolan Types'leri duzenleyebilmelidir
        Type'leri silebilmelidir
    */
    /*  Test Case-1:
        admin dashboarda giris yapip
        Real Estate baslik altindaki
        Types sayfasina ulasilabildigi dogrulanir.

        Test Case-2:
        Types lerin görüntülenebildigi dogrulanir
        Types sayisinin ve
        ögelerin görüntülenebildigi dogrulanir

        Test Case-3:
        Types eklenebildigi dogrulanir

        Test Case-4:
        Types düzenlenebildigi dogrulanir

        Test Case-5:
        Types silinebildigi dogrulanir
        Sayfa kapatilir.

     */

    //Common Objects
    AdminDashboard adminPage = new AdminDashboard();
    UserDashboard userDashboard = new UserDashboard();
    JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());
    String newTypesValue="aa";
    @Test
    public void adminRealEstateTypes_01_MenuTest() {

        //  jsExecutor ile Webelemente gitme örnek:
        // jsExecutor.executeScript("arguments[0].scrollIntoView(true);", userDashboard.dashBoard);

        // jsExecutor ile Webelemente tiklama örnek:
        // jsExecutor.executeScript("arguments[0].click();", userDashboard.properties);

        //User goes to admin login page
        //Go to qa.hauseheaven.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Enters valid username and password, presses the login button
        adminPage.textBoxAdminUserNameOnLogInPage.sendKeys(ConfigReader.getProperty("admin01"));
        adminPage.textBoxAdminPassword.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.adminLogInButton.click();

        //Verifies that you are on the admin page
        Assert.assertTrue(adminPage.labelAccountsText.getText().contains("Dashboard"));

        //Click on Real Estate menu
        adminPage.realEstateButton.click();

        //Click on the Types link that opens under it and go to the Types page.
        adminPage.realEstateTypeButton.click();

        //Verifies that you're on the Types page
        //Verifies that you are on the admin page
        Assert.assertTrue(adminPage.labelAccountsText.getText().contains("Types"));
    }

    @Test
    public void adminRealEstateTypes_02_DisplayedTest() {

        //Verifies that the number of Types appears
        //jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.labelPropertiesRecords);
        String recordsNummer=adminPage.labelPropertiesRecords.getText();
        int records= Integer.parseInt(recordsNummer);
        System.out.println("total records : "+records);
        Assert.assertTrue(records>=0,"number of records verified");

        List<WebElement> typesRecordsList=Driver.getDriver().findElements(By.xpath("//td[@class=' text-start column-key-name']"));
        for (WebElement each: typesRecordsList
        ) {
            System.out.println(each.getText());
        }

        //Types verifies that other elements on the page are visible and active
        // WebElements  :- adminPage.editButton
        //              :- adminPage.deleteButton
        //              :- adminPage.checkboxAdminRealEstateTypesFirstSelect
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.editButton);
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.editButton.isDisplayed());
        Assert.assertTrue(adminPage.deleteButton.isDisplayed());
        Assert.assertTrue(adminPage.checkboxAdminRealEstateTypesFirstSelect.isDisplayed());

    }
    @Test
    public void adminRealEstateTypes_03_newTypesAddTest() {

        //Click on add new types button  // facilitiesCreateFacilitiesButton
ReusableMethods.wait(2);
        adminPage.facilitiesCreateFacilitiesButton.click();

        //Enters appropriate values for new types
        //name - textBoxCategoryName
        //code - textBoxCategoryCode
        //slug - textBoxCategorySlug
        //order by - textBoxCategoryOrderBy
        // save&exit - saveExitButton
        //Name text box 'i jsExecutor ile bul

        //Name text box a "aa" degeri gir
ReusableMethods.wait(2);
        adminPage.textBoxCategoryName.click();
        actions.sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys("1").perform();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.saveExitButton);
        ReusableMethods.wait(1);
        jsExecutor.executeScript("arguments[0].click();",adminPage.saveExitButton);

        //adminPage.saveExitButton.click();

        //Verifies that Types have been created  // textAdminRealEstateTypesFirstSelect
        Assert.assertTrue(adminPage.labelSuccessfullDelete.isDisplayed());
        String actualValue=adminPage.textAdminRealEstateTypesFirstSelect.getText();
        ReusableMethods.wait(1);
        Assert.assertEquals(actualValue,newTypesValue);

    }
    @Test
    public void adminRealEstateTypes_04A_editTypes_WithIconTest() {

        //Clicks the Types edit button
        // jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.editButton);
        newTypesValue="bb";
        adminPage.editButton.click();
        ReusableMethods.wait(1);
        adminPage.textBoxCategoryName.click();
        ReusableMethods.wait(1);
        actions.sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys("2").perform();
        ReusableMethods.wait(1);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.saveExitButton);
        ReusableMethods.wait(1);
        jsExecutor.executeScript("arguments[0].click();",adminPage.saveExitButton);

        //Edits Types and verifies changes
        String previousValue="aa";
        String actualValue=adminPage.textAdminRealEstateTypesFirstSelect.getText();
        Assert.assertNotEquals(actualValue,previousValue);

    }
    @Test
    public void adminRealEstateTypes_04B_editTypes_WithMenuTest() {

        // new Types add
        adminPage.facilitiesCreateFacilitiesButton.click();
        ReusableMethods.wait(1);
        adminPage.textBoxCategoryName.click();
        ReusableMethods.wait(1);
        actions.sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys(newTypesValue+Keys.TAB)
                .sendKeys("1").perform();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.saveExitButton);
        ReusableMethods.wait(1);
        jsExecutor.executeScript("arguments[0].click();",adminPage.saveExitButton);
        ReusableMethods.wait(3);
        //Name edit with js Bulk action menu
        //Clicks the first Types checkbox
        adminPage.checkboxAdminRealEstateTypesFirstSelect.click();
        ReusableMethods.wait(2);
        adminPage.buttonTypesBulkActionSelection.click();
        ReusableMethods.wait(2);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.buttonTypesNameEditJs);
        ReusableMethods.wait(3);

        ////

        ////burada name edit icin tiklama yapilmali ancak su an yapmiyor...
        // javascript. action fare surukleme vs islemi gerekli
        try {
            actions.click(adminPage.buttonTypesNameEditJs).perform();

            ReusableMethods.wait(2);
        newTypesValue="cc";
        actions.click(adminPage.textBoxCategoryValue).perform();
        adminPage.textBoxCategoryValue.sendKeys(newTypesValue);
        ReusableMethods.wait(2);
        actions.click(adminPage.buttonTypesNameEditSubmit).perform();
        //adminPage.buttonTypesNameEditSubmit.click();

        } catch (Exception e) {
        System.out.println("Mouse can't click");
    }

        //Edits Types and verifies changes
        String previousValue="aa";
        String actualValue=adminPage.textAdminRealEstateTypesFirstSelect.getText();
        Assert.assertNotEquals(actualValue,previousValue);
        ReusableMethods.wait(2);
    }

    @Test
    public void adminRealEstateTypes_05_deleteTypesTest() {

        //Clicks the delete type button, clicks the confirm button and deletes the types
        String beforeDeleteValue = adminPage.textAdminRealEstateTypesFirstSelect.getText();
        // jsExecutor.executeScript("arguments[0].scrollIntoView(true);",adminPage.deleteButton);
        try {
            ReusableMethods.wait(2);
            adminPage.deleteButton.click();
            ReusableMethods.wait(1);
            adminPage.blogPostDeleteConfirmButton.click();
            ReusableMethods.wait(2);
        } catch (Exception e) {
            System.out.println("Something went wrong: Delete Pop Up Not Close");
            //WebElement close=Driver.getDriver().findElement(By.xpath("(//button[@class='btn-close'])[1]"));
           // close.click();
        }

        //Types verifies deleted
        Assert.assertTrue(adminPage.deleteSuccessfullyText.isDisplayed());
        String afterDeleteValue = adminPage.textAdminRealEstateTypesFirstSelect.getText();
        ReusableMethods.wait(2);
        Assert.assertNotEquals(afterDeleteValue, beforeDeleteValue);
    }
    @Test
    public void adminRealEstateTypes_06_deleteTypesCheckBoxTest() {
        String beforeDeleteValue = adminPage.textAdminRealEstateTypesFirstSelect.getText();
        adminPage.checkboxAdminRealEstateTypesFirstSelect.click();
        ReusableMethods.wait(2);
        adminPage.buttonTypesBulkActionSelection.click();
        ReusableMethods.wait(2);

        WebElement deleteMenu=Driver.getDriver().findElement(By.xpath("//a[@class='delete-many-entry-trigger']"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);",deleteMenu);
        ReusableMethods.wait(1);
        actions.click(deleteMenu).perform();
        ReusableMethods.wait(2);
        adminPage.buttonDeleteConfirmWithCheckBox.click();

        ReusableMethods.wait(1);
        //closes the page
        Driver.closeDriver();

    }

}
