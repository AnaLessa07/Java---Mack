public class TestteAluno{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana");
        Aluno aluno2 = new Aluno("ana", 3.69, 9);

        System.out.printf(aluno2.calcularMedia());
        

    }
}