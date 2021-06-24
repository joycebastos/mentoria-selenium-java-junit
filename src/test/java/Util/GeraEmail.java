package Util;

import java.util.concurrent.ThreadLocalRandom;


public class GeraEmail {
    private static String email;

    public  String geraEmail() {
        if (GeraEmail.email == null) {

            // letras maisculas 65 - 90
            // letras minúsculas 97 - 122

            ThreadLocalRandom gerador = ThreadLocalRandom.current();

            int tamanhoNome = gerador.nextInt(3, 10);
            int tamanhoSobrenome = gerador.nextInt(3, 10);

            char primeiraLetraNome = (char) gerador.nextInt(65, 90);
            char primeiraLetraSobreNome = (char) gerador.nextInt(65, 90);

            StringBuilder nome = new StringBuilder().append(primeiraLetraNome);
            StringBuilder sobreNome = new StringBuilder().append(primeiraLetraNome);


            for (int i = 1; i < tamanhoNome; i++) {
                char letra = (char) gerador.nextInt(97, 122);
                nome.append(letra);
            }

            for (int i = 1; i < tamanhoSobrenome; i++) {
                char letra = (char) gerador.nextInt(97, 122);
                sobreNome.append(letra);
            }
            email = nome  + "@gmail.com";

        }
        return email;
    }
}