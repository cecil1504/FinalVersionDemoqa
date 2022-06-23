package Pages.ElementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement doubleClickButton;
    WebElement rightClickButton;
    WebElement dynamicClickButton;
    WebElement dynamicClickMessage;
    WebElement rightClickMessage;
    WebElement regularClickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
