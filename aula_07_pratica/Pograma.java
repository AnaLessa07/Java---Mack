public class Pograma {
    public static void main(String[] args) {
        Ponto p1  = new Ponto(1,1);
        Ponto p2 = new Ponto(3, 3);
        Circulo c = new Circulo(p1, 4);
        boolean estaPerto = c.estaContido(p2);

        System.out.printf("Esta perto: %b\n", estaPerto);
    }
    
}
