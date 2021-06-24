package pages;

import Util.GeraEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentificacaoPage {

    WebDriver driver;
    GeraEmail email = new GeraEmail();

    public IdentificacaoPage(WebDriver driver) {
        this.driver=driver;
    }

    public void preencherCampoEmail() {
        driver.findElement(By.id("email")).sendKeys(email.geraEmail());
    }
}
