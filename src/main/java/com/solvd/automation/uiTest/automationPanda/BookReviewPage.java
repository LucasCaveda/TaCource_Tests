package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class BookReviewPage extends AbstractPage {

    public BookReviewPage(WebDriver driver) {
        super(driver);
        setPageURL("/2018/09/27/book-review-pytest-quick-start-guide/");
        open();
    }
}
