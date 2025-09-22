import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int mult = 1;

        for (int i = 1; i <= numero; i++){
            mult *= i;
        }

        System.out.println(mult);

    }
}
