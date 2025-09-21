package aula_03_teorica;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite os lados do su trinagulo: ");
        int l1 = entrada.nextInt();
        int l2 = entrada.nextInt();
        int l3 = entrada.nextInt();

        if (l1 + l2 > l3 || l1 + l3 > l2 || l3 + l2 > l1){
            if (l1 == l2 && l2 == l3 && l1 == l3){
                System.out.println("Seu trinagulo é Equilátero");
            } else if (l1 == l2 || l2 == l3 || l1 == l3){
                System.out.println(" Isósceles");
            } else{
                System.out.println(" Escaleno");
            }

        }else{
            System.out.println("NAO E UM TRINAGULO");
        }
        entrada.close();
    }  
}
