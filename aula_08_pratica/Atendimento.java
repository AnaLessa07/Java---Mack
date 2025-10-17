public class Atendimento {
    private Procedimento p;
    private int quantidade;

    public Atendimento(Procedimento p, int qtde){
        this.p = p;
        this.quantidade = qtde;

    }

    public int calculaTempo(){
        return p.getDuracaoMinutos() * quantidade;
    }
    public double calculaCusto(){
        return p.getPrecoPorSessao() * quantidade;
    }
}
