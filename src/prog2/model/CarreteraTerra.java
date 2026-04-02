package prog2.model;

public class CarreteraTerra extends AccesTerra{
    // atributs
    private double amplada;

    // constructor
    public CarreteraTerra(String id, boolean estat, float longitud, double amplada) {
        super(id, estat, longitud);
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
