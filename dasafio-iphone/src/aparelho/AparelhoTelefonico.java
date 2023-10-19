package aparelho;
public class AparelhoTelefonico extends Iphone {
    
    public AparelhoTelefonico(String numeroSerie, String modelo, String cor) {
        super(numeroSerie, modelo, cor);
    }

    public void fazerLigacao(String numero) {
        // Implementação para fazer uma ligação
        System.out.println("fazendo uma ligação!");
    }
    
    public void receberLigacao() {
        // Implementação para receber uma ligação
        System.out.println("recebendo uma ligação!");
    }
}