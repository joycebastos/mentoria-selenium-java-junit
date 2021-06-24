package tests;

import Util.Browser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CaixinhaPage;
import pages.HomePage;
import pages.IdentificacaoPage;

public class cadastroCaixinhaTest extends Browser {

   WebDriver driver;
   Browser browser = new Browser();


 @Before
   public void precondição(){
       driver = browser.firefoxBrowsing();// inicia browser firefox
       driver.manage().deleteAllCookies();//deleta os cookies
       driver.get("https://site.taglivros.com/");//Acessa a URL da tag
   }


   @Test
    public void criacaoContaValidaPlanoMensalTest(){ //nome do metodo
     HomePage home = new HomePage(driver); //variavel criada para interagir com todos os métodos da pagina inicial https://site.taglivros.com/
       home.clicaNoBotaoAssociase();
     CaixinhaPage caixinha = new CaixinhaPage(driver); //variável criada para interagir com todos os metodos da página https://taglivros.com/associe-se/escolha-sua-caixinha
       String textoEtapaUm =  driver.findElement(By.xpath("//*[@id=\"caixinha\"]/p")).getText();
       Assert.assertEquals("Caixinha",textoEtapaUm); //Comparar os textos na etapa um chamada Caixinha
       caixinha.clicarNoBotaoPlanoAnual();// variavel que chama o metodo clicar no botão dde Plano Anual
    IdentificacaoPage identificacao = new IdentificacaoPage(driver);
       identificacao.preencherCampoEmail();//variavel que chama o metodo que preenche o campo email
   }

    @After
    public void close() {

     driver.quit(); //ação que fecha o browser após a execução de cada @test
    }
}
