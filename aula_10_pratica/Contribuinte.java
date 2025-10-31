public class Contribuinte {
    private String nome;
    private double renda;

    public Contribuinte(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }

    public double calculaImposto() {
        double imposto = 0;
        return imposto;
    }    
}
