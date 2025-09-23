package aula_04_teorica;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [] valores = new int[8];
        int [] valoresInversos = new int[8];

        for (int i =0; i < valores.length; i++){
            System.out.println("Digite valores: ");
            int num = entrada.nextInt();

            valores[i] = num;
        }

        for (int i = 0, j = valores.length -1; i < valores.length; i++, j--){
            valoresInversos[i] = valores[j];
        }

        for (int i = 0; i < valoresInversos.length; i++){
            System.out.println(valoresInversos[i]);
        }
    }
}
