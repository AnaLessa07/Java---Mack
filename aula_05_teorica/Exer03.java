package aula_05_teorica;

public class Exer03 {
    public static void main(String[] args) {
        double resultado = imc(55.0, 1.70);
        String classes = classificar(resultado);
        System.out.printf("O IMC é: %.2f\n", resultado);
        System.out.println(classes);
    }
    public static double imc(double peso, double altura) {
        return peso / (altura*altura);
    }
    public static String classificar(double imc){
        if (imc < 18.5){
            return "Abaixo do peso";
        } else if (imc < 25){
            return "peso normal";
        } else if ( imc < 30){
            return "Sobrepeso";
        } else{
            return "Obesidade";
        }
    }
}
