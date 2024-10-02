import org.xml.sax.SAXNotRecognizedException;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);




        System.out.println("Seu login (APENAS CARACTÉRES) : ");
        String login = leia.nextLine();
        System.out.println("Sua senha (APENAS NÚMEROS); ");
        String senha = leia.next();

        if (login == "Lucas" && senha== "025228"){
            System.out.println("Logado com sucesso,");
        }else {
            System.out.println("Usuário ou senha incorretos.");
        }





    }
}
