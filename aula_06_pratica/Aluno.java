
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    double media = 0;

    public Aluno (String nome){
        this.nome = nome;
    }

    public Aluno (String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia(){
        this.media = (nota1 + nota2) / 2; 
    }
    
}


