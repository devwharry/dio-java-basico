public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando para o canal " + novoCanal);
    }

    public int aumentaVolume() {
        return volume ++;
    }
    public int diminuirVolume() {
        return volume --;
    }
}