package Pages.ElementsPages;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.xpath("//input [@id = 'username']"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.xpath("//input[@type='email']"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.xpath("//textarea [@placeholder = 'Current Address']"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//button[@id='submit']")) ;
    }
    // _ _ _ _ _ _ _ _ _ _ _ _ _ _ _

    public void insertUsername (String username){
        this.getFullName().clear();
        this.getFullName().sendKeys(username);
    }
    public void insertEmail (String email){
        this.getEmail().clear();
        this.getEmail().sendKeys(email);
    }
    public void insertCurrentAddress (String currentAddress){
        this.getEmail().clear();
        this.getEmail().sendKeys(currentAddress);
    }
    public void insertPermanentAddress (String permanentAddress){
        this.getEmail().clear();
        this.getEmail().sendKeys(permanentAddress);
    }
    public void clickSubmit() {
        this.getSubmitButton().click();
    }

}