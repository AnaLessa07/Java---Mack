public class Programa {
    public static void main(String[] args) {
        Contribuinte pf = new PessoaFisica("Gabriela", 1200.0);
        Contribuinte pf2 = new PessoaFisica("Ana", 2900.0);
        Contribuinte pj = new PessoaJuridica("LE VOU", 10000.0);

        Contribuintes lista = new Contribuintes();
        lista.adicionarContribuinte(pf);
        lista.adicionarContribuinte(pj);
        lista.adicionarContribuinte(pf2);

        lista.apresentarContribuintes();
    }
}
