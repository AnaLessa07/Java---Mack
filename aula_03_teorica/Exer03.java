import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valoor que vc quer sacar?");
        int valor = entrada.nextInt();

        int nota200 = 0, nota100 = 0, nota50 =0, nota20 = 0, nota10 = 0, nota5=0;

        if (valor % 5 != 0){
            System.out.println("Digite um valor valido");
        } else {
            nota200 = valor / 200;
            valor %= 200;

            nota100 = valor / 100;
            valor %= 100;

            nota50 = valor / 50;
            valor %= 50;
             
            nota20 = valor / 20;
            valor %= 20;

            nota10 = valor / 10;
            valor %= 10;

            nota5 = valor / 5;
            valor %= 5;
        }

        System.out.println("Nota de 200: " + nota200);
        System.out.println("Nota de 100: " + nota100);
        System.out.println("Nota de 50: " + nota50);
        System.out.println("Nota de 20: " + nota20);
        System.out.println("Nota de 10: " + nota10);
        System.out.println("Nota de 5: " + nota5);

        entrada.close();
    }
}
