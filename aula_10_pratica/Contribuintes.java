import java.util.ArrayList;

public class Contribuintes {
    ArrayList<Contribuinte> contribuintes;

    public Contribuintes() {
        this.contribuintes = new ArrayList<>();
    }

    public void adicionarContribuinte(Contribuinte c) {
        contribuintes.add(c);
    }

    public void apresentarContribuintes(){
        for (Contribuinte contribuinte : contribuintes){
            System.out.println("Nome: " + contribuinte.getNome());
            System.out.println("Renda: " + contribuinte.getRenda());
            System.out.println("Imposto devido: " + contribuinte.calculaImposto());
        }
    }
}
