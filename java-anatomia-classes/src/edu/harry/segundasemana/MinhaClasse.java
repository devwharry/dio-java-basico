package edu.harry.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        System.out.println("Jogador cara não olha pra foto!");

        final String BR = "Brasil";
        String nome = "Wendson";
        String sobreNome = "Harry";
        int idade = 25;
        System.out.println(BR +" " + nome +" "+ idade);

        int somarDoisNum = somar(10, 10);
        System.out.println(somarDoisNum);

        String nomePessoa = nomeSobreNome(nome, sobreNome);
        System.out.println(nomePessoa);
    }

    public static int somar (int num1, int num2) {
        int valor = num1 + num2;
        return valor;
    }
    public static String nomeSobreNome (String primeiro, String segundo) {
        return primeiro.concat(" ").concat(segundo);
    }
}
