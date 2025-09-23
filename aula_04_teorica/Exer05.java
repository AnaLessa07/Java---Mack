package aula_04_teorica;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma = 0;
        int soma1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("digite");
                int num = entrada.nextInt();

                matriz[i][j] = num; // armazeno o num na matriz

                if (i == j) {
                    soma += num;
                }else if (i + j == matriz.length - 1){
                    soma1 += num;
                }
                
            }

        }
        System.out.println("Soma da diagonal principal: " + soma);
        System.out.println("Soma da diagonal secundaria: " + soma1);
    }
}
