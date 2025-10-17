public class ClinicaApp {
    public static void main(String[] args) {
        Procedimento p1 = new Procedimento("Drenagem Linfática", 120, 250.00);
        Procedimento p2 = new Procedimento("Laser Depilatório", 60, 100.00);
        Procedimento p3 = new Procedimento("Massagem Modeladora", 55, 145.00);

        PlanoTratamento planoAtual = new PlanoTratamento();

        Atendimento atend1 = new Atendimento(p3, 7);
        Atendimento atend2 = new Atendimento(p1, 10);
        Atendimento atend3 = new Atendimento(p2, 15);

        planoAtual.adicionarAtendimento(atend1);
        planoAtual.adicionarAtendimento(atend2);
        planoAtual.adicionarAtendimento(atend3);
        System.out.println("---------------------------------------");
        System.out.println("--- Detalhes do Plano de Tratamento ---");
        System.out.println("---------------------------------------");

        System.out.printf("Custo Total: R$ %.2f", planoAtual.calculaCustoTotal());
        System.out.printf("\nTempo Total: %d minutos\n", planoAtual.calculaTempoTotal());


    }
}
