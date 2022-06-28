package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

public class SearchTest implements IAbstractTest{
    @Test()
    public void search(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSearchButton();
    }
}
