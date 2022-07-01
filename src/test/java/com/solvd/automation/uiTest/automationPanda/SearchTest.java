package com.solvd.automation.uiTest.automationPanda;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest implements IAbstractTest {

    @Test(description = "Search the word 'BOOKS' in the homepage")
    public void search() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickSearchButton();
        homePage.searchWord();
        Assert.assertEquals(homePage.getWord(), "BOOKS");
    }

    @Test(description = "Open a book review from book page")
    public void booksPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.go2BooksPage();
        BooksPage booksPage = new BooksPage(getDriver());
        booksPage.clickBookReviewLink();
        BookReviewPage bookReviewPage = new BookReviewPage(getDriver());
        Assert.assertTrue(bookReviewPage.isPageOpened());
    }

    @Test(description = "Open the Python section")
    public void pythonSection() {
        HomePage homePage = new HomePage(getDriver());
        homePage.go2PythonPage();
        PythonPage pythonPage = new PythonPage(getDriver());
        Assert.assertEquals(pythonPage.getWord(),"PYTHON");
    }

}
