package tests.Proje1_Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

public class MouseHoverByOffset {
    public static void main(String[] args) throws Exception {
        //Set the path of the Chromedriver path

        //Instantiate the Chrome driver
        //WebDriver driver = new ChromeDriver();

        //Launch the website
        Driver.getDriver().get("https://testsigma.com/");
        Driver.getDriver().manage().window().maximize();
        ReusableMethods.wait(3);
        //Identify the element to be hovered
        //WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()=’Resources’]"));
        WebElement element1=Driver.getDriver().findElement(By.xpath("//*[@class='btn_github banner_schedule_button']"));

        //Instantiate of the Actions class
        Actions actions = new Actions(Driver.getDriver());

        // Perform the mouse hover action
        //actions.moveToElement(element, 10, 20).build().perform();

        actions.moveToElement(element1).build().perform();
        element1.click();
        Thread.sleep(3000);
        //close the browser
        Driver.getDriver().close();
    }
}
