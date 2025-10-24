public class FuncionarioComissionado extends Funcionario {
    private double percentual;
    private double totalVenda;

    public FuncionarioComissionado (String nome, double salario, double percentual,double totalVendas){
        super(nome, salario);
        this.percentual = percentual;
        this.totalVenda = totalVendas;
    }
    @Override
    public double calculaProventos(){
        return ((percentual/100)* totalVenda) + salario;
    }
}
