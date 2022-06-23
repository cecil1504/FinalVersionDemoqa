package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElements extends BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void pageSetUp (){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
}
    @Test
    public void Test1 () {
        //homepagePage.clickOnElementsPageButton;
        //textBoxPage.insertUsername ("cecil_et_lena");
        //textBoxPage.insertEmail ("wordpress100@gmail.com");
        //textBoxPage.insertCurrentAddress ("Ulica akacija br.9");
        //textBoxPage.insertPermanentAddress ("Ulica lipa br.15");
        //scrollIntoView (textBoxPage.getSubmitButton());
        //textBoxPage.clickOnSubmitButton();

        //da proverimo da li smo na ocekivanoj stranici
        String expectedURL = "https://demoqa.com/text-box";
        // Assert.assertTrue(expectedURL.equals(textBoxPage.getUrlTextBoxPage()));
    }
}