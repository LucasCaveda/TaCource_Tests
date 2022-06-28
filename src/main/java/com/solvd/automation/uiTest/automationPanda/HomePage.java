package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(css = "[class='search-field']")
    private ExtendedWebElement searchButton;



    public HomePage(WebDriver driver) {
        super(driver);
        open();
    }

    public void clickSearchButton() {
        searchButton.click();
    }


}
