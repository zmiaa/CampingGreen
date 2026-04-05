package prog2.model;

public class CarreteraAsfaltada extends AccesAsfalt {
    // atributs
    private double pesMax;

    // constructor
    public CarreteraAsfaltada(String id, boolean estat, double metres, double pesMax) {
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

    @Override
    public String toString() {
        return "CarreteraAsfaltada{" +
                "pesMax=" + pesMax +
                '}';
    }
}
