package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sidebarpage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadAndDownload;
    WebElement elementsTitle;

    public Sidebarpage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.xpath("//span[text()='Text Box']"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.xpath("//span[text()='Check Box']"));
    }

}
