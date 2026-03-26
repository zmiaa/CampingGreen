package prog2.model;

public class CarreteraTerra extends AccesTerra{
    // atributs
    private double amplada;

    // constructor
    public CarreteraTerra(String id, String nom, int longitud, double amplada) {
        super(id, nom, longitud);
        this.amplada = amplada;
    }

    @Override
    public boolean isAccessibilitat() {
        return true;
    }

    // setters i getters
    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }
}
