import java.util.Scanner;

public class Exee05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println(
          "Tabela de Fretes:\n" +
          "• SP, RJ: R$ 15,50\n" +
          "• MG, ES: R$ 18,00\n" +
          "• PR, SC, RS: R$ 25,75\n" +
          "• BA, SE, AL, PE: R$ 35,20\n" +
          "• Qualquer outro estado: R$ 50,00 (frete padrão para outras regiões).\n"
        );

        System.out.println("Digite o local que quer ir: ");
        String local = entrada.nextLine();

        double resultado = switch (local) {
            case "SP", "RJ" -> 15.50;
            case "MG", "ES" -> 18.00;
            case "PR", "SC", "RS" -> 27.75;
            case "BA", "SE", "AL", "PE" -> 35.20;
            default -> 50.00;
        };

        System.out.println(resultado);
    }
}
