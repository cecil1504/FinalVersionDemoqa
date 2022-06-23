import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement homeField;
    WebElement collapseAllButton;
    WebElement expandAllButton;
    WebElement message;


    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHomeField() {
        return homeField;
    }

    public WebElement getCollapseAllButton() {
        return collapseAllButton;
    }

    public WebElement getExpandAllButton() {
        return expandAllButton;
    }

    public WebElement getMessage() {
        return message;
    }
    //______________

}