import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");
        int quantidade = entrada.nextInt();
        System.out.println("Digite o preco do produto: ");
        float preco = entrada.nextFloat();

        float total = quantidade*preco;

        System.out.println("\n Nota Fiscal");
        System.out.println("\n Quantid: " +quantidade);
        System.out.println("\n preco: " +preco);
        System.out.println("\n total: " +total);

        entrada.close();
    }

}