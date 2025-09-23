package aula_05_teorica;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double n1 = entrada.nextDouble();
        Double n2 = entrada.nextDouble();
        Double n3 = entrada.nextDouble();

        double mediaPond = media(n1, n2, n3);
        String situacao = classificar(mediaPond);
        System.out.println(situacao);
        formatar(mediaPond);

    }
    public static double media(double a, double b, double c) {
        return (((a*2)+(b*3)+(c*5))/ (2 + 3 + 5));
    }
    public static String classificar(double media) {
        if (media >= 7){
            return "Aprovado";
        } else if ( media >= 5){
            return "recuperession";
        }else {
            return "Reprovado";
        }
    }
    public static void formatar(double media) {
        System.out.printf("Sua media é: %.2f\n", media);
    }
}