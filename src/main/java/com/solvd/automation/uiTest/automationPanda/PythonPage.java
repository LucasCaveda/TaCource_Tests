package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PythonPage extends AbstractPage {

    @FindBy(xpath = "//h1[text()=\"Python\"]")
    private ExtendedWebElement findWord;

    public PythonPage(WebDriver driver) {
        super(driver);
        setPageURL("/python/");
        open();
    }

    public String getWord(){
        return findWord.getText();
    }

}
