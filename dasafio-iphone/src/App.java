import aparelho.AparelhoTelefonico;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Iphone");

        AparelhoTelefonico iphone = new AparelhoTelefonico("2231", "Iphone 13", "nullAzul");
        iphone.getInfo();
        iphone.fazerLigacao("4002-8922");
        iphone.receberLigacao();

    }
}
