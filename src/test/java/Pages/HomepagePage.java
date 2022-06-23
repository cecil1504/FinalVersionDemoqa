package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomepagePage {
    WebDriver driver;
    WebDriverWait wdwait;
    //ExcelReader excelReader;
    String elementsPage;
    String formsPage;
    String alertsFrameWindowsPage;
    String widgetsPage;
    String interactionsPage;
    String bookStoreAppPage;
    WebElement homepageBanner;

    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
        //u konstruktor treba dodati i ExcelReader excelReader
        //this.excelReader = excelReader;
        // elementsPage = excelReader.getStringData ("ButtonNames", 1, 0);
        // formsPage = excelReader.getStringData ("ButtonNames", 2, 0);
        //alertsFrameWindowsPage = excelReader.getStringData ("ButtonNames", 3, 0);
        //widgetsPage = excelReader.getStringData ("ButtonNames", 4, 0);
        //interactionsPage = excelReader.getStringData ("ButtonNames", 5, 0);
        //bookStoreAppPage = excelReader.getStringData ("ButtonNames", 6, 0);
    }

    public WebElement getHomepageBanner() {
        return driver.findElement(By.className("home-banner"));
    }
    public void scrollToBottomOfThePage (){
        //ova metoda je potrebna kako bi program dohvatio sve potrebne elemente koji se na njoj nalaze
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public List<WebElement> cardBodyList () {
        List<WebElement> list = new ArrayList<WebElement>(driver.findElements(By.className("card-up")));
        return list;
    }
    public void clickOnElementsPageButton () {
        scrollToBottomOfThePage();
        //za svaki element primenjujemo gore formiranu metodu
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(elementsPage)){
                cardBodyList().get(i).click();
                break;
            }
        }
    }
    public void clickOnFormsPageButton () {
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(formsPage)){
                cardBodyList().get(i).click();
                break;

            }
        }
    }
    public void clickOnAlertsFrameWindowsPageButton () {
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(alertsFrameWindowsPage)){
                cardBodyList().get(i).click();
                break;
            }
        }
    }
    public void clickOnWidgetsPageButton () {
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(widgetsPage)){
                cardBodyList().get(i).click();
                break;
            }
        }
    }
    public void clickOnInteractionsPageButton () {
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(interactionsPage)){
                cardBodyList().get(i).click();
                break;
            }
        }
    }
    public void clickOnbookStoreAppPageButton () {
        for (int i = 0; i< cardBodyList().size(); i++) {
            if (cardBodyList().get(i).getText().equals(bookStoreAppPage)){
                cardBodyList().get(i).click();
                break;
            }
        }
    }
}

