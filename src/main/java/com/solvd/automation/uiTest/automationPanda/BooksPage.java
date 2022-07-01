package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends AbstractPage {
    @FindBy(xpath = "//li//a[contains(@href,'https://automationpanda.com/2018/09/27/book-review')]")
    private ExtendedWebElement bookReviewLink;

    public BooksPage(WebDriver driver) {
        super(driver);
        setPageURL("/books/");
        open();
    }

    public void clickBookReviewLink(){
        bookReviewLink.click();
    }

}
