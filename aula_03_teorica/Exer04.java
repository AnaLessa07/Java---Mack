import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da sua conta: ");
        int valor = entrada.nextInt();

        String status = (valor > 0) ? "Positivo" : (valor < 0) ? "Negativo" : "Zerado";

        System.out.println("SALDO É: " + status);
    }
}
