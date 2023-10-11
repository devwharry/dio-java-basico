import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		double numero1 = terminal.nextDouble();
        
		System.out.println("Digite o segundo parâmetro");
		double numero2 = terminal.nextDouble();
        terminal.close();

        try {

            if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (double i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
