import java.util.ArrayList;

public class Pograma {
    public static void main(String[] args) {
        ListaPontos lista = new ListaPontos();
        Ponto p2 = new Ponto(3, 3);
        lista.adicionarPonto(p2);
        lista.adicionarPonto(new Ponto(3, 8));
        lista.adicionarPonto(new Ponto(4, 8));

        Ponto p1  = new Ponto(1,1);

        Circulo c = new Circulo(p1, 4);
        ArrayList<Ponto> proximos = lista.pontosProximos;
        System.out.println("PONTOS PROXIMOS");
        for (Ponto p : proximos){
            System.out.println(p);
        }
        boolean estaPerto = c.estaContido(p2);

        System.out.printf("Esta perto: %b\n", estaPerto);
    }
    
}
