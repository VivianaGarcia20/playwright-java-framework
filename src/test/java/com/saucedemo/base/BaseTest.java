package com.saucedemo.base;

import com.microsoft.playwright.Page;
import com.saucedemo.factory.PlaywrightFactory;
import com.saucedemo.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected PlaywrightFactory playwrightFactory;
    protected Page page;
    protected HomePage homePage;

    protected String isMobile = System.getProperty("isMobile", "false");

    @BeforeEach
    public void setUp() {
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.initPage(isMobile);
        homePage = new HomePage(page);
    }

    @AfterEach
    public void tearDown() {
        playwrightFactory.closePage();
    }
}
 