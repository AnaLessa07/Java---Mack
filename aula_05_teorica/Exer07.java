package aula_05_teorica;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        String senha1 = "senha123"; // fraca
        String senha2 = "Senha123"; // media
        String senha3 = "Forte1234"; // forte

        System.out.println(senha1 + " é forte? " + isSenhaForte(senha1));
        System.out.println(senha2 + " é forte? " + isSenhaForte(senha2));
        System.out.println(senha3 + " é forte? " + isSenhaForte(senha3));
    }
    public static boolean isSenhaForte(String senha){
        if (senha.length() < 8){
            return false;
        }
        if (!contemMaiuscula(senha)){
            return false;
        }
        if (!contemMinuscula(senha)){
            return false;
        }
        if (!contemNumero(senha)){
            return false;
        } 
        return true;
    }
    public static boolean contemMaiuscula(String senha){
        for (int i = 0; i < senha.length(); ++i){
            if (Character.isUpperCase((senha.charAt(i)))){
                return true;
            }
        }
        return false;
    }
    public static boolean contemMinuscula(String senha){
        for (int i = 0; i < senha.length(); ++i){
            if (Character.isLowerCase((senha.charAt(i)))){
                return true;
            }
        }
        return false;
    }
    public static boolean contemNumero(String senha){
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
