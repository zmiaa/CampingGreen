package prog2.model;

public class CarreteraAsfalt extends AccesAsfalt {
    // atributs
    private double pesMax;

    // constructor
    public CarreteraAsfalt(String id, boolean estat, double metres, double pesMax) {
        super(id, estat, metres);
        this.pesMax = pesMax;
    }

    @Override
    public boolean isAccessibilitat() {
        return true;
    }

    // setters i getters
    public double getPesMax() {
        return pesMax;
    }

    public void setPesMax(double pesMax) {
        this.pesMax = pesMax;
    }
}
