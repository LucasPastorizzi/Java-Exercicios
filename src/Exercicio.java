import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome ;
        int idade;
        String cidade;

        System.out.println("Escreva seu nome: ");
        nome = leia.nextLine();
        System.out.println("Escreva sua idade; ");
        idade = leia.nextInt();
        System.out.println("Escreva sua cidade de nascimento ");
        cidade = leia.next();

        System.out.println("Ola. Meu nome é "+nome+",sou natural de "+cidade+",tenho "+idade+" anos e sou estudante.");
    }
}
