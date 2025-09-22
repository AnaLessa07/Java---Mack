import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra = "JAVA";
        String mostrarPalavra = "____";
        int tentativas = 6;

        while (tentativas > 0 && !mostrarPalavra.equals(palavra)) {
            System.out.println("Estado atual: " + mostrarPalavra);
            System.out.print("Digite uma letra: ");
            String letra = entrada.nextLine();

            char[] mostrarArray = mostrarPalavra.toCharArray();
            boolean acertou = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra.charAt(0)) {
                    mostrarArray[i] = letra.charAt(0);
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
            }

            mostrarPalavra = new String(mostrarArray);
        }

    }
}
