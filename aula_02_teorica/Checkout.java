package aula_02_teorica;
import java.util.Scanner;

public class Checkout {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o valor da sua diaria: ");
        double diaria = entrada.nextDouble();
        System.out.println("Quantas noites ficou na nossa estadia: ");
        double noite = entrada.nextDouble();
        System.out.println("Quantas pessoas ficou na nossa estadia: ");
        double pessoas = entrada.nextDouble();

        double subtotal = diaria * noite;
        double taxa = subtotal * 0.10;
        double totalComTaxa = (subtotal - taxa) + subtotal;
        double frigobar = 132.00;
        double totalBruto = totalComTaxa + frigobar;
        double descontoDeBoasVindas = totalBruto - 50.00;
        double hospede = descontoDeBoasVindas / pessoas;
        
        entrada.close();

        String linha = "-".repeat(80);
        System.out.printf(linha);
        System.out.printf("\n%-28s DETALHAMENTO DA CONTA %30s\n", "|", "|");
        System.out.printf(linha);
        System.out.printf("%-70s R$ %5.2f\n", "\nValor da diaria:", diaria);
        System.out.printf("%-70s %3.0f\n","Noites da estadia:", noite);
        System.out.printf("%-69s R$ %5.2f\n", "Subtotal das diárias (" + noite + " x R$ " + diaria + "):", subtotal);
        System.out.println("\n");
        System.out.printf("%-69s R$ %5.2f\n", "Taxa de Serviço (10% sobre diarias):", taxa);
        System.out.printf("%-69s R$ %5.2f\n", "Por pessoa ("+ pessoas +" pessoaas):", hospede);
        

        


    }
}
