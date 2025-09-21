package aula_03_teorica;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("\n1 - Expresso - R$ 4,50");
        System.out.println("2 - Capuccino - R$ 6,00");
        System.out.println("3 - Machiatto - R$ 7,50");
        System.out.println("DIGITE DE 1 A 3");

        int opcao = entrada.nextInt();
        System.out.println("quant: ");
        int quant = entrada.nextInt();

        double precoUnitario = 0;
        String produto = "";

        if (opcao == 1){
            precoUnitario = 4.50;
            produto = "Expresso";
        } else if (opcao == 2){
            precoUnitario = 6.00;
            produto = "Capuccino";
        } else if (opcao == 3){
            precoUnitario = 7.50;
            produto = "Machiatto";
        } else {
            System.out.println("Produto nao existe");
            entrada.close();
            return;
        }

        double subtotal = quant*precoUnitario;

        System.out.println("\n--- FORMA DE PAGAMENTO ---");
        System.out.println("\n1 - Débito (10% de desconto)");
        System.out.println("2 - Crédito (5% de desconto)");
        System.out.println("3 - Dinheiro (sem desconto)");
        System.out.println("DIGITE DE 1 A 3");

        int pagamento = entrada.nextInt();

        double desconto = 0;
        String pag = "";

        if (pagamento == 1){
            desconto = subtotal*0.10;
            pag = "Debito";
        } else if ( pagamento == 2){
            desconto = subtotal*0.05;
            pag = "Credito";
        } else if ( pagamento == 3){
            desconto = 0;
            pag = "Dinheiro";
        } else {
            System.out.println("Pagmento invalido");
            entrada.close();
            return;
        }

        double total = subtotal - desconto;

        System.out.println("\n===== RESUMO DO PEDIDO =====");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quant);
        System.out.printf("Subtotal: R$ %.2f\n", subtotal);
        System.out.printf("Forma de Pagamento: %s\n", pag);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total a Pagar: R$ %.2f\n", total);


    }
}
