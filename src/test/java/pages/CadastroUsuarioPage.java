package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroUsuarioPage extends BasePage {

    public CadastroUsuarioPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    public CadastroUsuarioPage infomarUsuario(String nome) {
        aguardaCarregarElemento(By.id("user_name")).sendKeys(nome);

        //driver.findElement(By.id("user_name")).sendKeys(nome);
        return this;
    }

    public CadastroUsuarioPage infomarUltimoNome(String ultimoNome){
        driver.findElement(By.id("user_lastname")).sendKeys(ultimoNome);
        return this;
    }
    public CadastroUsuarioPage informaEmail(String email){
        driver.findElement(By.id("user_email")).sendKeys(email);
        return this;
    }
    public CadastroUsuarioPage informaEndereco(String endereco){
        driver.findElement(By.id("user_address")).sendKeys("Av. Afonso Pena, 4000");
        return this;
    }

    public CadastroConfirmadoPage clicaCriar(){
        driver.findElement(By.name("commit")).click();
        return new CadastroConfirmadoPage(driver);
    }

    public CadastroConfirmadoPage CadastroConfirmadoPageComParametros(String primeiroNome, String ultimoNome, String email, String endereco){
        infomarUsuario(primeiroNome);
        infomarUltimoNome(ultimoNome);
        informaEmail(email);
        informaEndereco(endereco);
        return clicaCriar();
    }
}
