import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o preco do produto? ");
        double preco = entrada.nextDouble();
        double desconto = preco * 0.15;
        double precoFinal = preco - desconto;

        System.out.printf("PRECO ORIGINAL: %.2f\n", preco);
        System.out.printf("Desconto de 15%% do produto: %.2f\n", desconto);
        System.out.printf("Preco final: %.2f", precoFinal);

        entrada.close();
    }
}
