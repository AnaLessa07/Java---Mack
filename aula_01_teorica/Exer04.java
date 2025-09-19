import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite suas nota(n1, n2 e n3):");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();

        double media = (n1+n2+n3)/3;

        System.err.printf("media: %.2f\n", media);
        entrada.close();
    }
}
