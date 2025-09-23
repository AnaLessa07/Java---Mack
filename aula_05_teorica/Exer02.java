package aula_05_teorica;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();

        gerarTabuada(a);


    }

    public static void gerarTabuada(double num) {
        for (int i = 1; i < 11; i++){
            System.out.println(+ num + " x " + i + " = " +(i*num));
        }
    }
}
