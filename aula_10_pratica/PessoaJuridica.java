public class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, double renda){
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        double renda = getRenda();
        return renda * 0.10;
    }
}
