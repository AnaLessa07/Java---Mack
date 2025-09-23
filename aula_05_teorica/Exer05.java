package aula_05_teorica;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();

    }

    public static String normalizarNome(String nome) {
        // deixa minusculo e tira espacoes a mais
        String resultado = "";
        boolean novaPalavra = true; // indica se a próxima letra é início de palavra

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);

            if (c == ' ') {
                // só adiciona espaço se o último caractere não for espaço
                if (!resultado.endsWith(" ")) {
                    resultado += c;
                }
                novaPalavra = true; // próxima letra começa nova palavra
            } else {
                if (novaPalavra) {
                    resultado += Character.toUpperCase(c);
                    novaPalavra = false;
                } else {
                    resultado += c;
                }
            }
        } 
        return resultado;
    }    
}
