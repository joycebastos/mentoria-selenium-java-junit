package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage { //esta classe contem todos metodos que interagem com os elementos HTML que se encontram na pagina inicial

    WebDriver driver;

    public HomePage( WebDriver driver){
        this.driver=driver;
    }


    public void clicaNoBotaoAssociase() {
        driver.findElement(By.linkText("Associe-se")).click();
    }
}
