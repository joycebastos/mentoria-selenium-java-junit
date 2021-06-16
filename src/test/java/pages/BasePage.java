package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitFindElement(By elemento) {
        WebDriverWait aguardar = new WebDriverWait(driver, 30);
        aguardar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public WebElement aguardaCarregarElemento(By elemento) {
        waitFindElement(elemento);
        return this.driver.findElement(elemento);
    }

}
