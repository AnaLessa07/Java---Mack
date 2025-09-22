import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int soma = 0;

        while (numero > 0){
            int resto = numero % 10;
            soma += resto;
            numero = numero / 10;
        }

        System.out.println(soma);
    }
}
