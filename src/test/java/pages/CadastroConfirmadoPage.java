package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroConfirmadoPage extends BasePage{

    public CadastroConfirmadoPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public String mensagemCadastroSucesso(){
        return driver.findElement(By.id("notice")).getText();
    }


}
