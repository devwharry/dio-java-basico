package edu.harry.primeirasemana;
public class BoletimEstundantil {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA FINAL");
        else
            System.out.println("APROVADO");
    }
}
