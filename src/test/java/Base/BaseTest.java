package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homePageURL;
    //public ExcelReader excelReader;
    //public Homepage homepage;

    public BaseTest(WebDriver driver,WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    //Before se izvrsava pre svakog testa i unutar te metode ubacujem sta ocekujem da se uradi pre svakog testa
    @BeforeClass
    public void setUp () throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\PC\\Desktop\\TestData.xlsx");
        //Putanja koju prosledjujem za citanje excel fajla je jedinstvena za moj racunar
        // i mora se promeniti putanja ako se testiranje vrsi na drugom racunaru
        homePageURL = excelReader.getStringData ("URLs", 1, 0);

    }
    public void visibilityWait (WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickabilityWait (WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void scrollIntoView (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    @AfterClass
    public void tearDown () {
       // driver.close();
        // driver.quit();
}
}