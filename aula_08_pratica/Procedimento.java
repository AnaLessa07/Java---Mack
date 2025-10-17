package aula_08_pratica;

public class Procedimento {
    private String nome;
    private int duracaoMinutos;
    private double precoPorSessao;

    public Procedimento(String nome, int duracao, double precoPorSessao){
        this.nome = nome;
        this.duracaoMinutos = duracao;
        this.precoPorSessao = precoPorSessao;
    }

    public int getDuracaoMinutos(){
        return this.duracaoMinutos;
    }
    public double getPrecoPorSessao(){
        return this.precoPorSessao;
    }
}
