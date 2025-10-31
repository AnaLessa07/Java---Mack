public class PessoaFisica extends Contribuinte {

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        double renda = getRenda();
        double imposto = 0;
  

        if (renda <= 1500) {
            imposto = 0.0;
        } else if (renda >= 1501 && renda <= 3000) {
            imposto = renda * 0.075;
            imposto -= 100;
        } else {
            imposto = renda * 0.15;
            imposto -= 225;
        }
        return imposto;
    }
    
}
