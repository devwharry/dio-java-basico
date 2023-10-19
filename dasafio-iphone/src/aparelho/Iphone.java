package aparelho;
// IPhone.java
public class Iphone {
    private String numeroSerie;
    private String modelo;
    private String cor;

    public Iphone(String numeroSerie, String modelo, String cor) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    // Getters e setters para numeroSerie, modelo e cor
    
    public String getInfo() {
        return "Número de Série: " + numeroSerie + ", Modelo: " + modelo + ", Cor: " + cor;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}