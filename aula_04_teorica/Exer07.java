package aula_04_teorica;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] xadrez = new int [8][8];

        int total = 0;
        int grao = 1;

        for (int i = 0; i < xadrez.length; i++){
            for (int j = 0; j < xadrez[i].length; j++){
                xadrez[i][j] = grao;
                total += grao;
                grao *= 2;
            }
        }
        System.out.println("Quantidade: " + total);

        System.out.println("DIGITE UM NUMERO DE 0 A 7 linha:");
        int linha = entrada.nextInt();
        System.out.println("DIGITE UM NUMERO DE 0 A 7 coluna:");
        int coluna = entrada.nextInt();
        System.out.printf("Graos da linha %d e da coluna %d é: ", linha, coluna);
        System.out.println(xadrez[linha][coluna]);
    }
}
