package aula_04_teorica;

public class Exer03 {
    public static void main(String[] args) {
        int [] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int menor = valores[0];
        int maior =valores[0];

        for (int i = 0; i <valores.length; i++){
            if (valores[i] < menor){
                menor = valores[i];
            } else if ( valores[i] > maior){
                maior = valores[i];
            }
        }
         System.out.println(menor);
        System.out.println(maior);
    }
}
