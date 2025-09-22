import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = entrada.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Digite uma nota valida de 1 a 10");
            nota = entrada.nextInt();
            if ( nota >= 10){
                System.out.println("nota valida");
            }
        }

    }
}
