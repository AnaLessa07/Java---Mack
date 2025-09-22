package aula_04_teorica;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       String [] dias = new String[7];

       for (int i = 0; i < dias.length; i++ ){
            System.out.println("Digite um os dias em seguncia: ");
            String semana = entrada.nextLine();

            dias[i] = semana;
       }

       System.out.println("dias da semana: ");
       for (int i = 0; i<dias.length; i++){
            System.out.println(dias[i]);
       }
    }
}
