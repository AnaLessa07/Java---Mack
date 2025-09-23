package aula_05_teorica;

import java.util.Scanner;

public class Exer01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        double a = entrada.nextInt();
        double b = entrada.nextInt();

        double some = somar(a,b);
        System.out.println("A soma de " + a + " + " + b + " é de: " + some);

        double subt = sub(a,b);
        System.out.println("A subtracao de " + a + " + " + b + " é de: " + subt);

        double multi = mult(a,b);
        System.out.println("A multiplicacao de " + a + " + " + b + " é de: " + multi);

        double div = dividir(a,b);
        System.out.println("A divisao de " + a + " + " + b + " é de: " + div);

        entrada.close();
    }

    public static double somar(double num, double num2) {
        return num + num2;
    }
    public static double sub(double num, double num2) {
        return num - num2;
    }
    public static double mult(double num, double num2) {
        return num * num2;
    }
    public static double dividir(double num, double num2) {
        if (num2 == 0){
            System.out.println("Não é possível dividir por zero!");
            return 0;
        } else{
            return num / num2;
        }
    } 
}
