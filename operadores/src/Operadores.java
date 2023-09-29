import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Eu sou jogador caro!");

        String nome = "Harry";
        int idade = 25;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.print("Lista Pessoa ");
        System.out.println(nome +" "+ idade +" "+ sexo +" "+ doadorOrgao +" "+ dataNascimento);
    }
}
