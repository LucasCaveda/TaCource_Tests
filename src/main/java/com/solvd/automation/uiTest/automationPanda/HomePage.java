package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

import static org.openqa.selenium.Keys.ENTER;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//input[contains(@class,'search-field')]")
    private ExtendedWebElement searchField;

    @FindBy(xpath = "//h1[@class='entry-title'][contains(.,'Books')]")
    private ExtendedWebElement wordFounded;

    @FindBy(xpath = "//li//a[contains(.,'Books')]")
    private ExtendedWebElement booksPage;

    @FindBy(xpath = "//li//a[contains(@href,'https://automationpanda.com/python/')]")
    private ExtendedWebElement pythonPage;

    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }


    public void clickSearchButton() {
        searchField.click();
    }

    public void searchWord(){
        searchField.type("books");
        searchField.sendKeys(ENTER);
    }

    public String getWord(){
        return wordFounded.getText();
    }

    public void go2BooksPage(){
        booksPage.click();
    }

    public void go2PythonPage(){
        pythonPage.click();
    }

}
