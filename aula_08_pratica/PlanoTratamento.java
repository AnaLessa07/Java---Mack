import java.util.ArrayList;

public class PlanoTratamento {
    private Atendimento a;
    ArrayList<Atendimento> atendimentos;

    public PlanoTratamento(){
        this.atendimentos = new ArrayList<>();
    } 
    
    public void adicionarAtendimento(Atendimento a){
        atendimentos.add(a);
    }

    public int calculaTempoTotal(){
        int tempoTotal = 0;
        for (Atendimento atendimento : atendimentos){
            tempoTotal += atendimento.calculaTempo();
        }
        return tempoTotal;
    }

    public double calculaCustoTotal(){
        double custoTotal = 0;
        for (Atendimento atendimento : atendimentos){
            custoTotal += atendimento.calculaCusto();
        }
        return custoTotal;
    }
}
