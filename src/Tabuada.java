import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Qual tabuada vc quer ver? ");
        int tab = leia.nextInt();

        for (int i = 10 ; i > 1 ; i--){

            int soma = tab * i ;
            System.out.println( soma + ": " + i);
        }
    }

}
