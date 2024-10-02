import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade , idade2 , soma;








        System.out.println("Escreva sua idade; ");
        idade = leia.nextInt();
        System.out.println("Escreva a idade da sua mâe: ");
        idade2 = leia.nextInt();



        soma = (idade2 - idade) ;

        System.out.println("Minha mâe é "+ soma  +" anos mais velha que eu:");
    }
}



