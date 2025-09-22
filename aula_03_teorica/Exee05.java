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

        switch (local) {
            case 1 -> if( local == "SP" || "RJ")
                
                break;
        
            default:
                break;
        }

        


    }
}
