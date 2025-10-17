package aula_08_pratica;

import java.util.ArrayList;

public class PlanoTratamento {
    private Atendimento a;
    ArrayList<Atendimento> atendimentos;

    public PlanoTratamento(){

    } 
    
    public void adicionarAendimento(Atendimento a){
        atendimentos.add(a);
    }

    public int calculaTempoTotal(){
        int tempoTotal = 0;
        for (Atendimento atendimento : atendimentos){
            tempoTotal += atendimento.calculaTempo();
        }
        return tempoTotal;
    }

    public int calculaCustoTotal(){
        int custoTotal = 0;
        for (Atendimento atendimento : atendimentos){
            custoTotal += atendimento.calculaCusto();
        }
        return custoTotal;
    }
}
