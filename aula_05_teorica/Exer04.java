package aula_05_teorica;

public class Exer04 {
    public static void main(String[] args) {
        int [] soma = {1, 2, 3, 4, 5};
        int [] media = {1, 2, 3, 4, 5};
        int [] maior = {1, 2, 3, 4, 5};
        int [] menor = {1, 2, 3, 4, 5};

        int some = somar(soma);
        int mediaa = mediaArit(media);
        int maiorr = buscarMaior(maior);
        int menorr = buscarMenor(menor);

        System.out.println(some);
        System.out.println(mediaa);
        System.out.println(maiorr);
        System.out.println(menorr);

    }
    public static int somar(int [] soma) {
        int total = 0;
        for ( int i = 0; i<soma.length; i++){
            total += soma[i];
        }
        return total;
    }
    public static int mediaArit(int [] media) {
        int total = 0;
        for ( int i = 0; i<media.length; i++){
            total += media[i];
        }
        return total / media.length;
    }
    public static int buscarMaior(int [] maior) {
        int maiorzinho = maior[0];
        for ( int i = 0; i<maior.length; i++){
            if (maior[i] > maiorzinho){
                maiorzinho = maior[i];
            }
        }
        return maiorzinho;
    }
    public static int buscarMenor(int [] menor) {
        int menorzinho = menor[0];
        for ( int i = 0; i<menor.length; i++){
            if (menor[i] < menorzinho){
                menorzinho = menor[i];
            }
        }
        return menorzinho;
    }
}
