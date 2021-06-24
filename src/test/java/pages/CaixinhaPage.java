package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CaixinhaPage { //esta classe contem todos os métodos que interagem com a pagina https://taglivros.com/associe-se/escolha-sua-caixinha
    WebDriver driver;

    public CaixinhaPage( WebDriver driver){
        this.driver=driver;
    }


    public void clicarNoBotaoPlanoAnual() {
        driver.findElement(By.id("buttonAnual")).click();
    }
}
