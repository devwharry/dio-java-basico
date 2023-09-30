public class ContaBanco {
    
    String nomeCliente;
    String agencia;
    int numeroConta;
    double saldo;

    public void cliente (String cliente) {
        nomeCliente = cliente;
        System.out.println("Nome do Cliente: " + cliente);
    }
    public void agenciaCli (String agenciaCli) {
        agencia = agenciaCli;
        System.out.println("Numero da Agencia: " + agenciaCli);
    }

    public void numeroUsu (int numeroUsu) {
        numeroConta = numeroUsu;
        System.out.println("Numero do Cliente: " + numeroUsu);
    }

    public void saldoConta (double saldoConta) {
        saldo = saldoConta;
        System.out.println("Saldo inicial: " + saldoConta);
    }

    public void imprimir () {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + saldo);
    }
}
