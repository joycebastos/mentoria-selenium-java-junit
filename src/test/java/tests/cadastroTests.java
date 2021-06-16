package tests;

import Util.Browser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cadastroTests extends Browser {

    private WebDriver driver;
    private Browser browser = new Browser();

    @Before
    public void setUp() throws Exception {
        driver = browser.firefoxBrowsing();
        driver.manage().deleteAllCookies();
    }


    @Test
    public void abreBrowser(){
        driver.get("http://automationpractice.com");

    }
    @After
    public void fechaBrowser() {
        driver.quit();
    }

}